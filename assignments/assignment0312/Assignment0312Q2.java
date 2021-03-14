package assignment0312;
import java.util.Scanner;
/*
 * 2. 다음과 같은 결과를 보이는 프로그램 작성
	짝수 몇개 입력 : 5
	홀수 몇개 입력 : 4
	
	num1 : 12
	num2 : 9
	num3 : 67
	num4 : 20
	num5 : 9
	num6 : 31
	num7 : 24
	num8 : 5
	num8 : 11
	num8 : 10
	num9 : 6
	
	< PRINT >
	12  20  24  10  6  31  9  67  9
 */
public class Assignment0312Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("양의 정수를 9번 입력하세요");
		int[] numArr = new int[9];
		int currentNum;
		int evenCount = 0;
		int oddCount = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 9; i ++) {
			System.out.print("num"+ (i + 1) + " : ");
			currentNum = sc.nextInt();
			while(currentNum < 0) {
				System.out.println("0 보다 큰수를 입력 하세요");
				System.out.printf("num%d : ",i+1);
				currentNum = sc.nextInt();
			}
			if(currentNum % 2 == 0) {
				evenCount = evenCount + 1;
			} else {
				oddCount = oddCount + 1;
			}
			numArr[i] = currentNum;
		}
		
		System.out.println("짝수 몇개 입력 : " + evenCount );
		System.out.println("홀수 몇개 입력 : " + oddCount );
		
		System.out.println("<PRINT>");
		for(int i = 0 ; i < numArr.length  ; i ++) {
			System.out.print(numArr[i] + "  ");
		}
	
		
	}

}
