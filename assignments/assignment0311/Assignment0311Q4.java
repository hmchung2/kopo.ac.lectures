package assignment0311;

import java.util.Scanner;
/*4.
 * 소수 : 1과 자기자신 외에는 약수가 존재하지 않는 양의 정수
 * 정수를 입력 : 23
 * 
 * 23은 소수 입니다
 * 
 * 12는 소수가 아닙니다
 * 
 */

public class Assignment0311Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수를 입력 하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num <= 0 ) {
			System.out.println("0보다 큰수를 입력 하세요");
			num = sc.nextInt();
		}
		boolean check = true;
		for(int i = 2 ; i < num ; i ++) {
			if( num % i ==0  ) {
				check = false;
				break;
			}
		}
		String result = (check == true) ? " 소수 입니다" : " 소수가 아닙니다";
		
		System.out.println(num +  result  );
	}

}
