package kr.ac.kopo.day04;

public class LoopMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("type1" );
		for(int i = 1 ; i <=3 ; i++) {
			for(int j =1 ; j <= 5 ; j++) {
				if(j == 3) {
					break;
				}
				System.out.print(j);
			}
			System.out.println();
			System.out.println(i+"\n" );
		}
		
		System.out.println("type2" );
		for(int i = 1 ; i <=3 ; i++) {
			for(int j =1 ; j <= 5 ; j++) {
				if(j == 3) {
					continue;
				}
				System.out.print(j);
			}
			System.out.println();
			System.out.println(i+"\n" );
		}
		
		System.out.println("type3" );
		loop01: for(int i = 1 ; i <=3 ; i++) {
			for(int j =1 ; j <= 5 ; j++) {
				if(j == 3) {
					break loop01;
				}
				System.out.print(j);
			}
			System.out.println();
			System.out.println(i+"\n" );
		}
		
	}

}
