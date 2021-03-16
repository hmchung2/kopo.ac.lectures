package kr.ac.kopo.day07;

import java.util.Random;

public class Methods03 {
	
	static int age2 = 5;
	
	int age = 10;
	
	void printage() {
		System.out.println(age);
	}
	
	static void printstatic() {
		int myage = 20;
		System.out.println(myage);
	}

	public static void main(String[] args) {
	
	
		// TODO Auto-generated method stub
		
		Methods03 newinstance = new Methods03();
		newinstance.printage();
		System.out.println(age2);
		newinstance.age2 = 50;
		System.out.println(age2);
		
		printstatic();
		// System.out.println(myage); 에러 ----> 함수 안에서 생긴 변수는 사라진다//
		
	}
}
