package kr.co.greenart.model.file;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
@Primary
public class FileDBRepository implements FileRepository {
	@Autowired
	private JdbcTemplate jdbc; // db 작업에 필요한 의존성 주입

	// 하나 가져오기
	@Override
	public Resource getByName(String fileName) {
		byte[] blob = jdbc.queryForObject("SELECT file FROM files WHERE name=?"
				, byte[].class
				, fileName);
		return new ByteArrayResource(blob); // 이진자료 바로 불러올 수 있음
	}
	
	// 목록 가져오기
	@Override
	public List<String> getAllnames() {
		return jdbc.queryForList("SELECT name FROM files", String.class);
	}

	@Override
	public int save(MultipartFile file) {
		try {
			return jdbc.update("INSERT INTO files (name, file) VALUES (?, ?)"
					, file.getOriginalFilename()
					, file.getBytes()); // blob 형태로 넣어줌
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
