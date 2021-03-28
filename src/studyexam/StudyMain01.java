package studyexam;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class StudyMain01 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("입력을 하세요. ctrl+z를 누르면 종료합니다");
		
		InputStream is = System.in;
		int c= is.read();
		int c2 = is.read();
		InputStream is2 = System.in;
		int c3 = is2.read();
		System.out.println((char)  c);
		System.out.println( (char)  c2);
		System.out.println( (char)  c3);
		
	}
}