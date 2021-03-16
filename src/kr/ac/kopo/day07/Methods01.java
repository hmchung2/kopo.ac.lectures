package kr.ac.kopo.day07;


public class Methods01 {
	
	static void printstart() {
		System.out.println("******************");
		int temp = 5;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printstart();		
		printstart();
		System.out.println("wow");
		System.out.println("wow");
		System.out.println("wow");
		printstart();
		testing objecTesting = new testing();
		objecTesting.test();
		
		printstart();
		printstart();
		printstart();
		System.out.println("wow");
		System.out.println("wow");
		System.out.println("wow");
		System.out.println("wow");
				
	}
}

class testing{
	void test(){
		System.out.println("hello");
	}
}
