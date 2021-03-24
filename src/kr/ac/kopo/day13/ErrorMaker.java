package kr.ac.kopo.day13;

public class ErrorMaker {
	
	public void b() throws Exception{
		System.out.println("b() 메소드 호출");
		System.out.println(1/0);
		String str = null;
		System.out.println(str.charAt(0));
	
	}
}
