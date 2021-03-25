package assignment0325;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Algorithm02 extends AbstractGames{
	
	Random r = new Random();
	
	public List<Integer> makeList(){
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 45; i++) {
			list.add((Integer) i);
		}
		return list;
	}
	
	
	@Override
	public void playGame(){
		List<Integer> list =   makeList();
		int num;
		System.out.print("[ ");
		for(int i = 0 ; i < 6 ; i ++) {
			System.out.print(  list.remove(r.nextInt( list.size() ) +1  ) ); 
			System.out.print(" ");
		}
		System.out.print("]");
		System.out.println();
	
		
	}
}
