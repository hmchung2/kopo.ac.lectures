package kr.ac.kopo.day17;

public class ThreadMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA ta = new AAA();
		BBB tb = new BBB();
		ta.start();
		tb.start();
	}

}

class AAA extends Thread {
	@Override
	public void run() {
		int a = 0;
		while (true) {
			System.out.println(a + " go!!!");
			if (a == 100)
				break;
			a++;
		}
	}
}

class BBB extends Thread {
	@Override
	public void run() {
		int a = 0;
		while (true) {
			System.out.println(a + "\t stop!!!");
			if (a == 100)
				break;
			a++;
		}
	}
}