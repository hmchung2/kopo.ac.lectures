package kr.ac.kopo.day13;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain04 {

	public static void main(String[] args) {
	
// TODO Auto-generated method stub
//		try {
//			b();
//		} catch (Exception e) {
//			System.out.println("main error");
//			e.printStackTrace();
//		}
//		System.out.println("program end");
		ErrorMaker er = new ErrorMaker();
//er.b(); checked exception 에러 뜸
//b(); checked exception 에러 뜸

	}
	
	public static void a() {
		System.out.println("a() 메소드 호출");
		try {
		FileReader fr = new FileReader("a.txt");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void b() throws Exception{
		System.out.println("b() 메소드 호출");
		System.out.println(1/0);
		String str = null;
		//System.out.println(str.charAt(0));
	
	}
}
