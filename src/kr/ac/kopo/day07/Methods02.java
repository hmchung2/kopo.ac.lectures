package kr.ac.kopo.day07;

// 같은 패키지 안에서는 다른 클래스 전부 임포트
//import kr.ac.kopo.day07.Methods01;

public class Methods02 {
	
	static void printstar(char c , int cnt) {
		for(int i = 0 ; i < cnt ; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	static testing testyo(int x) {

		testing new_class = new testing();
		return new_class;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printstar('*', 10);
		printstar('-', 10);
		
		testing newClass = testyo(5);
		newClass.test();
		
	
	}
}
