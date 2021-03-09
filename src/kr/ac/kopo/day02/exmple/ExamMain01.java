package kr.ac.kopo.day02.exmple;

import java.util.Scanner;

public class ExamMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("집에서 출발한 시간 입력 (8시 05분은 805 입력)");
		int time = sc.nextInt();
		System.out.println(time);

		String result;
		if (time < 800) {
			result = "walk";
		} else if (time < 815) {
			result = "bus";
		} else {
			result = "taxi";
		}
		System.out.println(result);
	}

}
