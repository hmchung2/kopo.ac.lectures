package kr.ac.kopo.day11;

import java.util.Scanner;

public class Menu {
	
	Printer printer;
	Scanner sc = new Scanner(System.in);

	public int selectMenu() {
		System.out.println("프린터를 선택하세요 (1.LG 2.삼성, 3.HP) =>   ");
		int no = sc.nextInt();
		sc.nextLine();
		return no;		
	}

	public void print(int no) {
		switch (no) {
		case 1: {
			printer = new LGPrinter();
			break;
		}
		case 2:
			printer = new SamsungPrinter();
			break;
		case 3:
			System.out.println("선택 1:레이저 2:잉크");
			int hpChoice = sc.nextInt();
			if(hpChoice == 1) {
				printer = new HPLaserPrinter();
			} else if(hpChoice == 2) {
				printer = new HPInkPrinter();
			}
			break;
		}
		
		if(printer == null) {
			System.out.println("no company selected");
		} else {
			printer.print();
		}
		
	}
	
	public void choice() {
		int type = selectMenu();
		print(type);
	}
	
}
