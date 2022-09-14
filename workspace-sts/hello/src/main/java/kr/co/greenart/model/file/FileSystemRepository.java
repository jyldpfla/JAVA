package kr.co.greenart.model.file;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public class FileSystemRepository implements FileRepository {
	// file 형태로 저장
	private final File saveFolder = new File("d:\\temp\\");
	private final Path root = Paths.get("d:\\temp\\");
	
	@Override
	public Resource getByName(String fileName) {
		try {
			return new UrlResource(new File(saveFolder.getAbsolutePath()
					+ File.separatorChar
					+ fileName).toURI());
		} catch (MalformedURLException e) {
			return null;
		}
	}

	@Override
	public List<String> getAllnames() {
		// 파일 가져오기1
		File[] filearr = saveFolder.listFiles(new FileFilter() {
		//listFiles : file 배열을 반환, 폴더 안의 폴더도 반환해줌
		//FileFilter : 원하는 파일만 가져올 수 있음
			@Override
			public boolean accept(File pathname) {
				return !pathname.isDirectory(); // directory가 아닌 것들을 return값으로 돌려줌
			}
		});
		List<String> list = new ArrayList<>();
		for (File f : filearr) {
			list.add(f.getName());
		}
		return list;
		
		// listFiles로 filter없이 for문으로 파일 선택해서 가져오기2
//		List<File> list = new ArrayList<>();
//		for (File f : filearr) {
//			if(!f.isDirectory()) {
//				list.add(f);
//			}
//		}
		
		// 지금 수업하는거 x, 맛보기
//		try {
//			return Files.walk(root,1)
//					.filter(t -> !t.equals(root))
//					.filter(x -> !x.equals(this.root))
//					.filter(x -> !Files.isDirectory(x))
//					.map(y -> y.toString())
//					.collect(Collectors.toList());
//		} catch (IOException e)	{
//			e.printStackTrace();
//		}
		// walk : 해당 path에 있는 목록들을 쭉 가져오도록 하는 메소드, 반환 타입 stream(java 8 ver에서 사용 가능, 아직 안 배움)
		// 1 : root 경로에 있는 1단계의 파일들만 보겠다, 2면 1단계 더 들어감
		// filter : filter를 통해 원하는 파일을 가져올 수 있음
		// filter(x -> !x.equals(this.root)) : 자기 자신도 반환해서 자기 자신 걸러낸 것
		// java 8 ver - 함수를 interface의 형태로 표현(객체로 취급하지 x) 가능 -> '람다식'형태로 표현 
		// map : 전달받은 인자를 함수로 표현할 수 있음
	}

	@Override
	public int save(MultipartFile file) {
		File saveFolder = new File("d:\\temp\\");
		if (!saveFolder.exists()) { // 폴더 없으면
			saveFolder.mkdir(); // 폴더 생성
		}
		try {
			file.transferTo(new File(saveFolder.getAbsolutePath() 
					+ File.separatorChar 
					+ file.getOriginalFilename()));
			// transfer.to(경로) :  저장 경로 설정
			return 1;
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
			return 0;
		}
		
		// path 이용해서 저장
//		Path saveFolder = Paths.get("d:\\");
//		try {
//			if (!Files.exists(saveFolder)) { // 폴더 없으면
//				Files.createDirectories(saveFolder); // 폴더 생성
//			}
//			file.transferTo(saveFolder.resolve(Paths.get(file.getOriginalFilename()).normalize()));
//			return 1;
//		} catch (IOException e) {
//			e.printStackTrace();
//			return 0;
//		} 
	}
}
