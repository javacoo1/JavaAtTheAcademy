import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NMain {
	public static void main(String[] args) {

		// 네이버 개발자 센터
		// open API -> 인증

		// KuI4zc8ClWzmjLCYbiKY
		// BSFNc07vcP

		// https://openapi.naver.com/v1/search/shop.json

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("search : ");
			String user = sc.next();
			user = URLEncoder.encode(user, "utf-8");

			String url = "https://openapi.naver.com/v1/search/shop.json?query=" + user;
//		System.out.println(url);

			URL ur = new URL(url);
			HttpsURLConnection huc = (HttpsURLConnection) ur.openConnection();

			huc.addRequestProperty("X-Naver-Client-Id", "KuI4zc8ClWzmjLCYbiKY");
			huc.addRequestProperty("X-Naver-Client-Secret", "BSFNc07vcP");

			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");

			// json parse (원하는 데이터만 추출)
			JSONParser jp = new JSONParser();

			// javascript
			// {} 객체
			// [] 배열

			JSONObject naverData = (JSONObject) jp.parse(isr);
			System.out.println(naverData);

			// 품명
			// 가격
			// 브랜드

			JSONArray items = (JSONArray) naverData.get("items");

			for (int i = 0; i < items.size(); i++) {
				JSONObject coffee = (JSONObject) items.get(i);
//			String brand = (String) coffee.get("brand");
//			String brand = coffee.get("brand") + "";
				String brand = coffee.get("brand").toString();

				String title = coffee.get("title").toString();
				title = title.replace("<b>", "");
				title = title.replace("</b>", "");

				String lprice = coffee.get("lprice").toString();

				System.out.println("브랜드 : " + brand);
				System.out.println("제품명 : " + title);
				System.out.println("최저가 : " + lprice + "원");
				System.out.println("---------------------------------------------------------");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
