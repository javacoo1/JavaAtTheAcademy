import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class UMain02 {
	public static void main(String[] args) {
		//	시간	/ 날짜	
		Date d = new Date();
		System.out.println(d);	// 현재 정보
		
		// Date -> String
		//	y M d a h m s
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 hh:mm:ss");
		System.out.println(sdf.format(d));
		
		String s = sdf.format(d);
		System.out.println(s);
		
		//	String -> Date
		String s2 = "01/11-21";
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM-yy");
		try {
			Date d2 = sdf2.parse(s2);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//	Date -> SimpleDateFormat으로 형식 조절해서 사용
		//	sdf.format() = Date -> String
		//	sdf.parse()	= String -> Date
		
		//	년-월-일 ex) 2024-10-22
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		String s3 = sdf3.format(d);
		System.out.println(s3);
	
		System.out.println("---------------------");
		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
	
		LocalDateTime time =LocalDateTime.now();
		System.out.println(time);
		
		
		
		
		
		
		
		
		
	}
}
