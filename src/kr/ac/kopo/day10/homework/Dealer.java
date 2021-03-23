package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class Dealer {
	
	Scanner sc = new Scanner(System.in);
	StringBuffer sb = new StringBuffer();
	
	public char askGame() {
		System.out.println("게임을 선택하세요");
		System.out.print("A.가위바위보 \n B.주사위 값 맞추기 \n C.종료 \n");
        sb.append(sc.next());
        while( (int)sb.charAt(0)  < (int)'A' || (int)sb.charAt(0) > (int)'C'){
        	sb.setLength(0);
        	System.out.println("다시 입력하세요");
    		System.out.print("A.가위바위보 \n B.주사위 값 맞추기 \n C.종료 \n");
    		sb.append(sc.next());
        }
		return Character.toUpperCase(sb.charAt(0));
	}
}
