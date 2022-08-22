import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import com.example.AppleSearchResult;
import com.fasterxml.jackson.databind.ObjectMapper;

// PostMan에서 key, value값 이용해 검색한 것을 json으로 구현(GET 방식으로 요청 보내기)
public class Main3 {
	public static void main(String[] args) throws UnsupportedEncodingException, MalformedURLException {
//		String apiURL = "http://itunes.apple.com/search?limit=1&term=";
		String apiURL = "http://itunes.apple.com/search?term=";
		// 주소는 우리가 요청을 보내고자 하는 주소
		// limit=1로 parameter 걸어주면 결과 1개로 잘림
		
		// GET방식으로 보내므로 parameter값 주소 뒤에 붙여주면 됨
		String requestURL = apiURL + URLEncoder.encode("아이유", "UTF-8");
		// 한글이라 encoding 필요
		
//////////// GET방식의 요청 보내기
		URL url = new URL(requestURL);
		HttpURLConnection conn = null;
		
		try {
			conn = (HttpURLConnection) url.openConnection(); // 연결할 수 있는 HttpURLConnection을 통해 get 방식으로 전송 가능
			conn.setRequestMethod("GET");
			
			int responseCode = conn.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) { // 200번이면
				// 보낸 요청에 대한 응답이 body에 담겨있으므로 응답 body 살펴보기
				String respBody = readBody(conn.getInputStream());
				System.out.println(respBody); // PostMan의 응답과 같은 결과 console 출력됨
				
				ObjectMapper mapper = new ObjectMapper();
				AppleSearchResult apple = mapper.readValue(respBody, AppleSearchResult.class);
				System.out.println(apple.getResultCount());
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
