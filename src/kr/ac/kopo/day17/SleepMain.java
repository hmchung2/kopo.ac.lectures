package kr.ac.kopo.day17;

import java.util.Date;

public class SleepMain {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*
		 * System.out.println("Thread 가 2초동안 잠이 들겠습니다");
		 * 
		 * try { Thread.sleep(2000); } catch (Exception e) { e.printStackTrace(); }
		 * System.out.println("Thread 가 깨어났습니다.");
		 */

		TimeThread tt = new TimeThread();
		tt.start();

		while (true) {
			System.out.println("go!!!!");
			try {
				// sleep 이 없을 경우 위에 쓰레드가 들어올 자리가 생기지 않는다. 조금이라도 빈틈을 열어 놓아서 여러개의 쓰레드가 돌 수 있도록
				// 만들어야함.
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}

class TimeThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("현재 시간 : " + new Date().toLocaleString());
		}
	}
}