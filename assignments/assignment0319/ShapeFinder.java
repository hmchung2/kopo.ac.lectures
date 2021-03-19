package assignment0319;

import java.util.Scanner;

//2. 다음의 결과를 보이는 프로그램을 작성
//
//도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => 1
//직사각형 선택시
//   Random하게 2 ~ 10사이의 정수 2개를 추출
//   가로 3, 세로 2의 직사각형 면적은 6입니다
//   
//도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => 2
//정사각형 선택시
//   Random하게 2 ~ 10사이의 정수 1개를 추출
//   가로 5의 정사각형 면적은 25입니다
public class ShapeFinder {
	
	private int shape;
	final double PI  = 3.14;
	private Scanner sc = new Scanner(System.in);
	
	private int firstnum;
	private int secondnum;

	boolean secondcheck;
	private String str;
	private String str2;
	private String shapeinfo;
	public void ask() {
		System.out.println("도형을 선택하세요");
		shape = sc.nextInt();
		sc.nextLine();
		switch(shape) {
		case  1: str = "가로";
				str2 = "세로";
				secondcheck = true;
				shapeinfo = "직사각형";
				break;
		case 2: 
			str = "면";
			secondcheck = false;
			shapeinfo = "정사각형";
			break;
		case 3:
			str = "아랫 면";
			str2 = "높이";
			secondcheck = true;
			shapeinfo = "삼각형";
			break;
		case 4:
			str = "반지름";
			secondcheck = false;
			shapeinfo = "원";
			break;
		}	
	}
	
	public int getRectangle(int x , int y) {
		return x * y;
	}
	public int getSquare(int x) {
		return x*x;
	}
	public int getTriangle(int x , int y) {
		return x * y / 2;
	}
	public double getRound(int x) {
		return ((double)x * 2 )  * PI ;
	}
	
	public int ask(String word) {
		System.out.print(word + "길이 입력 : ");
		int num = sc.nextInt();
		sc.close();
		return num;
	}
	
	public void askAll(){
		if (secondcheck == true) {
			firstnum = ask(str);
		} else {
			firstnum = ask(str);
			secondnum = ask(str2);
		}
	}
	
	public void answer() {
		
	}
	
	

	
	
	
	
	

	

}
