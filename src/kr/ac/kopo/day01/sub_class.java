package kr.ac.kopo.day01;

import java.util.Random;

public class sub_class {
	public static void todayLotto() {
		System.out.println("start");
		Random r = new Random();
		System.out.println("오늘의 로또 확률 : " +  r.nextInt(101) + "%입니다");
 }
}
