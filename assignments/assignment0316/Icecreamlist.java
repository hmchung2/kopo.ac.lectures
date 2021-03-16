package assignment0316;

import java.util.Scanner;

public class Icecreamlist{
	int len;
	Icecream icecream =  new Icecream();
	Icecream[] icecreamlist;
	Scanner sc = new Scanner(System.in);

	void getLen(int x) {
		len = x;
	}
	
	void getLen() {
		int x = sc.nextInt();
		sc.nextLine();
		getLen(x);
	}
	
	
	void getlist() {
		icecreamlist = new Icecream[len];
		for(int i = 0 ; i < len ; i ++) {
			icecream.getAttr("*** " + (i+1) +  "번째 아이스크림 구매정보 ***" );
			icecreamlist[i] = icecream;
		}
	}
	void printinfo() {
		System.out.println("번호    아이스크림명     가격");
	}
	
	void printlist(int x) {
		icecreamlist[x].print(x);
	}
	void printlist(int start ,int end) {
		for(int i = start ; i < end; i ++) {
			printlist(i);
		}
	}
	
	void printlist() {
		for(int i = 0 ; i < icecreamlist.length; i ++) {
			printlist(i);
		}
	}
}
