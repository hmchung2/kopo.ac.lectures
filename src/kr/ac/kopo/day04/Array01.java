package kr.ac.kopo.day04;

import kr.ac.kopo.day01.sub_class;

public class Array01 {

	public static void main(String[] args) {
		// 연속적인 공간에 같은 타입을 모아 놓은 집합
		// new 라고 불러서 만들어진것을 전부 객체라고 함
		// 배열도 new 로 불러서 만들어지기 때문에 하나의 객체라고 생각해도 됨
		// heap 에서 만들어져서 new 가 필요함
		// TODO Auto-generated method stub

		char[] cArr;
		boolean[] bArr;
		String[] sArr;

		int array1[] = { 1, 3, 5 }; // bracelet 이 뒤로 가는 방식은 비추천 --> 가독성 떨어짐

		int[] intArr2 = { 1, 3, 5 };// new 를 쓰지 않아도 자동으로 heap 에서 다음 정보로 생성

		int[] intArr = new int[] { 1, 3, 5 }; // 위에랑 동일한 메모리 생성 하지만 생성 과정이 다름. heap 에서 무조건 새로 생성

		int[] intArr3 = new int[5];
		intArr3[0] = 5;
		intArr3[1] = 6;
		intArr3[2] = 7;
		intArr3[3] = 8;
		intArr3[4] = 9;

		int[] intArr5 = new int[] { 1, 3, 5 };

		/*
		 * heap 에서 메모리 만들어지면 다음과 같이 초기화 int : 0 boolean : false char: '\u0000' 참조형 :
		 * null
		 */

		int[] prime;
		prime = new int[3];
		System.out.println(prime[0]); // 0 default

		int[] oneDim = new int[3];
		oneDim[0] = 10;
		oneDim[1] = 10;
		oneDim[2] = 10;

		int[][] doubleDim = new int[3][2];
		doubleDim[0][0] = 10;
		doubleDim[0][1] = 20;
		doubleDim[1][0] = 30;
		doubleDim[1][1] = 40;
		doubleDim[2][0] = 50;
		doubleDim[2][1] = 60;

		System.out.println(doubleDim.length); // 3 첫번째 차원의 길이
		System.out.println(doubleDim[0].length); // 2 첫번째 차원의 첫 인덱스의 길이

	}

}
