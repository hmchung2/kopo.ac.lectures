package kr.ac.kopo.day02;
import java.util.Scanner;


/**
 * @author HP
 *
 */
public class SwitchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - 3 사이의 정수 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			System.out.println("one");
			break;
		case 2 :
			System.out.println("two");
			break;
		case 3 :
			System.out.println("three");
			break;
		default :System.out.println("error");
		}
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("조아하는 계절 입력 :" );
		String season = sc2.nextLine();
		if (season == "spring") {
			System.out.println("spring confirmed");
		} else {
			System.out.println("not confirmed");
		}
		
		switch(season) {
			case "spring":
				System.out.println("spring confirmed in switch");
			}
			
		
	}

}
