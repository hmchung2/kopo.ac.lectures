package kr.ac.kopo.day15;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

public class FileIoMain {
	
	public static void write() {
		char c = 'A';
		
		
		int i = 97;
		double d =12.34;
		FileOutputStream fos = null;
		DataOutputStream dos =null;
		try {
			fos = new FileOutputStream("iodata/test.dat");
			dos = new DataOutputStream(fos);
			dos.writeChars( String.valueOf(c));
			dos.writeInt(i);
			dos.writeDouble(d);
			System.out.println("wrote");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos,fos);
		}
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis =  new FileInputStream("iodata/test.dat");
			dis = new DataInputStream(fis);
			char c= dis.readChar();
			int i = dis.readInt();
			double d = dis.readDouble();
			
			System.out.println("읽어온 데이터 출력");
			System.out.println("문자 : " + c);
			System.out.println("정수 : "+ i);
			System.out.println("실수 : " + d);	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(dis , fis);
		}
		
	}
	
	public static void write2() {
		Dog d = new Dog("doy" , 4 , "pud");
		        Dog d2 = new Dog("wow", 5 , "second");
		
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos =new FileOutputStream("iodata/dogInfo.txt");
			dos = new DataOutputStream(fos);
			
			//dos.writeChars(d.getName() + " : " + d.getAge() + " : " + d.getKind() + "\n" ) ;
			dos.writeUTF(d.getName() + " : " + d.getAge() + " : " + d.getKind()  + "\n");
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {	
			FileClose.close(dos, fos);			
		}
	}
	
	public static void read2() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("iodata/dogInfo.txt");
			dis = new DataInputStream(fis);
			
			System.out.println("reading utf");
			String data = dis.readUTF();
			System.out.println(data);

			System.out.println("now split");
			String[] strArr = data.split(":");
			System.out.println(Arrays.toString(strArr));
			System.out.println(strArr.length);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public static void main(String[] args) {		
		write();
		read();
		write2();
		read2();

	}
}