package kr.ac.kopo.day13;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarMain {
	
	public static void main(String[] args) {
		
		Calendar cdate = Calendar.getInstance();
		
//		GregorianCalendar grec = (GregorianCalendar) cdate;
		
		System.out.println(cdate.get(Calendar.DATE));
		
	
		int year = cdate.get(Calendar.MONTH) + 1;  // 0 ~ 11
		
		Date okay = cdate.getTime();
		
		System.out.println(okay);
		
		int day = cdate.get(Calendar.DAY_OF_WEEK);  //일(1) ~ 토(7)
		
		String[] dayArr = {"", "일" , "월", "화" ,"수", "목", "금", "토"};
		
		System.out.println("오늘은 "+ dayArr[day] + "입니다.");
		
		cdate.set(2021, 4, 5);
		int breakDay = cdate.get(Calendar.DAY_OF_WEEK);
		System.out.println("어린이날은 "+ dayArr[breakDay] + "입니다.");
		
		//5월의 마지막 날
		int lastday = cdate.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastday);
		
		//2월의 마지막날
		cdate.set(cdate.MONTH , 2-1);
		lastday = cdate.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastday);
		
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH : mm ");
		System.out.println(new String(sd.format(new Date()) ));
		
		Date d = cdate.getTime();
		System.out.println("D " + d);

		String sdf = sd.format(new Date());
		System.out.println("sdf " + sdf);
		
	}
}
