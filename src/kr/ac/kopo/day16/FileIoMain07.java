package kr.ac.kopo.day16;

import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

public class FileIoMain07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("iodata/FileIoMain.java");
			fw = new FileWriter("iodata/FileIoMain.txt");

			while (true) {
				int c = fr.read();
				if(c== -1) break;
				fw.write(c);
			}
			fw.flush();
			System.out.println("파일 복사 완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fr, fw);
		}

	}
}
