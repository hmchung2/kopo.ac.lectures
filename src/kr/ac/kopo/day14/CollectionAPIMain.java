package kr.ac.kopo.day14;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

class Cat{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am cat";
	}
}


public class CollectionAPIMain {		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		Object[] strArr = new Object[3];
		strArr[0] = new String("1111");
		strArr[1] = new Cat();
		
		for(int i =0 ; i < strArr.length ; i ++) {
			System.out.println(strArr[i]);
		
		
			
			
		}
	}
}
