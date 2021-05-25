package kr.ac.kopo.day17;

class SyncThread extends Thread {

	private Sync sync;
	private int type;

	public SyncThread(Sync sync, int type) {
		// TODO Auto-generated constructor stub
		this.sync = sync;
		this.type = type;
	}

	@Override
	public void run() {
		switch (type) {
		case 1:
			sync.a();
			break;
		case 2:
			sync.b();
			break;
		case 3:
			sync.c();
			break;
		case 4:
			sync.d();
			break;
		}
	}
}

public class SyncMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sync sync = new Sync();
		SyncThread st = new SyncThread(sync, 1);
		SyncThread st2 = new SyncThread(sync, 2);
		SyncThread st3 = new SyncThread(sync, 3);
		SyncThread st4 = new SyncThread(sync, 4);
		st4.start();
		st.start();
		st2.start();
		st3.start();

	}
}

class Sync {

	int main = 0;

	// synchronized 동기화 시켜서 하나 작업에 락을 걸어노음
	public synchronized void a() {
		for (int i = 0; i < 10; i++) {
			System.out.print('a');
//			System.out.print(main);
			main++;
		}
	}

	public synchronized void b() {
		for (int i = 0; i < 10; i++) {
			System.out.print('b');
//			System.out.print(main);
			main++;
		}
	}

	public synchronized void c() {
		for (int i = 0; i < 10; i++) {
			System.out.print('c');
//			System.out.print(main);
			main++;
		}
	}

	public void d() {
		System.out.print(1);
		System.out.print(2);
		// 동기화 블록
		synchronized (this) {
			System.out.print(3);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(4);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(5);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print(6);
	}

}
