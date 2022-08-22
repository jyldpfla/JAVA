import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

// get 요청으로 보내기
public class Main5 {
	public static void main(String[] args) {
		String apiUrl = "https://httpbin.org/get";
		
		// 요청을 get방식으로 보낼 준비
		OkHttpClient client = new OkHttpClient();
		Request req = new Request.Builder().url(apiUrl).build();
		// Builder : 설정 하나하나를 도와줌, 요청할 때 사용 가능
		
		try (Response resp = client.newCall(req).execute()) { // 요청 보내기
			// response 객체에 code, body 등이 다 담겨있음
			if (resp.code() == 200) {
				System.out.println(resp.body().string()); // 문자열로 parsing
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
