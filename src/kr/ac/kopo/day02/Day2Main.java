package kr.ac.kopo.day02;

public class Day2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		
		ch = 65;
		
		System.out.println("ch variable1 : " +   ch);
		
		ch = '\u0041';
		
		System.out.println("ch variable2 : " +   ch);
		
		ch = '\uAC00';
		
		System.out.println("ch variable3 : " +   ch);
		
		
		
		System.out.println('A' + 'B');
		
		System.out.println("" + 'A' + 'B');
		
		char testing;
		testing = 'b' + 'c';
		System.out.println(testing);

		System.out.println('b' + 'c');
		char testing2;
		testing2 = 197;
		System.out.println(testing2);
		
		
		int test;
		test = 'A' + 10;
		System.out.println(test + 1);
		
		char test2;
		test2 = 'A' + 10;
		System.out.println(test2);
		
		char testing3 = 'A';
		
		
		// 형변환
		System.out.println("test : "+ (int)testing3);
	
		
		
	}

}