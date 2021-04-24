package kr.ac.kopo.day15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class APIinputMain {

	public static void main(String[] args) throws IOException {
		System.out.println("입력을 하세요. ctrl + z 를 누르면 종료합니다. ");

		InputStream is = System.in;

		int c ;
		// 항상 라인의 첫 입력에서야만 ctrl z 를 사용해야 작동한다.
		// ctrl z 는 지금 현상황을 중지 하라는거다.
		
//		while(true) {
//			c = is.read();
//			if(c==-1){break;}
//			System.out.print( (char) c);
//			// 한번에 우루루 나오는 이유는 버퍼를 사용 했기 때문이다.
//		}

		InputStreamReader isr = new InputStreamReader(is);

		try {
			while (true) {
				c = isr.read();
				if (c == -1) {break;}
				System.out.print((char)  c);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
