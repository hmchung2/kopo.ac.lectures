package assignment0310;

public class Assignment0310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
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
		
		int len = 9; 
		
		int turningpoint  = len /2 +2;
		int middlepoint = len / 2 + 1;
		int first;
		int second;
		for(int i  = 1 ; i <= len ; i++) {
			if(i < turningpoint  ) {  
				first = middlepoint -i; 
				second = middlepoint + i;
			} else {
				first = i - middlepoint;
				second = len + turningpoint - i;
			}  
			for(int j  = 0 ; j<=len;j++ ) {
				System.out.print(j > first && j < second ? '*':' ');
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("8번");
		int break1 = 1;
		int break2 = 9;
		
		for(int i = 1 ; i <= 9; i++) {
			if(i < 6) {
				break1 = i;
				break2 = 10 - i;
			}else {
				break1 = 10-i;
				break2 = i;
			}
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.print(j>break1 && j<break2? '-':'*'  );
			}
			System.out.println();
		}
	}

}
