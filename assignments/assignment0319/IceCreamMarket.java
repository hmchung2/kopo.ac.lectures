package assignment0319;

import java.util.Scanner;

public class IceCreamMarket {
	static private int totalNum = 0;
	static private int totalPrice = 0;
	static private int totalClient = 0 ;
	
	private int currentCount;
	private int currentPrice;
	private String currentName;
	
	private String status;
	
	
	Scanner sc = new Scanner(System.in);
	
	public void askCount() {
		totalClient ++;
		System.out.println("아이스크림 몇개 구입 할래 ?");
		currentCount =  sc.nextInt();
		sc.nextLine();
		totalNum = totalNum+ currentCount;
	}
	
	public boolean getInfo() {	
		IceCreamArr currentIceArrs = new IceCreamArr(currentCount);
		for(int i = 0 ; i < currentCount ; i ++ ) {	
			System.out.println((i+1) +  "번");
			System.out.print("아이스크림명 : ");
			System.out.println();
			currentName = sc.nextLine();
			System.out.print("가격 : ");
			System.out.println();
			currentPrice = sc.nextInt();
			sc.nextLine();
			totalPrice = totalPrice + currentPrice;
			currentIceArrs.getinfo(new IceCream(currentName, currentPrice)  , i);	
		}
		currentIceArrs.printinfo();
		System.out.println("계속 구매 할래 (Y/N)? ");
		status = sc.nextLine();
		return processStatus(status);	
	}
	
	public boolean processStatus(String ans) {
		System.out.println(ans);
		if(ans.charAt(0) == 'y' || ans.charAt(0) == 'Y' ) {
			return true;
		} else {
			return false;
		}
	}
	
	public void printSellingInfo() {
		System.out.println("총 " + totalClient + "명의 고객이 아이스크림을 구매했습니다." );
		System.out.println("판매된 아이스크림 총개수  : " + totalNum);
		System.out.println("총 판매익 : " + totalPrice);
	}
	
	public void sell() {
		boolean selling = true;
		askCount();
		selling = getInfo();
		while(selling == true ) {
			askCount();
			selling = getInfo();			
		}
		printSellingInfo();
	}
}
