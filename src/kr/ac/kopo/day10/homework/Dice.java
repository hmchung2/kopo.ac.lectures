package kr.ac.kopo.day10.homework;

import java.util.Random;
import java.util.Scanner;

public class Dice implements Game{
	Scanner sc = new Scanner(System.in);
	StringBuffer sb = new StringBuffer();
	Random r = new Random();

	// 게임 진행
	// 이기면 2 반환 지면 0반환
	public int startGame(int you) {
		// 컴퓨터 숫자 선택
		int me = r.nextInt(6) + 1;
		
		System.out.println("컴퓨터의 숫자는 " + me + " 입니다.");
		// 숫자 같으면 승리
		if(you == me) {
			System.out.println("You win");
			return 2;
		} else {
			System.out.println("You lose");
			return 0;
		}
	}
	// 1에서 6 숫자중 어느 숫자 선택하는지 물어보는 함수
	public int askNumber() {
		sb.setLength(0);
		System.out.println("1 에서 6 숫자중 선택");
        sb.append(sc.next());
        // 데이터 자료 파싱
        int cnum = Integer.parseInt(sb.charAt(0) + "");
		// 다른 값 입력시 계속 물어보기
        while( cnum  < 1 || cnum > 6){
        	sb.setLength(0);
        	System.out.println("다시 입력하세요");
        	System.out.println("1 에서 6 숫자중 선택");
    		sb.append(sc.next());
    		cnum = Integer.parseInt(sb.charAt(0) + "");
        }
		return cnum;
	}
}
