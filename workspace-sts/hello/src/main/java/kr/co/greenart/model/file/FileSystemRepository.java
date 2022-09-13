package kr.co.greenart.model.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public class FileSystemRepository implements FileRepository {
	@Override
	public Resource getByName(String fileName) {
		throw new UnsupportedOperationException("미구현");
	}

	@Override
	public List<String> getAllnames() {
		throw new UnsupportedOperationException("미구현");
	}

	@Override
	public int save(MultipartFile file) {
		// file 형태로 저장
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
