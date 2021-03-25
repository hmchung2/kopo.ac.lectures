package kr.ac.kopo.day14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// adding linked list to list
		List<String> list = new ArrayList<String>();
		
		list.add("가을");

		List<String> sub = new LinkedList<>();
		
		sub.add("봄");
		sub.add("여름");		
		list.addAll(sub);
		
		System.out.println(list);
		
		
		// set testing
		//using class[HashSet, TreeSet]
		
		Set<String> set = new TreeSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("six");
		set.add("one");
		
		/*
		 * how to PRINT set everything
		 */
		
		// 입력 순서가 아니다.
		
		System.out.println("----------for loop----------");
		for(String str : set) {
			System.out.println(str);
		}
		
		/*
		 *iterator 사용 print 
		 */
		System.out.println("----------Iterator----------");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		/*
		 * toArray 사용 print
		 */
		System.out.println("----------toArray----------");
		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(arr));
		
		// 이미 데이터가 있어서 false 반환
		boolean bool = set.add("one");
		System.out.println(bool);
		
		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(5);
		set2.add(1);
		set2.add(4);
		set2.add(3);
		set2.add(2);
		Object[] arr2 = set2.toArray();
		System.out.println(Arrays.toString(arr2));
		
		
		System.out.println("----------Iterator2----------");
		Iterator<Integer> ite2 = set2.iterator();
		while(ite2.hasNext()) {
			System.out.println(ite2.next());
		}
		
	

		
		
		
		
	}
}
