import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

public class WMain {
	public static void main(String[] args) {
		
		//	open API
		
		//	날씨 데이터를 얻어서 그걸 보여주고 싶음
		//	seoul ->  11도 tokyo -> 15도
		
		//	f62f3621fd81249f8fd3a48d36725d0e	//	내껀 왜 안되;;
		//	https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
		
		
		//	https://api.openweathermap.org/data/2.5/weather?q=tokyo&appid=0adf12afa81124c01ee9e988ff2046e8

		//	위의 주소로 가면 결과 자료를 얻을 수 있음.
		//	자바로 저것을 해서 콘솔에 결과를 출력할 수 있게.

		Scanner sc = new Scanner(System.in);
		System.out.print("city: ");
		String city = sc.next();
		
		String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=0adf12afa81124c01ee9e988ff2046e8&units=metric";
		
		try {
			URL ur = new URL(url);
			HttpsURLConnection huc = (HttpsURLConnection) ur.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			//	넷상에서 자료를 주고 받을 때, 약속된 문법이 있다면 편할것임. -> xml, json
			//	json (JavaScript Object Notation) 값이나 객체를 나타내주는 범용 포맷
			
			//	json parse
			
			//	json library (도구)
			//	mvnrepository -> json-simple.jar 다운
			//	build path -> libs -> external 추가
			
			//	parsing하기 위해 parser객체 생성
			JSONParser jp = new JSONParser();
			JSONObject weatherDate = (JSONObject) jp.parse(isr);
//			System.out.println(weatherDate);
			
			//	JavaScript에서
			//	{} 객체
			//	[] 배열

			//	country
			JSONObject weaSys = (JSONObject) weatherDate.get("sys");
			System.out.println(weaSys.get("country"));

			//	city
			System.out.println(weatherDate.get("name"));
			
			//	description
			JSONArray weaArr = (JSONArray) weatherDate.get("weather");
			JSONObject weaObj = (JSONObject) weaArr.get(0);
			
			System.out.println(weaObj.get("description"));
			
			//	temp
			JSONObject weaMain = (JSONObject) weatherDate.get("main");
			System.out.println(weaMain.get("temp"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
