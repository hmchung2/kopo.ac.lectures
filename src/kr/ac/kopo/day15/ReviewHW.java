package kr.ac.kopo.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReviewHW {

	// wrapper class 매퍼 클래스
	// 기본 자료형을 참조 자려형으로 쓸수 있는 클래스
	/*
	  	기본 자료형      	wrapper 클래스
		boolean      	Boolean
		char			Character			
		byte			Byte
		short			Short
		int				Integer
		long			Long
		float			Float
		double			Double
	*/
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int i = 123;
		Integer i2 = 125;
		list.add(i);
		list.add(i2);

		System.out.println(Arrays.toString(list.toArray()));
		
		System.out.println(Integer.valueOf("50"));
		// Integer.valueof -> return 값이 참조 자료 Integer 이다.
		// Integer.parseint -> return 값이 기본 자료 int 이다.
		// 하지만 지금은 auto 박싱이 되있어서 아무거나 사용해도 무방하다. 자동으로 변환이 된다.
		int test =new Integer(500);		
		String hello = new String("hello");
		String hello2 = "hello";
		
		
		
		
		
		
		
	}
}
