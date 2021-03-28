package kr.ac.kopo.day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;



public class ExceptionMain03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("main start");

		for (int i = -2; i < 3; i++) {
			try {
				System.out.println(i + "번째 반복문 수행중");
				System.out.println(5 / i);

			} catch (Exception e) {
				System.out.println("error occcured");
				break;
			} finally {
				System.out.println("looping");
			}
		}

		System.out.println("main end...");
		
		StringBuffer sb = new StringBuffer();
		// compile 시점 예외 처리
		try {
			FileReader fr = new FileReader("src\\kr\\ac\\kopo\\day13\\a.txt");
			
			char[] cbuff = new char[3];
			System.out.println("printing");
			sb.append(fr.read(cbuff, 0, 3));
			System.out.println(sb);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("cannot read");
			try {
				FileWriter fw = new FileWriter("error.log");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		
	}
}
