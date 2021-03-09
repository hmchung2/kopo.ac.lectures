package lectures.assignment0308;

import java.util.Scanner;

//4. 두개의 정수를 입력받아 첫번째 정수가 두번째 정수의 배수인지를 판단하는 프로그램을 작성 (조건연산자, if 문을 입력)
/*
* 첫번째 정수 입력 : 12
* 두번째 정수 입력 : 4
* 
* 12가 4의 배수인지 판단결과 : true
* 
* 첫번째 정수 입력 : 12
* 두번째 정수 입력 : 5
* 
*/
public class Assignment0308Q4 {
	public static void main(String[] args) {
		Scanner first_sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요 : ");
		int first_num = first_sc.nextInt();
		
		Scanner second_sc = new Scanner(System.in);
		System.out.println("두번째 정수를 입력하세요 : ");
		int second_num = second_sc.nextInt();
		
		System.out.println("첫번째 정수 : " + first_num);
		System.out.println("두번째 정수 : " + second_num);
		
		boolean check = (first_num % second_num == 0);
		
		System.out.println(first_num  + "가 " + second_num + "의 배수인지 판단 결과 :" + check );
		
		
	}

}
