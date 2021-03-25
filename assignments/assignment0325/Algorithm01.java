package assignment0325;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Algorithm01 extends AbstractGames {

	private Set<Integer> set = new TreeSet<Integer>();
	private List<Integer> list = new ArrayList<Integer>();
	private int num;
	private boolean add;
	
	
	
	@Override
	public void playGame() {
		list.clear();
		set.clear();
	
		while (set.size() < 6) {
			num = createRandomNumber();
			add = set.add((Integer) num);
			if (add) {
				list.add(num);
			}
		}
		System.out.println(Arrays.toString(list.toArray()));
	}
}
