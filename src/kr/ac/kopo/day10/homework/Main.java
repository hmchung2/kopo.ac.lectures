package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class Main {

	public static int winningCount = 0;
	public static int losingCount = 0;
	public static int tieCount = 0;
	
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
		int num;
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();		
		ScissorsRockPaper srp = new ScissorsRockPaper();
		Dice dice = new Dice();
		char status = askGame(sc , sb);
		while(status != 'C') {
			if(status == 'A') {
				num = srp.askNumber();	
				int result = srp.startGame(num);
				resultAdding(result);
			}
			else if(status =='B') {
				num = dice.askNumber();
				int result = dice.startGame(num);
				resultAdding(result);
			}
			status = askGame(sc , sb);
			System.out.println(status);
		}	
	System.out.println("게임을 종료 합니다.");
	System.out.println("당신의 게임 전적은 " + winningCount + "승" + losingCount + "패" + tieCount + "무 입니다." );
	}
}
