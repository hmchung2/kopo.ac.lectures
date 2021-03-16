package kr.ac.kopo.day07;


/*
 * 오버로딩 발생시 형변환 가능한 함수 중에서 가장 사이즈가 작은것부터 실행이 된다
 */

public class Methods05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println((double)'A');
		
		TypeTest testobjecTest = new TypeTest();
		testobjecTest.call('A');
		
		testobjecTest.call("A" , 5);
	}
}


class TypeTest{	
	void call(double i ) {
		System.out.println("double i processing");
	}
	void call(int i ) {
		System.out.println("int i processing");
	}	
	void call(int i , String j) {
		System.out.println("int first string second");
	}
	void call(String j , int i ){
		System.out.println("string first int second");
	}
}
