package kr.ac.kopo.day08;
import java.util.Scanner;
public class StringMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World";
		char[] chars = new char[str.length()];
		
		
		str.getChars(0, str.length(), chars, 0);
		
		System.out.println(chars);
		
		for(int i = 0; i < str.length() ; i++) {
			chars[i]  = str.charAt(i);
		}
		
		System.out.println(chars);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("insert string : ");
		
		char c = sc.nextLine().charAt(0);
		System.out.println(c);
		
		sc.close();
	
	}
}
