package studyexam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import kr.ac.kopo.day15.Dog;
import kr.ac.kopo.util.FileClose;

public class InputAPI02 {

	public static void main(String[] args) {

		write();
		read();
	}
	
	public static void read() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("iodata/dogInfo.txt");
			dis = new DataInputStream(fis);
			
			String[][] data = new String[2][3] ;
			for(int i = 0 ; i < 2; i ++) {
				String current = dis.readUTF();
				String[] strArr = current.split(":");				
				data[i] =  strArr;
				System.out.println("reading utf");
				System.out.println(current);
			}
			
			for(int i = 0 ; i < data.length ; i ++) {
				System.out.println(Arrays.toString(data[i]));
			}
			
			//System.out.println(Arrays.toString(data[1]));
			
			//Dog d = new Dog(strArr[0], Integer.parseInt(strArr[1]), strArr[2]);
			//System.out.println(d);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);
		}
	}
		
	public static void write() {
		
		Dog d = new Dog("앙꼬", 4, "푸들");
		Dog d2 = new Dog("공주", 2, "요크셔테리어");

		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {

			fos = new FileOutputStream("iodata/dogInfo.txt");
			dos = new DataOutputStream(fos);

			for (int i = 0; i < 2; i++) {
				if (i == 0) {
					dos.writeUTF(d.getName() + ":" + d.getAge() + ":" + d.getKind());

				} else {
					dos.writeUTF(d2.getName() + ":" + d2.getAge() + ":" + d2.getKind());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}
		System.out.println("dogInfo.txt에 저장완료...");
	}
}

