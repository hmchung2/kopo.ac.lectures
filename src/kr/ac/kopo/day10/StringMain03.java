package kr.ac.kopo.day10;

public class StringMain03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean check;
		String str = new String("hello");
		String str2 = new String("hello");
		//
		String str3 = "hello";
		String str4 = "hello";
		
		//주소 비교 (클래스라서 다름)
		System.out.println(str == str2);
		
		// 같은 주소라서 같음
		System.out.println(str3 == str4);
		
		//그래서 문자열을 비교하기 위해서는 다음과 같이 한다
		//하지만 string 타입을 제외하고는 equals 메소드는 주소를 비교한다
		check = str.equals(str2);
		System.out.println("equals check : "  +check);

		// 상수하고 비교하는 경우에는 상수 먼저 작성 추천
		//"hello".equals(str);		
		
		// 대소문자 무시 비교 방식
		String str5 = "Hello";
		check = str.equalsIgnoreCase(str5);
		System.out.println( "ignore capital letter check :" + check);
		
		//문자열이 str 로 시작하면 true 아니면 false
		str = "hello!!!!";
		str2 = "hello world";
		check = str.startsWith("hello");
		System.out.println("starts with : " +  check);
		
		// 문자열이 str 로 끝나면 true 아니면 false 
		str = "hello.txt";
		check = str.endsWith(".txt");
		System.out.println("endswith : " + check );
		
		
		// 현재 문자열과 비교 문자열을 비교하여 더 크면 양수 작으면 음수
		// 크기는 유니코드 숫자를 의미한다
		// 첫번째 문자만 비교한다.
		
		int compare;
		str = "att";
		str2 = "taa";
		compare  = str.compareTo(str2);
		System.out.println("compare : " + compare);
		
		int t = 't';
		int a = 'a';
		System.out.println("a : " + a);
		System.out.println("t : " + t);
		
		
		String[] names = {"강길동" , "홍길동" , "홍길순" , "김길동", "윤길동" , "박홍철" , "홍길동"};
		
		System.out.println("<이르미 홍길동인 사람 검색>");
		

		for(int i = 0 ; i < names.length ; i++  ) {
			if(names[i].equals("홍길동")) {
				System.out.println(names[i]);
			}
		}
		
		System.out.println("<홍씨성을 가진 사람 검색>");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		System.out.println("<이름이 길동인 사람 검색>");
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		// 홍이 포한함 사람 다 나오기 하게
		System.out.println("<홍이 포함한 사람 검색>");
		for(String name : names) {
			if(name.contains("홍")) {
				System.out.println(name);
			}
		}
		
		
				
	}
}
