package kr.ac.kopo.day07;

import java.util.Scanner;

public class GugudanMain {

	static int getInt() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.nextLine();
		return x;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gugu gugu = new Gugu();
		
		int dan = gugu.getDan("2 - 9 사이의 정수 입력 : ");
		gugu.print(dan);
		//gugu.print();
		
		int startDan = gugu.getDan("시작 단 입력");
		int endDan = gugu.getDan("종료 단 입력");
		
		gugu.print(startDan,endDan);

		
		
		
	}
}

// 눈에 보이는 사물이 아니라 구현해주는 클래스 -> 기능 클래스

class Gugu {
	Scanner sc = new Scanner(System.in);
	int num = 5;
	static int staticnum = 5;
	void print(int x , int y) {
		for(int dan = x ; dan <= y ; dan ++) {
			print(dan);
		}
	}
	
	void print(int x) {
		System.out.println("***" + x + " 단" + "***" );
		for (int i = 1; i <= 9; i++) {
			System.out.println(x + " x " + i + " = " + (i * x));
		}
	}
	
	void print() {
		for (int i = 1; i <= 9; i++) {
			print(i);
		}
	}
	
	int getDan(){
		int dan = sc.nextInt();
		sc.nextLine();
		return dan;
	}
	
	int getDan(String x) {
		System.out.println(x);
		return getDan();
	}
	
	int testMethod() {
		return num;
	}
}



