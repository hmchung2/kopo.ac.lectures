package assignments0311;

import java.util.Scanner;
/*
 * 5.
 * 2~100사이의 소수를 출력
 *  2  3  5  7  11
 * 13 17...  
 */

public class Assignment0311Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int firstNum = sc.nextInt();
		while (firstNum <= 0) {
			System.out.println("0 보다 큰수를 입력 바랍니다 입력 바랍니다");
			firstNum = sc.nextInt();
		}

		System.out.println("두번째 숫자를 입력하세요");
		int secondNum = sc.nextInt();
		while (secondNum <= firstNum) {
			System.out.println("두번째 숫자는 첫번째 숫자보다 커야 합니다. 다시 입력 바랍니다");
			secondNum = sc.nextInt();
		}
		int[] emptyArr = new int[secondNum - firstNum];

		int index = 0;
		for (int i = firstNum; i <= secondNum; i++) {
			boolean check = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check = false;
					break;
				}
			}
			if (check == true) {
				emptyArr[index] = i;
			}
//			emptyArr[index] = check;

			index++;
		}

		
		int currentPos = 0 ;
		for(int i = 0 ; i < (secondNum - firstNum) ; i++    ) {
			if(emptyArr[i] != 0  ) {
				System.out.print( emptyArr[i]  + "  ");
				currentPos++;
			}
			if(currentPos == 5) {
				currentPos = 0;
				System.out.println();
			}
		}
	}

}
