package kr.ac.kopo.day17;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File fileObj = new File("iodata/a.txt");
		 String name = fileObj.getName();
		 String parent = fileObj.getParent();
		 String path = fileObj.getPath(); String
		 abPath = fileObj.getAbsolutePath();

		 boolean bool = fileObj.isFile();
		 System.out.println(bool ? "파일입니다" : "파일이 아닙니다");

		 bool = fileObj.isDirectory();
		 System.out.println(bool ? "디렉토리입니다" : "디렉토리 아닙니다");

		 bool = fileObj.exists();
		 System.out.println(bool ? "존재합니다" : "존재하지 않습니다.");

		 long size = fileObj.length();
		 System.out.println("파일 크기 : " + size);

		 System.out.println("파일명 : " + name);
		 System.out.println("부모 이름 : " + parent);
		 System.out.println("경로 : " + path);
		 System.out.println("절대 경로 : " + abPath);

		 long time = fileObj.lastModified();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy년  MM월 dd일 hh시 mm문 ss초");
		 System.out.println("마지막 수정 날짜" + sdf.format(new Date(time)));

		 bool = fileObj.canRead();
		 System.out.println(bool ? "읽기 가능" : "읽기 불가능");

		 bool = fileObj.canWrite();
		 System.out.println(bool ? "쓰기 가능" : "쓰기 불가능");

		File dirObj = new File("iodata");
		System.out.println(dirObj.exists() ? "유효한 디렉토리 입니다" : "유효하지 않는 디렉토리 입니다");

		System.out.println(dirObj.isDirectory() ? "디렉토리입니다" : "디렉토리가 아닙니다.");

		System.out.println(Arrays.toString(dirObj.list()));

//		File newDirObj = new File("iodata/새폴더");
//		if (!newDirObj.exists()) {
//			boolean bool = newDirObj.mkdir();
//
//			System.out.println(bool ? "생성 성공" : "생성 실패");
//		} else {
//			System.out.println("이미 폴더가 존재 합니다.");
//		}
//
//		newDirObj = new File("iodata/새새폴더/오리");
//		if (!newDirObj.exists()) {
//			// s 붙이면 하위 경로 전부 생성
//			boolean bool = newDirObj.mkdirs();
//
//			System.out.println(bool ? "생성 성공" : "생성 실패");
//		} else {
//			System.out.println("이미 폴더가 존재 합니다.");
//		}
//		// 맨마지막만 지워진다.
//		boolean bool = newDirObj.delete();
//		System.out.println(bool ? "삭제 성공" : "삭제 실패");

	}
}
