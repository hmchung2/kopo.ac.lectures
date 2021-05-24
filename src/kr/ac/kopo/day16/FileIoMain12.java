package kr.ac.kopo.day16;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.FileClose;
import oracle.net.aso.l;

public class FileIoMain12 {

	public static void write2() {
		
		UserVO user = new UserVO("홍길동",26 , "010-1111-2222","서울시 서초구");
		UserVO user2 = new UserVO("구길동",26 , "010-3333-4444","경기도 광명시 철산동");
		UserVO user3 = new UserVO("윤길동",26 , "010-5555-6666","서울시 송파구");
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(user);
		list.add(user2);
		list.add(user3);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("iodata/userList.txt");
			oos = new ObjectOutputStream(fos);
			for(UserVO u : list ) {
				oos.writeObject(u);
			}
			oos.flush();
			System.out.println("저장 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos);
			FileClose.close(fos);
		}
	}
	
public static void write() {
		
		UserVO user = new UserVO("홍길동",26 , "010-1111-2222","서울시 서초구");
		UserVO user2 = new UserVO("구길동",26 , "010-3333-4444","경기도 광명시 철산동");
		UserVO user3 = new UserVO("윤길동",26 , "010-5555-6666","서울시 송파구");
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(user);
		list.add(user2);
		list.add(user3);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("iodata/userList.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.flush();			
			System.out.println("저장 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos);
			FileClose.close(fos);
		}
	}
	
	public static void read2() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("iodata/userList.txt");
			ois = new ObjectInputStream(fis);
			
			List<UserVO> list = new ArrayList<UserVO>();
			
			while(true) {
				try {
					UserVO user = (UserVO)ois.readObject();
					list.add(user);					
				} catch (EOFException e) {
					// TODO: handle exception
					break;
				}
			}
			System.out.println("읽기 완료");
			
			for(UserVO user : list) {
				System.out.println(user);
			}			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			FileClose.close(ois);
			FileClose.close(fis);
		}
		
	}

	
	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			 fis = new FileInputStream("iodata/userList.txt");
			 ois = new ObjectInputStream(fis);
			 @SuppressWarnings("unchecked")
			List<UserVO> list =  (List<UserVO>) ois.readObject();			 
			 for(UserVO u : list){
				 System.out.println(u);
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(ois);
			FileClose.close(fis);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		write2();
		read2();

	}

}
