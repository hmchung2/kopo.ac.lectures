package kr.ac.kopo.day08;

/*
 * 생성자의 특징
 * 1. 클래스명 동일
 * 2. 반환형이 존재하지 않음
 * 3. 디폴트 생성자 지원
 * 4. 오버로딩 지원
 * 5. 객체의 멈버변수 초기화 당담
 */

public class Car {
	int num = 5;
	String name ; 
	Car(int x){
		num = x;
	}
	Car(){
		num = 5;
	}
	
	Car(String s){
		name = s;
	}
	
	
	void print() {
		System.out.println(this.num);
	}
	

}
