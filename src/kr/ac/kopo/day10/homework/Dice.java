package kr.ac.kopo.day10.homework;

import java.util.Random;
import java.util.Scanner;

public class Dice implements Game{
	Scanner sc = new Scanner(System.in);
	StringBuffer sb = new StringBuffer();
	
	Random r = new Random();
		
	public int startGame(int you) {
		int me = r.nextInt(6) + 1;
		
		System.out.println("컴퓨터의 숫자는 " + me + " 입니다.");
		
		if(you == me) {
			System.out.println("You win");
			return 2;
		} else {
			System.out.println("You lose");
			return 0;
		}
	}
	
	public int askNumber() {
		System.out.println("1 에서 6 숫자중 선택");
        sb.append(sc.next());
        while( (int)sb.charAt(0)  < (int)'1' || (int)sb.charAt(0) > (int)'3'){
        	sb.setLength(0);
        	System.out.println("다시 입력하세요");
        	System.out.println("1 에서 6 숫자중 선택");
    		sb.append(sc.next());
        }
		return (int)sb.charAt(0);	
	}
}
