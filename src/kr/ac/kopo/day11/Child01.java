package kr.ac.kopo.day11;

public class Child01 extends Parent {
	
	String name = "자식01";
	Child01(){
	}
	Child01(String name){
		this.name = name;
	}
	
	public void play() {
		System.out.println("나는 놉니다");
	}
	
	@Override
	public void info() {
		System.out.println("Child01 클래스에서 재정의된 메소드" + "my name " + this.name);
		System.out.println("Child01 클래스에서 재정의된 메소드" + "my name " + super.name);
	}


}
