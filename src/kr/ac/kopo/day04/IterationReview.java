package kr.ac.kopo.day04;

// *****
// -****
// --***
// ---**
// ----*
// ---**
// --***
// -****
// *****

public class IterationReview {

	/*
	 * for-3 if-2
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= 5; j++) {
					if (j < i) {
						System.out.print('-');
					} else {
						System.out.print('*');
					}
				}
			} else {
				for (int j = 1; j <= 5; j++) {
					System.out.print(j < 10 - i ? '-' : '*');
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		int star = 5;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5 - star; j++) {
				System.out.print('-');
			}
			for (int k = 1; k <= star; k++) {
				System.out.print('*');
			}
			System.out.println();
			if (i < 5) {
				star--;
			} else {
				star++;
			}

		}

		System.out.println();
		System.out.println();

		int startCol = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j < startCol) {
					System.out.print('-');
				} else {
					System.out.print('*');
				}
			}

			System.out.println();
			if (i < 5) {
				startCol++;
			} else {
				startCol--;
			}
		}

//	      *    
//	     ***   
//	    *****  
//	   ******* 
//	  *********
//	   ******* 
//	    *****  
//	     ***   
//	      *    
		System.out.println();
		System.out.println();
		int n = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5-n; j++) {
				System.out.print('-');
			}

			for (int k = 0; k < 2*n - 1; k++) {
				System.out.print('*');
				}
			
			System.out.println();

			if(i<5) {
				n++;
			}else {
				n--;
			}
	
			
		}
	}
}
