package assignment0312;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 * 6. 숫자맞추기 게임 구성

 	1 - 100 : 30
 	30보다 큰수입니다
 	기회는 4번 남았습니다
 	
 	31 - 100 : 70
 	70보다 작은수입니다
 	기회는 3번 남았습니다
 	
 	31 - 69 : 80
 	31 - 69 : 55
 	55보다 큰수입니다
 	기회는 2번 남았습니다
 	
 	56 - 69 : 60
 	60보다 큰수입니다
 	기회는 1번 남았습니다
 	
 	61 - 69 : 63
 	63보다 작은수입니다.
 	기회는 0번 남았습니다
 	
 	아쉽습니다.. 기회를 다 소진하셨습니다.
 	정답은 61입니다	

---------------------------------

 	1 - 100 : 30
 	30보다 큰수입니다
 	기회는 4번 남았습니다
 	
 	31 - 100 : 70
 	70보다 작은수입니다
 	기회는 3번 남았습니다
 	
 	31 - 69 : 80
 	31 - 69 : 55
 	55보다 큰수입니다
 	기회는 2번 남았습니다
 	
 	56 - 69 : 61
 	
 	축하합니다. 정답입니다.
 */
public class Assignment0312Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNum = ThreadLocalRandom.current().nextInt(1, 100);
		
		int min = 0;
		int max = 100;
		int currentNum;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
						
			System.out.println( min + " - " + max + " : ");
			currentNum = sc.nextInt();
			while (currentNum < min || currentNum > max) {
				System.out.println(min + " 과 " + max + " 사이의 숫자를 입력하세요");
				currentNum = sc.nextInt();
			}
			if (randomNum > currentNum) {
				System.out.println(currentNum + " 보다 큰 수 입니다");
				min = currentNum;
			} else if (randomNum < currentNum) {
				System.out.println(currentNum + " 보다 작은 수 입니다");
				max = currentNum ; 
			} else {
				System.out.println(" 정답입니다 축하합니다");
				break;
					
			}
			System.out.println("남은 기회 : " + (4-i) );
			
		}
		System.out.println("정답 : " + randomNum);

	}
}

