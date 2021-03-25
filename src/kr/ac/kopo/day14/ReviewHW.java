package kr.ac.kopo.day14;

import java.util.Calendar;
import java.util.Scanner;

public class ReviewHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalendarView view = new CalendarView();
		view.process();
	}
}

class CalendarUtil {

	private Calendar c = Calendar.getInstance();;

	public void showDayByYear(int year) {
		for (int month = 1; month <= 12; month++) {
			showDayByMonth(year, month);
		}
	}

	public void showDayByMonth(int year, int month) {
		c.set(year, month - 1, 1);

		int week = c.get(Calendar.DAY_OF_WEEK);

		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("<<" + year + " 년" + month + " 월 >>");

		showDay(week, lastDay);
	}

	private void showDay(int week, int lastDay) {
		System.out.println("--------------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		int cnt = 0;

		for (int i = 1; i < week; i++) {
			System.out.print("\t");
			cnt++;
		}

		for (int i = 1; i <= lastDay; i++) {
			System.out.print("" + i + "\t");
			if (++cnt % 7 == 0) {
				System.out.println();
			}
		}
		if (cnt % 7 != 0) {
			System.out.println();
		}
	}
}

class CalendarView {

	private Scanner sc;

	public CalendarView() {
		sc = new Scanner(System.in);
	}

	public int getInt(String msg) {
		System.out.println(msg);
		int no = sc.nextInt();
		sc.nextLine();
		return no;
	}

	public void process() {
		CalendarUtil util = new CalendarUtil();
		loop: while (true) {
			int command = getInt("항목을 선택하세요 (1. 특정년도. 2.특정월. 3. 종료)");
			int year;
			int month;
			switch (command) {
			case 1:
				year = getInt("select year");
				util.showDayByYear(year);
				break;
			case 2:
				year = getInt("select year");
				month = getInt("select month");
				util.showDayByMonth(year, month);
				break;
			case 3:
				System.out.println("3번 선택");
				System.exit(0);
			}
		}

	}

}
