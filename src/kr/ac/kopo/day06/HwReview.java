package kr.ac.kopo.day06;
import java.util.Arrays;
public class HwReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[99]; // 2 ~ 100 숫자를 저장하기 위한 배열

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 2;
		}
		System.out.println(Arrays.toString(nums));

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] % nums[i] == 0) {
						nums[j] = 0;
					}
				}
			}
		}

		for (int i : nums) {
			if (i != 0)
				System.out.print(i + " ");
		}
		System.out.println();

	

		
		int[] prime = new int[30];
		int loc = 0;
		
		for(int num = 2; num <= 100; num++) {
			boolean flag = true;
			for(int i = 0; i < loc; i++) {
				if(num % prime[i] == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				prime[loc++] = num;
			}
		}
		System.out.println(Arrays.toString(prime));

		for(int i = 0; i < loc; i++) {
			System.out.print(prime[i] + "\t");
			if((i+1) % 5 == 0)
				System.out.println();
		}
	}
}
