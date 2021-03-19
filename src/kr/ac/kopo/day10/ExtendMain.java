package kr.ac.kopo.day10;

class One {
	One(){
		System.out.println("One 생성자 호출...");
	}
}

class Two extends One{
	Two(){
		// super(); 숨어 있다
		System.out.println("Two 생성자 호출...");
	}
}

class Three extends Two{
	Three(){
		System.out.println("Three 생성자 호출...");
	}
}


public class ExtendMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three t = new Three();
		
	}
}
