package assignment0312;

import java.util.Scanner;

/*1. 0-99사이의 정수를 5개 입력받아 다음과 같이 출력하는 코드를 작성하시오
1's 정수 : 36
2's 정수 : 1000
//0-99사이의 정수만 입력하세요
2's 정수 : 92
3's 정수 : 20
4's 정수 : 8
5's 정수 : -2
5's 정수 : 200
5's 정수 : 62

< PRINT >
36  92  20  8  62

< REVERSE >
26  80  2  29  63*/


public class Assignment0312Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("0~99 사이 5개 정수를 입력하세요");
		int[] numArr = new int[5];
		int currentNum ;
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 5; i ++) {
			System.out.print(i + 1 + "'s 정수 : ");
			currentNum = sc.nextInt();
			while(currentNum < 0 || currentNum > 99) {
				System.out.println("0-99사이의 정수만 입력하세요");
				System.out.print(i + 1 + "'s 정수 : ");
				currentNum = sc.nextInt();
			}
			numArr[i] = currentNum;
		}
		System.out.println("< PRINT > ");
		for(int i = 0 ; i < numArr.length ; i ++ ) {
			System.out.print(numArr[i] + "   " );
		}
		System.out.println();
		System.out.println("< Reverse > ");
		for(int i = 0 ; i < numArr.length ; i ++ ) {
			System.out.print(numArr[numArr.length - 1 - i  ] + "   " );
		}
	}
}
