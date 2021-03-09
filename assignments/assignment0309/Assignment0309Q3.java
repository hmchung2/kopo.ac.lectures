package assignment0309;

import java.util.Scanner;
//3.
/*
* 2960원어치 물건을 사고 5000원을 입력했을 때 거스름돈의 액수와 1000, 500, 100, 50, 10원의 개수를 출력하는 코드를 작성
* 물건값을 입력 : 2960
* 지불한 액수를 입력 : 5000
* 
* <방식1>
* 거스름돈 : 2040원
* 1000원 : 2개
* 500원 : 0개
* 100원 : 0개
* 50원 : 0개
* 10원 : 4개
* 
* <방식2>
* 1000원 : 2개
* 10원 : 4개
* 
* 
* 2000원 입력시
* 960원이 부족합니다
*/

public class Assignment0309Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value_1000;
		int value_500;
		int value_100;
		int value_50;
		int value_10;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("물건값을 입력하세요 : ");
		int cost_money  = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("지불한 액수를 입력하세요 : ");
		int total_money  = sc2.nextInt();
		
		
		int left_over = total_money - cost_money;
		if (left_over < 0) {
			System.out.println(left_over * -1 + "원이 부족합니다");
		} else {
			
			
			
			int current_leftover = left_over;
			value_1000  = current_leftover / 1000;
			
			current_leftover = current_leftover - (value_1000 * 1000);
			value_500= current_leftover  / 500;
			current_leftover = current_leftover - (value_500 * 500);			
			value_100  = current_leftover  / 100;
			current_leftover = current_leftover - (value_100 * 100);
			value_50  = current_leftover  / 50;
			current_leftover = current_leftover - (value_50 * 50);
			value_10  = current_leftover  / 10;
			current_leftover = current_leftover - (value_10 * 10);
			
			System.out.println("방식 1 ");
			System.out.println("거스름돈 :" + left_over);
			System.out.println("1000원 : " + value_1000 );
			System.out.println("500원 : " + value_500 );
			System.out.println("100원 : " + value_100 );
			System.out.println("50원 : " + value_50 );
			System.out.println("10원 : " + value_10 );
			
			
			System.out.println("방식 2 ");
			System.out.println("거스름돈 :" + left_over);
			if (value_1000 > 0) {
				System.out.println("1000원 : " + value_1000);
			}
			if (value_500 > 0) {
				System.out.println("500원 : " + value_500);
			}
			if (value_100 > 0) {
				System.out.println("100원 : " + value_100);
			}
			if (value_50 > 0) {
				System.out.println("50원 : " + value_50);
			}
			if (value_10 > 0) {
				System.out.println("1000원 : " + value_10);
			}

		
		
		
		}

	}

}
