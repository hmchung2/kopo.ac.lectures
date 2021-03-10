package kr.ac.kopo.day03;

/*
 * 12345
 * 23456
 * 34567
 * 
 */


public class PracticeEx {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("1번");
		for(int i = 1 ;  i < 6 ; i++) {
			for(int j = 0 ; j < 5 ; j ++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	
		System.out.println();
		System.out.println();
		System.out.println("2번");
		for(int i = 5 ; i > 0  ; i-- ){
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print(i + j );
			}
			   System.out.println();
		   }
		System.out.println();
		System.out.println();
		System.out.println("3번");
		for(int i =5 ; i > 0 ; i--) {
			for(int j =  i ; j > 0 ; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("4번");
		
		for(int i = 1; i <= 9 ; i++) {
			int num;
			if(i <= 5) {
				num = i;
			} else {
				num = 10 - i;
			}
			for(int j = 0 ; j < num ; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("5번");

		for(int i = 1; i <= 9 ; i++) {
			int star;
			if(i <= 5) {
				star = 6 -  i;
			} else {
				star = i -4;
			}
			int blank = 5 - star;
			for(int k = 1 ; k <= blank; k++ ) {
				System.out.print(' ');
			}
			for(int j = 1 ; j <= star; j++ ) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("hello");
		
		System.out.println();
		System.out.println();
		System.out.println("6번");
		for(int i = 0 ; i < 5   ; i++) {
			int star;
			int blank;
			int middle;
			star = 9 - i * 2;
			blank = 9 - star;
			middle = blank / 2;
			for(int j = 0 ; j<middle ; j++ ) {
				System.out.print(' ');
			}
			for(int k = 0; k < star ; k++) {
				System.out.print('*');
			}
			for(int h = 0 ; h<middle ; h++ ) {
				System.out.print(' ');
			}
			System.out.println();
			
		}
		
		
	}
}


