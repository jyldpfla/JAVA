import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main7 {
	private static String getSaraminInfo(String url) throws IOException {
		Document doc = Jsoup.connect(url).timeout(5000).get();
		String info = doc.select("meta[name=description]").first().attr("content"); // meta태그 중 첫 번째, name이 description이고, 속성으로 content를 가지는 것
		// first 안 주면 여러 값을 찾는게 select라서 first를 줌
		return info;
	}
	
	public static void main(String[] args) throws IOException {
		String searchURL = "https://www.saramin.co.kr/zf_user/search?search_area=main&search_done=y&search_optional_item=n&searchType=search&searchword=java";
		String startString = "/zf_user/jobs/relay/view";
		
		Document doc = Jsoup.connect(searchURL).timeout(5000).get();
		// timedout(5000) : 한 번 보내고 응답올 때까지 5초 기다림, 기본적으로 응답 안오면 30초동안 기다림
		Elements links = doc.select("a[href]");
		
		Set<String> set = new HashSet<String>();
		for (Element e : links) {
			String attr = e.attr("href");
			if (attr.startsWith(startString)) {
				set.add("https://www.saramin.co.kr" + attr); // 새로운 주소값 만들기
			}
		}
//		System.out.println(set);
		
//		for (String url : set) {
//			System.out.println(getSaraminInfo(url));
//		}
		
		// 위랑 =, 아직 사용법 안배움
		set.parallelStream().map(url -> {
			try {
				return getSaraminInfo(url);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			return null;
		}).forEach(System.out::println);
	}
}
