package kr.ac.kopo.day04;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		for (int num : arr) {
			System.out.println(num);
		}
		System.out.println();

		String arrayS = Arrays.toString(arr);
		System.out.println(arrayS);
		
	
	}
}
