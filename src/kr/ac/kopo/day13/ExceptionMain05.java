package kr.ac.kopo.day13;

import java.util.Scanner;

/*
 * 등록할 ID를 입력하세요 : hello1234
 * ID는 최대 8글자만 가능합니다
 * 
 * 등록할 ID를 입력하세요 : hello123
 * ID를 등록하였습니다.
 * 
 */

public class ExceptionMain05 {

	public static void register() throws checkIDException {
		System.out.println("등록할 ID 를 입력하세요");
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		sb.append(sc.nextLine());
		String id2 = sb.toString();
		sb.setLength(0);
		if (id2.length() > 8) {
			throw new checkIDException("ID는 최대 8글자만 가능합니다!!!!!!!!!!!!!.");
		}
		System.out.println("id 등록 완료");
	}

	public static void main(String[] args) throws checkIDException{
//		System.out.println("등록할 ID 를 입력하세요");
//		Scanner sc = new Scanner(System.in);
//		StringBuffer sb = new StringBuffer();
//		sb.append(sc.nextLine());
//		String id = sb.toString();
//		sb.setLength(0);
//		
//		try {
//		if(id.length() > 8) {
//			throw new Exception("ID는 최대 8글자만 가능합니다.");
//		} else {
//			System.out.println("ID 를 등록하였습니다.");
//		}} catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("another");
//		
//		if(id.length() > 8) {
//			throw new checkIDException("ID는 최대 8글자만 가능합니다!!!!!!!!!!!!!.");}
//
//		
//		System.out.println("another2");	

//		try {
//			register();
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("error cmmon");
//			e.printStackTrace();
//		}

		register();

		
		
	}
}


abstract class tttt{
	abstract void tttt();
	protected abstract void ttttttt();
	//private abstract void tttttttttttttttttttt();
	public abstract void t5tttttt();
	
}

