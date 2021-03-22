package kr.ac.kopo.day11;

public class Child02 extends Parent {
	private String name = "자식02";
	int age = 10;
	
	public void sing() {
		System.out.println("나는 노래를 부릅니다");
	}
	
	public void sleep() {
		System.out.println("나는 잡니다");
	}
		
	
	@Override
	public void info() {
		System.out.println("Child02 클래스에서 재정의된 메소드" + this.name);
	}

}
