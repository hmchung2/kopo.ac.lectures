package assignment0311;

import java.util.Scanner;
/*
 * 6.
 * 10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성
 * 1's 정수 : 12
 * 2's 정수 : 3
 * 3's 정수 : 45
 * 4's 정수 : 7
 * 5's 정수 : 23
 * 6's 정수 : 56 
 * 7's 정수 : 10 
 * 8's 정수 : 8
 * 9's 정수 : 3
 * 10's 정수 : 55
 * 
 * < 짝수 >
 * 12 56 10 8
 * 짝수 총합 : xxxxx
 * 
 * * < 홀수 >
 * 12 56 10 8
 * 홀수 총합 : xxxxx
 * 
 */

public class Assignment0311Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 개수를 입력 하세요");
		int num = sc.nextInt();
		while (num <= 0) {
			System.out.println("0 보다 큰수를 입력하세요");
			num = sc.nextInt();
		}
		int[] evenArr = new int[num];
		int[] oddArr = new int[num];

		int currentNum;
		for (int i = 0; i < num; i++) {
			currentNum = 0;
			System.out.println(i+1 + " s 정수 : ");
			currentNum = sc.nextInt();
			while (currentNum <= 0) {
				System.out.println("0 보다 큰 수 입력하세요 ");
				currentNum = sc.nextInt();
			}

			if (currentNum % 2 == 0) {
				evenArr[i] = currentNum;
			} else {
				oddArr[i] = currentNum;
			}

		}
		int evenSum = 0;
		for (int i : evenArr) {
			if (i != 0) {
				System.out.print(i + "   ");
				evenSum = evenSum + i;
			}
		}
		System.out.println();
		System.out.println("짝수의 총합 : " + evenSum);
		
		int oddSum = 0;
		for (int i : oddArr) {
			if ( i!= 0 ) {
				System.out.print(i +  "   ");
				oddSum = oddSum + i;
			}
		}
		System.out.println();
		System.out.println("홀수의 총합 : " + oddSum);
	}

}
