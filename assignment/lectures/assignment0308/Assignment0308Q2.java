package lectures.assignment0308;

//2. 반지름을 입력받아 원둘레와 원넓이를 출력하는 코드를 작성 ( 단 , 원주율을 상수변수를 사용해서 작성)
/*
* 반지름을 입력 : 1
* 반지름이 1일때 , 원둘레는 ---- 이고 , 원넓이는 ----- 이다
*/
import java.util.Scanner;

public class Assignment0308Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double mypi = 3.14;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요 (정수만 적용) : ");
		int radius = sc.nextInt();
		
		System.out.println("반지름이 " + radius + "일때 원둘레는 " + (2 * radius * mypi) + " 원넓이는 " + (radius * radius * mypi) );
	}

}
