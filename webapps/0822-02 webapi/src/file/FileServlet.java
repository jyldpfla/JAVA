package file;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

// 파일 업로드 연습
@WebServlet("/fileupload")
//mutipart를 위한 설정 필요해서 annotation으로
@MultipartConfig(location = "d:\\temp", fileSizeThreshold = 10 * 1024 * 1024
					, maxFileSize = 50 * 1024 * 1024)
// location : 임시 폴더, fileSizeThreshold : 지정한 용량만큼 넘어가면 임시 폴더에 저장, 용량보다 작으면 메모리에서 처리
// maxFileSize : 사용자가 보낼 수 있는 최대 용량
public class FileServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println(req.getContentType());
		Part p = req.getPart("fileupload"); // 이진데이터라서 part
		System.out.println(p.getName()); // 파라미터 이름
		System.out.println(p.getSubmittedFileName()); // 실제 사용자가 올린 파일명
		for (String header : p.getHeaderNames()) {
			System.out.println(header + " : " + p.getHeader(header));
		}
		
		String contextPath = getServletContext().getRealPath("");
		Path directory = Paths.get(contextPath); // 문자열로 된 값 넣어주면 path 객체로 알려줌, path 객체는 files 메소드 쓸 때 사용가능
		Files.copy(p.getInputStream(), directory.resolve(p.getSubmittedFileName()), StandardCopyOption.REPLACE_EXISTING); // 파일 내용을 기록할 스트림과 파일 내용을 저장할 곳 지정해주면 됨
		// copy(복사하고자하는 inputstream 내용, path로 된 경로) / resolve : 이름 붙여주려고
		
		resp.sendRedirect("/" + URLEncoder.encode(p.getSubmittedFileName(), "UTF-8"));
	}
}
