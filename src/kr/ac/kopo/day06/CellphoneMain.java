package kr.ac.kopo.day06;

public class CellphoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhone cp = new CellPhone();
		cp.name = "Daniel Chung";
		cp.phone = "010-1111-1111";
		cp.company = "Samsung";
		
		CellPhone cp2 = new CellPhone();
		cp2.name = "Josh Smith";
		cp2.phone = "010-1112-1111";
		cp2.company = "LG";
		
		CellPhone cp3 = new CellPhone();
		cp3.name = "Dan Kim";
		cp3.phone = "010-1113-1111";
		cp3.company = "Apple";
				
		// 클래스 배열 생성
		CellPhone[] cpArr = {cp , cp2 , cp3};
		for(int i = 0 ; i < cpArr.length ; i++) {
			System.out.println("name : " +  cpArr[i].name  );
			System.out.println("phone : " +  cpArr[i].phone  );
			System.out.println("Apple: " +  cpArr[i].company  );
			System.out.println("=============================================");

		}
		
		for(CellPhone i : cpArr) {
			System.out.println("name : " +  i.name  );
			System.out.println("phone : " + i.phone  );
			System.out.println("Apple: " +  i.company  );
			System.out.println("=============================================");

		}
		
		
		
		
		
		
		
		
		

	}

}
