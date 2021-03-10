package assignment0310;

public class Assignment0310 {

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
		
		for(int i = 1; i < 10 ; i++) {
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

		
		System.out.println();
		System.out.println();
		System.out.println("7번");
		int star;
		int blank;
		for(int i =0 ; i < 9 ; i++) {
			if(i < 5 ){
				star =  1 + 2*i;
				blank = 9 - star;
			}else {
				star = 9 -2*(i-4);
				blank = 9 - star;
			}

			for(int j = 0; j < (blank/2); j++ ) {
				System.out.print(" ");
			} 
			for(int k = 0 ; k < star; k++ ) {
				System.out.print("*");
			}
			for(int h = 0; h < (blank/2); h++ ) {
				System.out.print(" ");
			}
			System.out.println();

		}


		System.out.println();
		System.out.println();
		System.out.println("8번");
		int star2;
		int minus;
		for(int i = 0 ; i < 9 ; i++ ) {
			if( i < 4 ) {
				star2 = (i+1)*2;
				minus = 9 - star2;
			} else if(i == 4){
				star2 = 10;
				minus = 0;
			} else {
				star2 =(9-i)*2;
				minus = 9 -star2;
			}
			if(i!=4) {
			for(int k=0; k < (star2/2); k++  ){
				System.out.print('*');
			}
			for(int j=0; j < minus; j++  ){
				System.out.print('-');
			}
			for(int k=0; k < (star2/2); k++  ){
				System.out.print('*');
			}} else {
				for(int d =0 ; d < 9; d++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}

	}

}
