package assignment0315;

import java.util.Scanner;

/*
 * 다음으 ㅣ결과를 보이는 프로그램을 작성하시오
 *  아이스크림 몇개 구입할꺼야 ? : 4(입력)
 *  *** 1번째 아이스크림 구매정보 입력 ***
 *  아이스크림명 : 비비빅(입력)
 *  아이스크림 가격 : 800 (입력)
 *  
 *  *** 2번째 아이스크림 구매정보 입력 ***
 *  아이스크림명 : 브라보콘(입력)
 *  아이스크림 가격 : 1500 (입력)
 *  
 *   *** 3번째 아이스크림 구매정보 입력 ***
 *  아이스크림명 : 구구콘(입력)
 *  아이스크림 가격 : 2000 (입력)
 *  
 *   *** 4번째 아이스크림 구매정보 입력 ***
 *  아이스크림명 : 메로나(입력)
 *  아이스크림 가격 : 800 (입력)
 *  
 *  <총 4개의 아이스크림 구매정보 출력>
 *  번호 아이스크림명 아이스크림가격
 *  1    비비빅     800
 *  2    브라보콘   1500
 *  3    구구콘     2000
 *  4    메로나     800
 *  
 *  
 */

public class Assignment0315Q1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int len = 4;
		IceCream[] iceArrCreams = new IceCream[len];

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String name;
		int price;
		for (int i = 0; i < len; i++) {
			iceArrCreams[i] = new IceCream();
			System.out.print("아이스크림명 : ");
			name = sc.next();
			System.out.print("아이스크림 가격 : ");
			price = sc2.nextInt();
			iceArrCreams[i].name = name;
			iceArrCreams[i].price = price;

		}
	
		System.out.println("<총 4개의 아이스크림 구매정보 출력>");
		System.out.printf("%1s%15s%10s", "번호", "아이스크림명", "가격");

		System.out.println();
		for (int i = 0; i < iceArrCreams.length; i++) {
			System.out.printf("%d", i + 1);
			System.out.printf("%15s", iceArrCreams[i].name );
			System.out.printf("%15d" , iceArrCreams[i].price);
			System.out.println();
		}
	}
}

class IceCream {
	String name;
	int price;
}