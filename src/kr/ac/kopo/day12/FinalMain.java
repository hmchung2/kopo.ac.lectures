package kr.ac.kopo.day12;

import kr.ac.kopo.day11.UserMain;

class Super {
	public final int MAX = 500;

	public /* final */ void info() {
		System.out.println("Super 클래스에서 정의된 매소드");
	}
}

class Sub extends Super {
	public void info() {
		System.out.println("sub class");
		int ok = MAX;
		// MAX = 50; error
	}
}

final class FC {

}

class Sub2 extends UserMain {

}

public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub2 obj = new Sub2();
		obj.main(args);

		String test = new String("alright");
		System.out.println(test);

	}

}
