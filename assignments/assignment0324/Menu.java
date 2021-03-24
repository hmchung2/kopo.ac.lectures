package assignment0324;

import java.util.Scanner;

public class Menu {
	Scanner sc= new Scanner(System.in);
	int status;
	int year;
	int month;
	public void ask() {
		System.out.println("선택하세요(1. 특정년도   2. 특정월   3. 종료)");
		status = sc.nextInt();
		sc.nextLine();
		if(status == 1) {
			System.out.println("년도를 입력하세요");
			year = sc.nextInt();
			sc.nextLine();
		} else if(status == 2) {
			System.out.println("년도를 입력하세요");
			year = sc.nextInt();
			sc.nextLine();
			System.out.println("월을 입력하세요");
			month = sc.nextInt();
			sc.nextLine();
		}
		
	}
	
	public void answer() {
		if(status == 1) {
			for(int i = 1; i <= 12 ; i ++) {
				System.out.println();
				System.out.println("<< 2020년 "+i+ "월 >>");
				MonthPrint m = new MonthPrint(year, i);
				m.setCalendar();
				m.printMonth();
			}
		} else if (status == 2) {
			MonthPrint m = new MonthPrint(year, month);
			m.setCalendar();
			m.printMonth();
			
		}
		System.out.println();
	}
	
	public void finalAnswer() {
		ask();
		while(status != 3) {
			answer();
			ask();
		}
		
		
	}
	
}
