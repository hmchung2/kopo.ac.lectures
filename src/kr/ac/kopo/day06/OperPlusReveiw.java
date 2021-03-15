package kr.ac.kopo.day06;

import java.util.Arrays;

public class OperPlusReveiw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] testArr  = new int[5];
		int loc = 0 ;
		
		//  우선 인덱스 0부터 입력 된다음에 ++ 기능이 적용 된다.
		// testArr 를 출력하면 나오는 값은 다음과 같다  - > [5,0,0,0,0]
		testArr[loc++] = 5;
		
		System.out.println(Arrays.toString(testArr));
		
		
		
		
		

	}
}
