package kr.ac.kopo.day12;

import java.util.Arrays;

import java.util.Random;

class divide {
	double result;

	divide(int x, int y) {
		result = x / y;
	}

	double getResult() {
		return result;
	}

}

public class Exception01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Start ....");
		Random r = new Random();

		int[] numArr = new int[5];
		int num;
		for (int i = 0; i < numArr.length; i++) {
			num = r.nextInt(5);
			numArr[i] = num;
		}

		System.out.println(Arrays.toString(numArr));

		String str = null;

		try {

			System.out.println("first letter" + str.charAt(0));

			for (int i = 0; i < numArr.length; i++) {
				System.out.println(new divide(5, numArr[i]).getResult());

//		} catch (ArithmeticException e) {
//			
//			System.out.println("arithmetic exception occured");
//			//System.out.println(e);
//			e.printStackTrace();
//			//System.out.println(e.getMessage());
//		} catch (NullPointerException ne){
//			System.out.println("null point exception");
//			
//		} 
//		catch (ArithmeticException | NullPointerException eee) {
//			
//		}
			}
		} catch (Exception e /* 묵시적 형변환 */) {
			e.printStackTrace();

		} finally {

			System.out.println("finally activated");
		}

		System.out.println("Main End ....");

	}

}
