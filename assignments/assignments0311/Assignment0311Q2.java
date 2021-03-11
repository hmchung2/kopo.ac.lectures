package assignments0311;

import java.util.Scanner;
/* 1.
 * 3개의 정수를 입력받아 큰수에서 작은 수순으로 출력 
 * 
 * 3개의 정수를 입력하세요 : 12 7 39
 * 39 12 7
 * 
 */

/*
 * 2.
 * 4개의 정수를 입력받아 가장 큰수를 출력
 * 
 * 4개의 정수를 입력하세요 : 12 6 2 54
 * 가장 큰수 : 54
 * 
 * 3.
 * 달팽이가 100M 깊이의 우물에 빠졌습니다
 * 달팽이는 5m/hour 우물을 기어오릅니다
 * 
 * 올라간 높익 50m 미만일때는 -1m/hour
 *          50m 이상일때는 -2m/hour
 *          
 * 달팽이는 몇시간만에 우물을 탈출할까요
 * [1시간후] 달팽이가 올라간 총 높이 : 4m
 * [2시간후] 달팽이가 올라간 총 높이 : 8m
 * 
 * [xx시간후] 달팽이가 올라간 총 높이 : 100m or 101m or 102m
 * 
 */


/*4.
 * 소수 : 1과 자기자신 외에는 약수가 존재하지 않는 양의 정수
 * 정수를 입력 : 23
 * 
 * 23은 소수 입니다
 * 
 * 12는 소수가 아닙니다
 * 
 */

/*
 * 5.
 * 2~100사이의 소수를 출력
 *  2  3  5  7  11
 * 13 17...  
 */


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

public class Assignment0311Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);



		System.out.println("길이를 입력하세요");
		int len = sc.nextInt();
		int finalNum = 0;
		for(int i  = 0 ; i < len ; i ++) {
			System.out.println( i+ 1 +"번째 정수를 입력하세요 : ");
			int currentNum = sc.nextInt();
			while (currentNum < 0){
				System.out.println( " 0 보다 큰수를 입력하세요 : ");
				currentNum  = sc.nextInt();
			}
			if (currentNum > finalNum) {
				finalNum = currentNum;
			}
		}
		System.out.println("가장 큰수 : " + finalNum );	
	}

}















