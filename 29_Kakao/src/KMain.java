import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class KMain {
	public static void main(String[] args) {
		//	카카오 개발자
		
		//	53c82959a13c6afb0e7a823e7d719482
		//	https://dapi.kakao.com/v3/search/book
		
		//	Authorization: KakaoAK ${REST_API_KEY}
		
		try {
			String url = "https://dapi.kakao.com/v3/search/book?query=harry";
			URL u = new URL(url);
			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
			
			huc.addRequestProperty("Authorization", "KakaoAK 53c82959a13c6afb0e7a823e7d719482");
			
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			//	json parse
			JSONParser jp = new JSONParser();
			JSONObject kakaoData = (JSONObject) jp.parse(isr);
			System.out.println(kakaoData);
			
			//	제목
			//	출판사
			//	저자
			//	가격
			//	책상태
			
			JSONArray documents = (JSONArray) kakaoData.get("documents");
			
			for (int i = 0; i < documents.size(); i++) {
				JSONObject book = (JSONObject) documents.get(i);
				
				System.out.println("title : " + book.get("title"));
				System.out.println("publisher : " + book.get("publisher"));

				JSONArray authors = (JSONArray) book.get("authors");
				System.out.print("authors : ");
				for (int j = 0; j < authors.size(); j++) {
					String author = (String) authors.get(j);
					System.out.print(author);
					
					if (authors.size() == 1 || authors.size() - 1 == j) {
					} else {
						System.out.print(", ");						
					}
				}
				
				System.out.println("\nprice : " + book.get("price"));
				System.out.println("status : " + book.get("status"));
				System.out.println("------------------------------------------");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
