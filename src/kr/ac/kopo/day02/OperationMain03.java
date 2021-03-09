package kr.ac.kopo.day02;

//자동 import : ctrl + shift + o
//ctrl+shift+f ---> 자동 포멧팅
import java.util.Scanner;

public class OperationMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();

		boolean result = (num > 0 && num % 2 == 0);
		System.out.println(num + "의 짝수 유무 : " + result);
	}

}
