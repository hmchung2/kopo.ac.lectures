package kr.ac.kopo.day09;

import java.util.Arrays;

public class StringMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		
		str = "hello world";
		int index;
		
		// 처음 o 위치 찾기
		// 없으면 -1
		index = str.indexOf("o");
		System.out.println("r start index of " + str + " : " +  index);
		
		// 마지막 o 위치 찾기 
		index = str.lastIndexOf("o");
		System.out.println("r last index of " + str + " : " +  index);
		
		str = "hello world";
		char ch = 'l';
		System.out.println(str + "에서 " + ch + " 위치");
		
		index = str.indexOf(ch);
		while(index != -1) {
			System.out.println("검색된 위치 : " + index);
			index = str.indexOf(ch , index+1);
		}
		
		index = -1;
		while((index =str.indexOf(ch, index+1)) != -1) {
			System.out.println("검색된 위치 : " + index);
		}
		
		index = str.length();
		while((index =str.lastIndexOf(ch, index-1)) != -1) {
			System.out.println("검색된 위치 : " + index);
		}
		
		str = "abcdef";
		
		// 두번째 인자값으로 부터 시작하는데 라스트는 왼쪽으로 찾기 시작 일반 형은 오른쪽 방향으로 찾기 시작
		System.out.println(str.lastIndexOf('c' ,3));
		System.out.println(str.indexOf('c' ,3));
		
		// 부문 문자열 반환
		str = "Hello World";
		String rstr;
		rstr = str.substring(0, 2);
		System.out.println("substring 0-2 : " + rstr);
		
		// 문자열 결합
		rstr = str.concat("concating");
		System.out.println(rstr);
		
		// 문자열 치환
		rstr = str.replace("rl", "rrrrrrrrrrlllllllllllll");
		System.out.println(rstr);
		
		// 문자의 앞과 끝 공백 제거
		str = "    hello world     ";
		
		rstr = str.trim();
		
		System.out.println(str.length());
		System.out.println(rstr);
		System.out.println(rstr.length());
		
		
		// 대소문자 변형
		str = "Hello World";
		rstr = str.toLowerCase();
		System.out.println(rstr);
		rstr = str.toUpperCase();
		System.out.println(rstr);
		
		
		String[] rstrArr;
		rstrArr = str.split(" ");
		System.out.println(Arrays.toString(rstrArr));
		
		// 하지만 특정 문자는 예외 처리를 해주어야 한다
		String ip = "192.168.0.181";
		String[] ipArr = ip.split("\\.");
		System.out.println(Arrays.toString(ipArr));
		
		
		// 숫자에서 문자로 강제 형변환
		int num = 123;
		String strnum = String.valueOf(num);
		System.out.println(strnum + 100);
				
		// 반대로 형변환은 다음과 같다
		System.out.println(Integer.parseInt(strnum) + 100 );
		
		
		// string class 의 변하지 않는 특성 실험
		// 훨씬 오래 걸린다
		
		long start , end;
		start = System.currentTimeMillis();
		str = "";
		for(int i = 0 ; i < 100000 ; i ++) {
			str +=1;
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start)/ 1000.0 +  "초"  );
		
		start = System.currentTimeMillis();
		int sum = 0;
		for(int i = 0 ; i < 100000 ; i ++) {
			sum +=1;
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start)/ 1000.0 +  "초"  );
		
		//------------------------------------///
		StringBuffer sb = new StringBuffer();
		start = System.currentTimeMillis();
		for(int i = 0 ; i < 100000 ; i ++) {
			sb.append(i);
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start)/ 1000.0 +  "초"  );


	
		
		
			
		
		

		
		
	}
}
