package kr.ac.kopo.day01;
import java.util.Random;

/*
 * util class
 * @author Daniel Chung
 */

// 참조 클래스
public class LottoUtil {
	// 멤버변수
	int lottoNum;
	static int test = 5;


	// 메소드
	/**
	 *  오늘의 로또 확률을 출력해주는 메소드
	 */
	public static void todayLotto() {
		Random r = new Random();
		System.out.println("오늘의 로또 확률 : " +  r.nextInt(101) + "%입니다");
		System.out.println(test); // static method can run static data
	}
	
	/**
	 * before return
	 * @return 추출된 로또번호
	 * after return
	 */
	public int getNum() {
		Random r = new Random();
		return r.nextInt(101);
	}
	
}

