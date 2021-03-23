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

		int me = r.nextInt(3) + 1;
		printWhich(you, "당신은");
		printWhich(me, "컴퓨터는");

		if (me == you) {
			str = "비겼습니다";
			result = 1;
		} else {

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

	private void winResult() {
		this.str = "You Win";
		this.result = 2;
	}

	private void loseResult() {
		this.str = "You lose";
		this.result = 0;
	}

	public void printWhich(int x, String who) {
		if (x == 1) {
			System.out.println(who + " 가위를 냈습니다");
		} else if (x == 2) {
			System.out.println(who + " 주먹을 냈습니다");
		} else if (x == 3) {
			System.out.println(who + " 보자기를 냈습니다.");
		}
	}

	public int askNumber() {
		sb.setLength(0);
		System.out.println("선택하세요");
		System.out.print("1.가위 \n2.바위  \n3.보 \n");
		System.out.println();
		sb.append(sc.next());
		while ((int) sb.charAt(0) < (int) '1' || (int) sb.charAt(0) > (int) '3') {
			sb.setLength(0);
			System.out.println("다시 입력하세요");
			System.out.print("1.가위 \n2.바위  \n3.보 \n");
			System.out.println();
			sb.append(sc.next());
		}
		System.out.println(sb);
		return Integer.parseInt(sb.charAt(0) + "");

	}

}
