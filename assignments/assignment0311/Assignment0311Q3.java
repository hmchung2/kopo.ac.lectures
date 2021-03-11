package assignment0311;

import java.util.Scanner;

/*
* 3.
* 달팽이가 100M 깊이의 우물에 빠졌습니다
* 달팽이는 5m/hour 우물을 기어오릅니다
* 
* 올라간 높익 50m 미만일때는 -1m/hour
*          50m 이상일때는 -2m/hour
*          
* 달팽이는 몇시간만에 우물을 탈출할까요
* [1시간후] 달팽이가 올라간 총 높이 : 4m
* [2시간후] 달팽이가 올라간 총 높이 : 8m
* 
* [xx시간후] 달팽이가 올라간 총 높이 : 100m or 101m or 102m
* 
*/
public class Assignment0311Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("시간을 입력하세요");
		int hours = sc.nextInt();

		int distance = 0;
		for (int i = 0; i < hours; i++) {
			if (distance < 50) {
				distance = distance + 4;
			}
			else {
				distance = distance + 3;
			}
		}
		System.out.println("[xx 시간 후 ] 달팽이가 올라간 총 높이 : " + distance + "M");

	}

}
