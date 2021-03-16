package kr.ac.kopo.day07;

/*
 *  메소드 오버로딩 (overloading)
 *  : 같은 클래스내에 동명의 메소드이면서 매개변수의 개수 또는 타입이 다른 것
 *  
 *  
 */


public class Methods04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m =  new Method();
		m.call("testing");
		m.call();
		Method m2 = new Method("New");
		m2.getMyv();
		m.getMyv();

	}
}


class Method{
	String myv;
	Method(){
	}
	Method(String x){
		System.out.println("printing : " + x);
		myv = x;
	}
	void call(){
		System.out.println("Call () 메소드 호출");
	}
	void call(String x) {
		System.out.println("Call (string x) 메소드 호출 " +x );
	}
	void getMyv() {
		System.out.println(myv);
	}	
}
