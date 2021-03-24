package assignment0324;

import java.util.Scanner;

public class Question1Main {
	
	public static void getLotto(Scanner sc) throws LottoNumberException {
		System.out.print("좋아하는 로또 번호를 입력하세요 : ");
		int num = sc.nextInt();
		if(num < 1 || num > 75) {
			throw new LottoNumberException("1 - 45 사이만 가능합니다." + num+ " 숫자는 올바르지 않습니다.");
		}
		System.out.println(num + " 포함해서 로또번호들을 추출하겠습니다.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			getLotto(sc);
		} catch(Exception e) {
			e.printStackTrace();
		}
	
		

	}
}