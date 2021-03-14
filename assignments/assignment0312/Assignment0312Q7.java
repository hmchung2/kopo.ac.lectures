package assignment0312;
/*
 * 7. 사용자가 생각하는 숫자를 컴퓨터가 맞추는 프로그램을 작성하세요.

   사용자가 생각하는 숫자가 [88]입니까?(맞으면 0, 작은수면 1, 큰수면 2) ==> 1
   ... 	


 */
import java.util.Scanner;

public class Assignment0312Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0;
		int max = 100;
		int guess;
		int ans;
		Scanner sc = new Scanner(System.in);
		for(int i =0 ; i < 5 ; i ++) {
			guess = (min + max) / 2;
			System.out.printf("[%d] 입니까? (맞으면 0 , 작은수면 1 , 큰수면 2)" , guess );
			ans = sc.nextInt();
			if(ans == 1) {
				max = guess;
				
			} else if(ans ==2 ) {
				min = guess;
			} else {
				System.out.println("게임이 끝났습니다");
			}
		}
	}
}
