package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class Main {
	// 승리수
	public static int winningCount = 0;
	// 패배수
	public static int losingCount = 0;
	// 무승부 수
	public static int tieCount = 0;


	// A,a ,B,b, C,c 입력 할때까지 물어봐서 어느 게임을 할지 선택하는 함수
	public static char askGame(Scanner sc , StringBuffer sb) {
		sb.setLength(0);
		System.out.println("게임을 선택하세요");
		System.out.print("A.가위바위보 \nB.주사위 값 맞추기 \nC.종료 \n");
        sb.append(sc.next());
        char which =   Character.toUpperCase(sb.charAt(0));
        while( (int)which  < (int)'A' || (int)which > (int)'C'){
        	sb.setLength(0);
        	System.out.println("다시 입력하세요");
    		System.out.print("A.가위바위보 \nB.주사위 값 맞추기 \nC.종료 \n");
    		sb.append(sc.next());
    		which = Character.toUpperCase(sb.charAt(0));
        }
		return which;
	}

	// 게임 결과로 승패 개수 조정
	// 0 패배수 증가
	// 1 무승부수 증가
	// 2 승리수 증가
	public static void resultAdding(int x){
		if(x == 0) {
			losingCount++;
		} else if(x==1) {
			tieCount++;
		} else {
			winningCount++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너 클래스 객체 생성
		Scanner sc = new Scanner(System.in);
		// 스트링 버퍼 객체 생성
		StringBuffer sb = new StringBuffer();
		// 가위바위보 게임 객체 생성
		ScissorsRockPaper srp = new ScissorsRockPaper();
		// 주사위 게임 객체 생성
		Dice dice = new Dice();
		// 게임 종류 및 계속 진행 여부
		char status = askGame(sc , sb);
		// 'C' 종료 선택 하기 전까지 게임 계속 진행하는 while loop
		while(status != 'C') {
			if(status == 'A') {
				// 가위 바위 보 선택
				int num = srp.askNumber();
				// 가위 바위 보 게임 결과
				int result = srp.startGame(num);
				// 결과 반영
				resultAdding(result);
			}
			else if(status =='B') {
				// 1에서 6 숫자 선택
				int num = dice.askNumber();
				// 다이스 게임 결과
				int result = dice.startGame(num);
				// 결과 반영
				resultAdding(result);
			}
			// 게임 종류 및 계속 진행 여부
			status = askGame(sc , sb);
			System.out.println(status);
		}
	// 전적 보고
	System.out.println("게임을 종료 합니다.");
	System.out.println("당신의 게임 전적은 " + winningCount + "승" + losingCount + "패" + tieCount + "무 입니다." );
	}
}
