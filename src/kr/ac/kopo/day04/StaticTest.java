package kr.ac.kopo.day04;

public class StaticTest {
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.showData();
		Student s2 = new Student();
		s2.showData();
		// Student.b++;
		// s1.showData();
		
		Sub sub1 = new Sub();
		Sub sub2 = new Sub();

		sub1.printing2();
		sub1.printing2();
		sub2.printing2();
		sub2.printing2();
	}
}

class Student {
	int a; // initialized to zero
	static int b; // initialized to zero only when class is loaded not for each object created.

	Student() {
		// Constructor incrementing static variable b
		b++;
	}

	public void showData() {
		System.out.println("Value of a = " + a);
		System.out.println("Value of b = " + b);
	}
	// public static void increment(){
	// a++;
	// }

}


class Sub{
	int a;
	static int b ;
	static int c;
	int d;
	
	
	
	Sub(){
		b++;
		a++;
	}
	
	void printing2() {
		c = c + 5;
		d = d + 5;
		System.out.println("c : " + c);
		System.out.println("d : " + d);
	}
	
	public void printing() {
		System.out.println("a : " + a);
		System.out.println("b : " + b);

	}
	
}