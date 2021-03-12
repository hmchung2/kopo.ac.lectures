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
		int min = 0;
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("번호를 입력하세요");
			int currentNum = sc.nextInt();
			/*
			 * while (currentNum <= 0) { System.out.println("0 보다 큰 수를 입력하세요"); currentNum =
			 * sc.nextInt(); }
			 */
			numArr[i] = currentNum;
			if(i == 0 || currentNum < min  ) {
				min = currentNum;
			}		
		}

		System.out.println(Arrays.toString(numArr) );
		int[] finalArr = new int[len];
		boolean[] boolArr = new boolean[len];
		System.out.println(Arrays.toString(boolArr) );
		
		int num = min;
		int index = 0;
		
		for(int i = 0; i < len ; i++ ) {
			num = min;
			for(int j = 0 ; j < len ; j ++) {
				if( (j ==0  ||  numArr[j]  > num) && boolArr[j] != true  ) {
					num = numArr[j];
					index = j;
				}
			}
			finalArr[i] = num;
			boolArr[index] = true;
		}
		
		for(int i = 0 ; i < finalArr.length ; i ++) {
			System.out.println( i + "번째로 큰 수 : " + finalArr[i]  );
		}
		
		System.out.println(Arrays.toString(boolArr));
		System.out.println(Arrays.toString(finalArr));	
	}
}


