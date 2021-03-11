package assignments0311;

import java.util.Scanner;

public class Assignment0311Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("길이를 입력 하세요");
		int len = sc.nextInt();

		
		int[] numArr = new int[len];
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("번호를 입력하세요");
			int currentNum = sc.nextInt();			
			numArr[i] = currentNum;
		}
		
		
		int[] finalArr = new int[len];
		for (int i = 0; i < len; i++) {
			int currentMax = 0;
			for (int j = 0; j < len; j++) {
				if (i != 0) {
					if (numArr[j] >= currentMax && finalArr[i - 1] >= numArr[j]) {
						currentMax = numArr[j];
					}
				} else {
					if (numArr[j] >= currentMax) {
					currentMax = numArr[j];
					}
				}
			}
			finalArr[i] = currentMax;
		}

		for (int i = 0; i < len; i++) {
			System.out.println(finalArr[i]);
		}

	}
}
