package kr.ac.kopo.day15;

import java.util.HashMap;
import java.util.Map;


public class MapMain02 {
	
	public static void main(String[] args) {
		//Map<String, Object[]> map = new HashMap<>();
		Map<Member , Car> carList = new HashMap<>();
		carList.put(  new Member("홍길동", "010-1111-2222"), new Car("소나타", "12소1234"));
		carList.put(  new Member("윤길동", "010-1111-2223"), new Car("모닝", "12소1234"));
		carList.put(  new Member("박길동", "010-1111-2224"), new Car("그랜저", "12소1234"));
		carList.put(  new Member("강길동", "010-1111-2225"), new Car("카니발", "12소1234"));
		carList.put(  new Member("장길동", "010-1111-2226"), new Car("벤츠", "12소1234"));
	
		System.out.println("등록대수 : " +   carList.size());
		
		carList.put( new Member("홍길동", "010-1111-2222"), new Car("sm03", "12소1234"));
		
		// map 은 기본적으로 equals 메소드를 사용해서 키 값을 비교
		System.out.println("등록대수 : " +   carList.size());
		
		//new Object().equals(new Object() )  --> 주소 값 비교
		
	}
}

class Car{
	private String name;
	private String id;
	public Car(String name, String id) {
		this.name = name;
		this.id = id;
	}
}
class Member{
	private String name;
	private String phone;
	private Map<String, String> map = new HashMap<>();
	public Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
		map.put("name", name);
		map.put("phone", phone);
	}
	
	public Map<String , String> getInfo(){		
		return this.map;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		try {
			if(this.map.get("name") ==  ((Member)obj).getInfo().get("name")) {
				//System.out.println("comparing name");
				if(this.map.get("phone") ==  ((Member)obj).getInfo().get("phone")) {
					//System.out.println("comparing phone");
					result = true;;
				}
			} 
		} catch (Exception e) {
			System.out.println("unrelated object");
		}
		return result;
	}
}

class Test{
	public Map<String, Object> returnTest() {
		
		Member m = new Member("dd","dd");
		Car c = new Car("ss","ss");
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("m" ,m );
		map.put("c", c);
		return map;		
		}
}