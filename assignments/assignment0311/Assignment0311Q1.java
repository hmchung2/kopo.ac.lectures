package assignment0311;
import java.util.Arrays;
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
			while (currentNum <= 0) {
				System.out.println("0 보다 큰 수를 입력하세요");
				currentNum = sc.nextInt();
			}
			numArr[i] = currentNum;
		}
		int[] finalArr = new int[len];
		int num;
		int index = 0;
		for(int i = 0; i < len ; i++ ) {
			num = 0 ;
			for(int j = 0 ; j < len ; j ++) {
				if(numArr[j]  > num ) {
					num = numArr[j];
					index = j;
				}

			}
			finalArr[i] = num;
			numArr[index] = 0;
		}
		for(int i = 0 ; i < finalArr.length ; i ++) {
			System.out.println( i + "번째로 큰 수 : " + finalArr[i]  );
		}
		System.out.println(Arrays.toString(finalArr) );

	}
}
