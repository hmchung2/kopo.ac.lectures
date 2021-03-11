package kr.ac.kopo.day04;

import java.util.Arrays;

public class Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 배열. 참조형 배열

		String[] strArr = new String[3];
		String[] strArr1 = new String[] { "one", "two", "three" };

		for (String str : strArr1) {
			System.out.println(str);
		}
		for (String str : strArr) {
			System.out.println(str);
		}

		System.out.println(Arrays.toString(strArr));

		// 스트링은 bracket 1나가 있으면 차원 개수는 2차원이다.
		// 스트링 값 하나 자체가 주소를 갖고 있음
		// 참조 자료 배열이 하나 더 추가 된다.
		// 하지만 출력에는 일반 방식으로 문제가 없다
		System.out.println(strArr1[0]);

		// 실제 원래 원칙은 스트링 데이터 변수는 다음과 같이 만들어지므로 기본적으로 주소를 잡는다
		String s = new String("폴리택");
		String s2 = new String("데이터분석");
		String s3 = new String("자바");

	}

}
