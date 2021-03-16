package assignment0316;
import java.util.Scanner;

public class Icecream{
	String name;
	int price;
	Scanner sc = new Scanner(System.in);
	void getAttr() {
		System.out.print("아이스크림명 : ");
		name = sc.nextLine();
		
		System.out.print("아이스크림 가격 : ");
		price = sc.nextInt();
		sc.nextLine();
	}
	
	void getAttr(String sen) {
		System.out.println(sen);
		getAttr();
	}
	

	void print(){
		System.out.println(name + "       " + price );
	}
	void print(int x) {
		System.out.print(x +"     ");
		print();
	}
}


