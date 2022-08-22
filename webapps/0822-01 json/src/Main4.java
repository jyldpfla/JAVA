import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

// json을 이용해 post형식으로 요청 보내기
public class Main4 {
	public static void main(String[] args) throws MalformedURLException {
		String apiURL = "https://httpbin.org/post";
		URL url = new URL(apiURL);
		HttpURLConnection conn = null;
		try {
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST"); // 요청 방식 설정
	////////요청 header 설정 - json 포맷을 전달 받으면 header 정보에 담아서 body 내용이 json임을 알려줄 것임!
			conn.setRequestProperty("Content-Type", "application/json; charset=utf-8"); // 요청을 보내는게 json
			// get일 때는 필요 x
			conn.setRequestProperty("Accept", "application/json"); // 받고자하는 포맷도 json임을 알림
			conn.setDoOutput(true); // body에 뭔가를 출력하고자 할 때
			
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(new Person("홍길동", 22));
			
			byte[] body = json.getBytes();
			
			conn.getOutputStream().write(body, 0, body.length);

			if (conn.getResponseCode() == 200) {
				System.out.println(readBody(conn.getInputStream()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
	}
	
	private static String readBody(InputStream inputStream) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		StringBuilder sb = new StringBuilder();
		
		String line;
		while ( (line = br.readLine()) != null ) {
			sb.append(line);
		}
		return sb.toString();
	}
}
