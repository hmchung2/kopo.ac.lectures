package kr.ac.kopo.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class A{
	private Object obj;
	
	public A(Object obj) {
		this.obj = obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return this.obj;
	}
	
	public void info() {
		System.out.println("obj : " + obj.toString());
	}
}

//generic
class B<T> {
	private T obj;

	public B(T obj) {
		this.obj = obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return this.obj;
	}

	public void info() {
		System.out.println("obj : " + obj.toString());
	}

}

public class GenericMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a01 = new A(new String("Hello"));
		A a02 = new A(new Random());
		
		a01.info();
		a02.info();
		
		// 명시적 형변환 강제로 필요
		System.out.println("길이 : " +  ((String)a01.getObj()).length()  );
		System.out.println("길이 : " +  ((Random)a02.getObj()).nextInt(100)  );
		
		// generic
		B<String> b01 = new B<String> (new String("hello"));
		
		System.out.println("길이 : " +  b01.getObj().length()  );
		
		B<Random> b02 = new B<Random> (new Random());
		
		B<Integer> b03 = new B<Integer>(5); 
		
		
		Integer intvar = 5;
		System.out.println("intvar");
		System.out.println(intvar.toString());
		
		
		
		
		
		System.out.println("random  : " +  b02.getObj().nextInt(100)   );
		
		// b01 = new B<Random>(new Random());
		
		
		 List<String> list = new ArrayList<String>( );
		 
		 // 가변 길이 리스트
		 List list2 = new ArrayList();
		 
		 list2.add(new String("Hello"));
		 
		 list2.add(5);
		 
		 
		 System.out.println(list2); 

		 for(int i = 0 ; i < list.size() ; i ++) {
			 System.out.println(list2.get(i).toString());
		 }
		 List<Integer> intArrays=new ArrayList<Integer>();		 
		 intArrays.add(5);
		 intArrays.add(4);
		 intArrays.add(3);
		 intArrays.add(2);
		 intArrays.add(1);
		 System.out.println(intArrays);
		 
		 for(int i = 0 ; i < intArrays.size() ; i ++) {
			 System.out.println(intArrays.get(i) + 1);
		 }
		 
		 
		 
		 intArrays.remove((Integer) 2  );
		 System.out.println(intArrays);
		 
		 
		 
		 //List listing = new ArrayList();  //1.5 미만의 방식
		 //List<String> listing = new ArrayList<String>(); //1.5버전
		 List<String> listing = new ArrayList<>();  //1.7버전 이후
		 
		 listing.add("one");
		 // 에러 --> listing.add(15);
		 
		 System.out.println("1.5버전의 for 문 사용");
		 
		 for(Integer i : intArrays) {
			 System.out.println(i);
		 }
		 		
		// 리스트를 배열로 만들어 toArray()
	 
		System.out.println("<toArray() 메소드 이용 출력");
		 
		Object[] myintarray = intArrays.toArray();
		
		//Integer[] myintarray = (Integer[])(intArrays.toArray()) ; 이것도 가능
		
		for(int i = 0 ; i < myintarray.length ; i ++) {
			System.out.println("myintarray " + i* -5);
		}
			 
		/*
		 * Iterator(순환자) 주요 메소드
		 * -hasNext() : 추출한 다음데이터의 존재여부 판단
		 * -next() : 데이터 추출  
		 */
		System.out.println("iterator testing");
		Iterator<Integer> ite = intArrays.iterator();  //리스트에 맨처음(처음 전) 가리키기 시작.
		                                               // 어레이에서 사용 안됨.
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
			
		
		Integer searchint = 10;
		if(intArrays.contains((Integer) searchint)) {
			System.out.println("it exists");
		} else {
			System.out.println("it does not exist");
		}
		
		Integer removed = intArrays.remove(0 );
		System.out.println(removed);
		System.out.println(intArrays);
		
		
		List<int[]> intArrays2=new ArrayList<int[]>();
		
		
		
		
		

		
	}
}
