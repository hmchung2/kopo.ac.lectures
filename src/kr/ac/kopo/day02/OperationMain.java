package kr.ac.kopo.day02;

public class OperationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a = 10;
		int b = 5;
		int max = (a > b)?a:b;
		System.out.println(max);
		max = (a > b)?a:b;
		
		String test;
		test = (a > b)?"first":"second";
		System.out.println(test);
		
		
		
		//(a > b)?System.out.println("first again");:System.out.println("second again");

		int a1 = 1 ,  b1 = -1 , c1 = 0;
		
		boolean operation_testing;
		//                    1             
		operation_testing = a1++ > 0 || b1++ > -1 && c1++ >1;
		System.out.println(operation_testing);
		System.out.println("a1 : " + a1  + " b1 : " + b1 + " c1 : " + c1);
		
		a1 = 1;
	    b1 = -1;
	    c1 = 0;
	    //                       1          (2           3)
		operation_testing = a1++ > 5 || b1++ > -2 && c1++ >1;
		System.out.println(operation_testing);
		System.out.println("a1 : " + a1  + " b1 : " + b1 + " c1 : " + c1);


	}

}
