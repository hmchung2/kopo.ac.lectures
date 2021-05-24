package kr.ac.kopo.day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import kr.ac.kopo.util.FileClose;

public class FileIoMain11 {
	
	public static void write() throws Exception {
		/*
		 * 작성할 객체 클래스에서 implements Serializable 해야함
		 */
		UserInfo user = new UserInfo("홍길동", 25, "서울시 서초구");
		FileOutputStream fos = new FileOutputStream("iodata/objectData.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		oos.flush();
		FileClose.close(oos);
		FileClose.close(fos);
		System.out.println("저장 완료");
		
	}
	
	public static void read() throws Exception {
		FileInputStream fis = new FileInputStream("iodata/objectData.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);		
		
		UserInfo user = (UserInfo) ois.readObject();
		FileClose.close(ois);
		FileClose.close(fis);		
		System.out.println(user);
	}
	
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		read();
	}

}
