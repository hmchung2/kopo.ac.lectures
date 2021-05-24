package kr.ac.kopo.day16;

import java.io.Serializable;

/*
 * alt + shift + s 누른 후 선택 c 선택 : 기본 생성자
 * alt + shift + s 누른 후 선택 o 선택 : 매개변수 생성자
 * alt + shift + s 누른 후 선택 r 선택 : getter/setter 생성
 * alt + shift + s 누른 후 선택 v 선택 : override 생성
 * alt + shift + s 누른 후 선택 s 선택 : toString() Override 
 */

public class UserInfo implements Serializable {
	private String name;
	private transient int age;  // 객체 직렬화 시킬때 age는 제거 된다.
	private String addr;
	
	public UserInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
}
