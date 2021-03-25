package assignment0325;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Algorithm03 extends AbstractGames {

	List<Integer> list = new ArrayList<Integer>();
	
	public Algorithm03() {
		// TODO Auto-generated constructor stub
		for (int i = 1; i < 45; i++) {
			list.add((Integer) i);
		}
	}
	
	public void shuffleList() {
		Collections.shuffle(list);
	}
	
	@Override
	public void playGame() {
		
		shuffleList();
		
		Iterator<Integer> iterator = list.iterator();
		
		
		System.out.print("[");
		for (int i = 0; i < 6 && iterator.hasNext(); i++) {
			System.out.print(" ");
			System.out.print(iterator.next());
			System.out.print(" ");
		}
		System.out.println("]");
	}
	
	
}
