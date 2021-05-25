package kr.ac.kopo.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<>();
		
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		map.put("eee", "5555");
		map.put("ddd", "4447");
		Scanner sc= new Scanner(System.in);
		System.out.println("패스워드 변경서비스 입니다.");
		System.out.println("ID 를 입력하세요");
		String id = sc.nextLine();
		
		
		boolean ok = map.containsKey(id);
		
		if(!map.containsKey(id)) {
			System.out.println("입력 하신 ID [" + id+ "]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
			
		}
		
		System.out.println("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine();
		
		// 문자열과 문자열 비교는 equls 사용
		if(!map.get(id).equals(password)) {
			System.out.println("패스워드가 다릅니다.");
			System.out.println("서비스를 종료 합니다.");
			System.exit(0);
		}
		
		System.out.println("변경할 패스워드 입력하세요 : ");
		
		String newPassword = sc.nextLine();
		map.put(id , newPassword);
		System.out.println(map);
		
		System.out.println(map.entrySet()  );
	

		System.out.println("전체 회원정보 출력");
		Set<Map.Entry<String , String>>entryset =  map.entrySet();
		System.out.println();

		for(Entry<String, String> e : entryset   ) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		System.out.println("map get printing");
		System.out.println(  Integer.parseInt(map.get("aaa") ) * -1  );
		
		//System.out.println(entryset);
		
		
		System.out.println("-------- using keyset-------");
		
		Set<String> keys =   map.keySet();
		
		for(String key : keys) {
			System.out.println("ID  :  " + key + " , password : " + map.get(key) );
		}
		
		System.out.println(keys);
		
		
		
	}
}
