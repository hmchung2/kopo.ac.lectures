package kr.ac.kopo.day08;

public class Member {
	String name;
	int age;
	String bloodType;
	
	public Member(){
		name = "알수없음";
		age = -1;
		bloodType = "알수없음";
	}
	
	public Member(String name) {
		this.name = name;
		this.age = -1 ;
		this.bloodType = "알수없음";
	}
	
	
	public Member(String name , int age , String bloodtype){
		this.name = name;
		this.age = age;
		this.bloodType = bloodtype;
	}
	
	public Member(String name , int age) {
		this(name , age , "알수없음");
	}
	
	void info(){
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 혈액형 : " + bloodType);
	}

}
