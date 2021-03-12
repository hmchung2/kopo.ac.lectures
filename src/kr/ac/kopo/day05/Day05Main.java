package kr.ac.kopo.day05;
import java.util.Arrays;


public class Day05Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("so Friday it is");
		int[] a = {10 , 20 , 30};
		int[] b;
		b =a;
		b[0] = 5;
		System.out.println("a : " + Arrays.toString(a) );
		System.out.println("b : " + Arrays.toString(b) );
		
		b = new int[a.length];
		

		System.out.println("b : " + Arrays.toString(b) );

	}
}
