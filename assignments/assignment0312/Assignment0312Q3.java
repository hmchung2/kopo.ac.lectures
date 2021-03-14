package assignment0312;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 	
3. 소수는 1 ~ (판단정수) 사이의 소수로만 나누어 약수가 존재하지 않는다라는 규칙성을 이용항
2 ~ 100사이의 소수를 구분 및 출력하는 코드를 작성(배열)
 */

public class Assignment0312Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 0;
		boolean check;
		int[] privateArr = new int[100];
		for (int i = 1; i < 100; i++) {
			check = true;
			for (int j = 2; j < i ; j++) {
				if (i % j == 0) {
					check = false;
					break;
				}

			}
			if(check == true) {
				privateArr[index] = i;
				index++;
			}

		}
		int[] finalArr = new int[index];
		
		System.arraycopy(privateArr, 0, finalArr, 0, index);
		boolean check2;
		for(int i = 2 ; i < 100 ; i ++) {
			check2 = true;
			for(int j : finalArr) {
				if(j >= i ) {
					break;
				}
				if(i % j ==0 && j != 1) {
					check2 = false;
				}
			}
			
		System.out.println( check2 == true? i+" 소수가 맞습니다" : i + " 소수가 아닙니다"  );
		}
		System.out.println(Arrays.toString(finalArr));

	}
}
