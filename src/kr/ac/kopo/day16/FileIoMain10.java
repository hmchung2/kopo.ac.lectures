package kr.ac.kopo.day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import kr.ac.kopo.util.FileClose;

public class FileIoMain10 {
	
	public static void write() throws Exception {
		UserInfo user = new UserInfo("홍길동", 25, "서울시 서초구");
		FileWriter fw = new FileWriter("iodata/userInfo.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(user.getName());
		pw.println(user.getAge());
		pw.println(user.getAddr());
		pw.flush();
		FileClose.close(pw);
		FileClose.close(fw);
		
	}
	
	public static void read() throws Exception {
		FileReader fr = new FileReader("iodata/userInfo.txt");
		BufferedReader br = new BufferedReader(fr);
		String name = br.readLine();
		int age = Integer.parseInt(br.readLine());
		String addr = br.readLine();
		UserInfo user = new UserInfo(name, age, addr);
		System.out.println("파일 로드 완료");
		System.out.println(user);	
	}
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		write();
		read();
	}

}
