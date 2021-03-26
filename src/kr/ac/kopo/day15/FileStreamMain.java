package kr.ac.kopo.day15;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

import javax.swing.ImageIcon;

import kr.ac.kopo.util.FileClose;

/*
 * iodata/test.jpg -> iodata/me.jpg 복사
 * 
 * 작업 순서
 * 1. stream open   -> 객체 만들기
 * 2. read/write    -> 
 * 3. stream close  ->
 * 
 */

public class FileStreamMain {
	public static void main(String[] args) throws Exception {
		System.out.println("복사 실행");
		
		//stream open
		// 통로만 연결 시킨거임
		FileInputStream fis =   new FileInputStream("iodata/test.jpg");
		FileOutputStream fos = new FileOutputStream("iodata/katarina.jpg");
		
		// read/write
		long start = System.currentTimeMillis();
		while(true) {
			int c = fis.read();
			if(c == -1) break;
			fos.write(c);
			
		}
		long end = System.currentTimeMillis();
		
		System.out.println( (end - start)/1000. + "초"   );

		
		// close --> 자원 해제를 위해 대게 fianlly 블록에 있어야한다.
		fis.close();
		fos.close();
		System.out.println("복사 완료");
		
		System.out.println("buffer 시작");
		
		FileInputStream fis2 = null;
		FileOutputStream fos2 = null;
		BufferedOutputStream bos = null;
		BufferedInputStream bis =   null;
		
		try {
			fis2 = new FileInputStream("iodata/test.jpg");
			fos2 = new FileOutputStream("iodata/buffred.jpg");
			
			// 버퍼 사용 객체 연결
			bis=  new BufferedInputStream(fis2);
			bos = new BufferedOutputStream(fos2);
			start = System.currentTimeMillis();
			
			// 복사 수행
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			
			end = System.currentTimeMillis();
			System.out.println( (end - start)/1000. + "초"   );
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			// 닫을대는 반대로 닫아야함
			FileClose.close(bos, fos2);
			FileClose.close(bis, fis2);
		}
		
		
	}
}
