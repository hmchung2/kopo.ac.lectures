package kr.ac.kopo.day10.homework;

import java.util.Random;
import java.util.Scanner;

public class ScissorsRockPaper implements Game {

	Scanner sc = new Scanner(System.in);
	StringBuffer sb = new StringBuffer();

	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;

	Random r = new Random();

	private int result;
	private String str;

	@Override
	public int startGame(int you) {
		//컴퓨터 가위 바위 보 중 선택
		int me = r.nextInt(3) + 1;

		// 플레이어가 가위 바위 보 중 뭘 선택했는지 출력
		printWhich(you, "당신은");
		// 컴퓨터가 가위 바위 보 중 뭘 선택했는지 출력
		printWhich(me, "컴퓨터는");
		// 비기면 결과 1 반환
		if (me == you) {
			str = "비겼습니다";
			result = 1;
		} else {
			// 비기지 않으면 승패 체크
			switch (me) {
			case 1:
				if (you == 3) {
					loseResult();
				} else {
					winResult();
				}
				break;
			case 2:
				if (you == 1) {
					loseResult();
				} else {
					winResult();
				}
				break;
			case 3:
				if (you == 1) {
					winResult();
				} else {
					loseResult();
				}
				break;
			}
		}
		System.out.println(str);
		return this.result;
	}
	// 이기면 결과 2 반환
	private void winResult() {
		this.str = "You Win";
		this.result = 2;
	}
	// 지면 결과 0 반환
	private void loseResult() {
		this.str = "You lose";
		this.result = 0;
	}

	// 누가 가위 바위 보중 뭘 냈는지 알려주는 함수
	public void printWhich(int x, String who) {
		if (x == 1) {
			System.out.println(who + " 가위를 냈습니다");
		} else if (x == 2) {
			System.out.println(who + " 주먹을 냈습니다");
		} else if (x == 3) {
			System.out.println(who + " 보자기를 냈습니다.");
		}
	}
	// 플레어가 가위 바위 보자기 중 뭘 선택할건지 물어보는 함수
	public int askNumber() {
		sb.setLength(0);
		System.out.println("선택하세요");
		System.out.print("1.가위 \n2.바위  \n3.보 \n");
		System.out.println();
		sb.append(sc.next());
		// 캐릭터 1과 3 사이에 없으면 계속 질문
		while ((int) sb.charAt(0) < (int) '1' || (int) sb.charAt(0) > (int) '3') {
			sb.setLength(0);
			System.out.println("다시 입력하세요");
			System.out.print("1.가위 \n2.바위  \n3.보 \n");
			System.out.println();
			sb.append(sc.next());
		}
		// 데이터 정수로 파싱후 반환
		return Integer.parseInt(sb.charAt(0) + "");

	}

}
