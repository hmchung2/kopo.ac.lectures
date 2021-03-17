package kr.ac.kopo.day08;
import java.util.Scanner;

public class ConstructorMain02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m = new Member();
		m.info();
		
		Member m0 = new Member("홍길동");
		m0.info();
		
		Member m1 = new Member("강길동" , 20);
		m1.info();
		
		Member m2 = new Member("박길동" , 33 , "AB");
		m2.info();
		
		
				
	}
}
