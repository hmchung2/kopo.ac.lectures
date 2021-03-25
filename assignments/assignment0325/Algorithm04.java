package assignment0325;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Algorithm04 extends AbstractGames{
	
	private Set<Integer> set = new TreeSet<Integer>();
	private int[] Printingarray = new int[6];
	private int num;
	
	
	
	@Override
	public void playGame() {
		set.clear();
		for(int i = 0 ; i < Printingarray.length ; i ++) {
			while(true) {
				num = createRandomNumber();
				if(set.add(num)) {
					break;
				}
			}
			Printingarray[i] = num;
		}
	System.out.println(Arrays.toString(Printingarray));
	}
}
