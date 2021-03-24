package assignment0324;

import java.util.Calendar;

public class MonthPrint {
	private int year;
	private int month;
	private String[] dayArr = { "일" , "월", "화" ,"수", "목", "금", "토"};
	private Calendar c = Calendar.getInstance();
	private Calendar c2 = Calendar.getInstance();
	private Calendar c3 = Calendar.getInstance();
	
	public MonthPrint(int year, int month) {
		this.year = year;
		this.month = month;
	}
	
	public void printMonth() {
		setCalendar();
		printDays();
		printspaceFirstDay(); 
		int firstday = c.getActualMinimum(Calendar.DAY_OF_MONTH);
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i = 0 ; i < lastday ; i ++) {
			c2.set(year , month-1 , i);
			int currentDay = c2.get(Calendar.DAY_OF_WEEK);
			String currentDayString = dayArr[currentDay-1];
			if(currentDayString  == "토" ) {
				System.out.println();
			}
			if(i < 10){System.out.print( (i+1)  + "    ");}else {System.out.print( (i+1) + "   ");}
		
		}
		
	}
	
	
	public void printspaceFirstDay() {
		
		c3.set(year , month-1 , 1);
		int firstDay = c3.get(Calendar.DAY_OF_WEEK);
		for(int i = 1 ; i < firstDay; i ++) {
			System.out.print("     ");
		}
	}
	
	
	
	
	public void printDays() {
		for(int i =0 ; i < dayArr.length ; i ++) {
			System.out.print( dayArr[i] + "   "  );
			
		}
		System.out.println();
	}
	
	public void setCalendar() {
		
		c.set(year , month -1 , 1);
	}

}
