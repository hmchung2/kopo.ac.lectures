package assignment0325;

import java.util.Random;
import java.util.Scanner;

abstract class AbstractGames {

	private Random r = new Random();

	public abstract void playGame();
	
	public void playManyGames() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("게임 수를 입력하세요");
		int gameCounts = sc.nextInt();
		for(int i = 0 ; i < gameCounts ; i ++) {
			playGame();
		}
	}
	
	public Integer createRandomNumber() {
		Integer result = r.nextInt(45) + 1;
		return result;
	}
}
