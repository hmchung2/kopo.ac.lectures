package assignment0312;

import java.util.Scanner;

/*
 * 5. 별그리기 관련 문제를 라인수를 입력받아 출력하는 코드를 작성.
   3 - 20사이의 라인수를 입력받고, 
   
   ----*
   ---**
   --***
   -****
   *****
   
   짝수 입력시 하나 작은 홀수로 구성
   20라인을 입력받으면 19줄의 모양으로 구성
   *****              *********
   ****                *******
   ***                  *****
   **                    ***
   *                      *
   **                    ***
   ***                  ***** 
   ****                *******  
   *****	          *********
 */
public class Assignment0312Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3 ~ 20 사이정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		while(num < 3 || num > 20) {
			System.out.println("3 ~ 20 사이정수를 입력하세요");
			num = sc.nextInt();
		}
		if(num % 2 == 0 ){
			num = num - 1;
		}
		int star = num / 2 + 1;
		for(int i=0 ; i < num ; i ++) {
			for(int j = 0 ; j < star ; j ++) {
				System.out.print("*");
			}
			if(i >  num / 2 - 1 ) {
				star++;
			} else {
				star --;
			}
			
			System.out.println();
		}

	}

}
