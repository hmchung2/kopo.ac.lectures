package assignment0316;

import java.util.Scanner;

public class Calculator {
	String num1;
	String num2;

	Scanner sc = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);

	int intnum1;
	int intnum2;

	double doublenum1;
	double doublenum2;

	void twonums() {
		System.out.println("첫번째 숫자를 입력");
		num1 = sc.next();
		System.out.println("두번째 숫자를 입력");
		num2 = sc2.next();
	}

	void print(String x, String y, String oper, String r) {
		System.out.print(x + oper + y + " = " + r);
		System.out.println();
	}

	void printadd(String x, String y, String r) {
		print(x, y, "+", r);
	}

	void printminus(String x, String y, String r) {
		print(x, y, "-", r);
	}

	void printdivide(String x, String y, String r) {
		print(x, y, "/", r);
	}

	void printmulti(String x, String y, String r) {
		print(x, y, "*", r);
	}

	void add(double x, double y) {
		printadd("" + x, "" + y, "" + (x + y));
	}

	void add(int x, int y) {
		printadd("" + x, "" + y, "" + (x + y));
	}

	void minus(double x, double y) {
		printminus("" + x, "" + y, "" + (x - y));
	}

	void minus(int x, int y) {
		printminus("" + x, "" + y, "" + (x - y));
	}

	void multiply(double x, double y) {
		printmulti("" + x, "" + y, "" + (x * y));
	}

	void multiply(int x, int y) {
		printmulti("" + x, "" + y, "" + (x * y));
	}

	void divide(double x, double y) {
		printdivide("" + x, "" + y, "" + (x / y));
	}

	void divide(int x, int y) {
		printdivide("" + x, "" + y, "" + ( (double)x / (double)y));
	}

	void checkPrivate(int x) {
		if (x < 1) {
			System.out.println(" 소수 체크를 하기 위해서는 1 보다 큰수가 필요합니다");
		} else {

			boolean check = true;
			for (int i = 2; i < x ; i++) {
				if (x % i == 0) {
					check = false;
					break;
				}
			}
			System.out.println("" + x + "  소수체크 : " + check);
		}
	}

	void checkPrivate(int x, int y) {
		checkPrivate(x);
		System.out.println();
		checkPrivate(y);
	}

	void finalcheckPrivate() {
		if (num1.contains(".") || num2.contains(".")) {
			System.out.println("정수만 소수값 확인 할 수 있습니다");
		} else {
			intnum1 = Integer.parseInt(num1);
			intnum2 = Integer.parseInt(num2);
			checkPrivate(intnum1, intnum2);
		}
	}

	void finaladd() {
		if (num1.contains(".") || num2.contains(".")) {
			doublenum1 = Double.parseDouble(num1);
			doublenum2 = Double.parseDouble(num2);
			System.out.println("adding double");
			add(doublenum2, doublenum1);
		} else {
			intnum1 = Integer.parseInt(num1);
			intnum2 = Integer.parseInt(num2);
			add(intnum1, intnum2);
		}
	}

	void finalminus() {
		if (num1.contains(".") || num2.contains(".")) {
			doublenum1 = Double.parseDouble(num1);
			doublenum2 = Double.parseDouble(num2);
			minus(doublenum2, doublenum1);
		} else {
			intnum1 = Integer.parseInt(num1);
			intnum2 = Integer.parseInt(num2);
			minus(intnum1, intnum2);
		}
	}

	void finalmultiply() {
		if (num1.contains(".") || num2.contains(".")) {
			doublenum1 = Double.parseDouble(num1);
			doublenum2 = Double.parseDouble(num2);
			multiply(doublenum2, doublenum1);
		} else {
			intnum1 = Integer.parseInt(num1);
			intnum2 = Integer.parseInt(num2);
			multiply(intnum1, intnum2);
		}
	}

	void finaldividie() {
		if (num1.contains(".") || num2.contains(".")) {
			doublenum1 = Double.parseDouble(num1);
			doublenum2 = Double.parseDouble(num2);
			divide(doublenum2, doublenum1);
		} else {
			intnum1 = Integer.parseInt(num1);
			intnum2 = Integer.parseInt(num2);
			divide(intnum1, intnum2);
		}
	}

}
