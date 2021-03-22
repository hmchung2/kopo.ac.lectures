package kr.ac.kopo.day11;

public class ChildMain {

	public static void print(Parent p) {
		p.info();
		// p.sleep(); 에러

		if (p instanceof Child02) {
			System.out.println("second child");
			Child02 p1 = (Child02) p;
			p1.sleep();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("p2");
		Parent p2 = new Child02();
		// Child02 c = (Child02)p2;
		print(p2);

	}
}