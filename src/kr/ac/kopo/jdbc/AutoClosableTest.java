package kr.ac.kopo.jdbc;

public class AutoClosableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Test t = new Test();) {

			System.out.println("Starting");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Test implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("Closing ....");
	}
}
