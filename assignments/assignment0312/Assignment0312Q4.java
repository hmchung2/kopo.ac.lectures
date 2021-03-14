package assignment0312;

//4. 2 - 100사이의 소수 출력 (교수자가 설명한 규칙으로 코드를 작성할것)

public class Assignment0312Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		outer: for (int i = 2; i < 100; i++) {
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					System.out.println(i + " 소수가 아닙니다");
					continue outer;
				}
			}
			System.out.println(i + " 소수가 맞습니다");

		}
	}

}
