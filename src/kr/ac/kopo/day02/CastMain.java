package kr.ac.kopo.day02;

public class CastMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 형변환 없음
		System.out.println(10 + 20);
		
		// 묵시적 형변환 (큰 타입을 따라가게 되있음.)
		// 타입을 쓰지 않아도 자연스럽게 바뀜
		System.out.println('A' + 20);
		System.out.println(12.3 + 20);

		// 명시적 형변환. 생략을 하지 못하고 무조건 타입 종류를 앞에 작성 해야함.
		System.out.println((int)12.3 + 20);
        int num = (int)12.5;
        System.out.println(num);
        System.out.println("Done");
		
        
        // 전이증가자 , 후이증가자
        num = 10;
        System.out.println(++num);
        num = 10;
        System.out.println(num++);

        

        
	}

}
