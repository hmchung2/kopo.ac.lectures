package kr.ac.kopo.day17;

/*
 * Thread 구성 2가지
 * 1. Thread 클래스를 상속 구현
 * 2. Runnable 인터페이스를 상속 구현
 */

class ExtendThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i + 1 + "번째 인형 눈 붙이기 ....");
		}
	}
}

class ImplementThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i + 1 + "번째 인형 코 만들기 ...");
		}
	}
}

public class ThreadMain02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendThread et = new ExtendThread();
		ImplementThread it = new ImplementThread();
		Thread t = new Thread(it);

		System.out.println("감독을 시작합니다.");
		et.start();
		t.start();
		for (int i = 0; i < 100; i++) {
			System.out.println(i + 1 + "번째 감독중");
		}
		try {
			et.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("감독을 종료합니다.");
	}
}
