package lectures.assignment0308;

import java.util.Scanner;
//1. 2개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성
/*
*  첫번째 정수 : 12
*  두번째 정 : 5
*  12 + 5 = 17
*  12 -5 = 7
*  12 * 5 = 60
*  12 / 5 = 2.40 //소수점 둘째자리 출력
*  12 % 5 = 2
*/

public class Assignment0308Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		Scanner first_sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요 : ");
		int first_num = first_sc.nextInt();
		
		Scanner second_sc = new Scanner(System.in);
		System.out.println("두번째 정수를 입력하세요 : ");
		int second_num = second_sc.nextInt();
		
		System.out.println("첫번째 정수 : " + first_num);
		System.out.println("두번째 정수 : " + second_num);
		
		
		System.out.println(first_num + " + " + second_num + " = " + (first_num + second_num)  );
		System.out.println(first_num + " - " + second_num + " = " + (first_num - second_num)  );
		System.out.println(first_num + " * " + second_num + " = " + (first_num * second_num)  );
		System.out.printf(first_num + " / " + second_num + " = " );
		System.out.printf( "%.2f\n",((double)first_num / second_num)  );
		System.out.println(first_num + " % " + second_num + " = " + (first_num % second_num)  );
		

	}

}
