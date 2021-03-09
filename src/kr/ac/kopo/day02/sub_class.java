package kr.ac.kopo.day02;

import java.util.Random;

public class sub_class {
	public static void todayLotto() {
		Random r = new Random();
		System.out.println("오늘의 로또 확률 : " +  r.nextInt(101) + "%입니다");
 }
}