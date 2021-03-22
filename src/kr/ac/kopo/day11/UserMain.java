package kr.ac.kopo.day11;

/*
 * 프린터를 선택하세요 (1. LG 2. 삼성) =>1
 */

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		menu.choice();
		
		MaxFinder a = new MaxFinder();
		a.max(5,6);
		
		System.out.println(a.max(5.0 , 6.0));
		
	}
}
