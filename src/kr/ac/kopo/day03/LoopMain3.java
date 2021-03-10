package kr.ac.kopo.day03;

import java.util.Scanner;

/*
 * *
 * **
 * ***
 * ****
 * *****
 */
public class LoopMain3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i =  0 ; i <5; i ++  ) {
			for(int j = 0; j < (i+1)  ; j++  ) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		int test = 3;
		int check;
		if(test < 6) {
			check = 3;
		} else {
			check = 5;
		}
		System.out.println(check);

	}

}
