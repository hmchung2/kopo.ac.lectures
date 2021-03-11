package kr.ac.kopo.day04;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr;
		arr = new int[5];
		System.out.println("arr[0] : " + arr[0] );
		System.out.println("arr[1] : " + arr[1] );
		System.out.println("arr[2] : " + arr[2] );
		System.out.println("arr[3] : " + arr[3] );
		System.out.println("arr[4] : " + arr[4] );
		System.out.println(arr.length);
		
		boolean check = arr[3] > 5;
		System.out.println(arr[3] > 5);
		System.out.println(check);
		
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println(i + 1 + "번째 정수 : " + arr[i]);
		}	

		System.out.println("배열 길이 가변화");
		arr = new int[] {1,2,3};
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println(i + 1 + "번째 정수 : " + arr[i]);
		}	
		
		
		
		// 각 차원이 다른 길이를 갖고 있을수 있다.
		int [][] twoDim = new int[3][];
		twoDim[0] = new int[] {2,3,5,1,8};
		twoDim[1] = new int[3];
		twoDim[2] = new int[2];
		
		System.out.println(twoDim[0].length);
		System.out.println(twoDim[1].length);
		System.out.println(twoDim[2].length);

		// 1차원 배열의 정수값 출력
		System.out.println();
		System.out.println(" 1차원 배열의 정수값 출력");

		for(int i = 0 ; i <  twoDim[0].length ; i ++ ) {
			System.out.println(twoDim[0][i]);
		}
		
		
		// 1차원 배열의 null 값 출력
		System.out.println();
		System.out.println(" 1차원 배열의 null 값 출력");

		int[][] test = new int[3][2];
		for(int i : test[0] ) {
			System.out.println(i);
		}		
		int[][] test2 = {{1,2},{3,4,5}};
		int[][] test3 = new int[][] {{1,2},{3,4,5}};
		

	}
}

