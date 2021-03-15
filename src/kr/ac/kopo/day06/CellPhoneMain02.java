package kr.ac.kopo.day06;


public class CellPhoneMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		CellPhone cp1 = new CellPhone();
		CellPhone cp2= new CellPhone();
		CellPhone cp3 = new CellPhone();
		
		
		CellPhone[] cpArrDeepCopy = new CellPhone[3];		
		for(int i = 0 ; i < cpArrDeepCopy.length ; i++) {
			cpArrDeepCopy[i] = new CellPhone();
			cpArrDeepCopy[i].name = "Josh";
		}
		
		
		CellPhone[] cpArrShalCopy =  {cp1, cp2, cp3};
	
		cp1.name = "Daniel";
		
		System.out.println("================================1");

		for(CellPhone i : cpArrDeepCopy) {
			System.out.println(i.name);
		}

		System.out.println("================================2");

		for(CellPhone i : cpArrShalCopy) {
			System.out.println(i.name);
			}
		
		// 다음과 같이 하면 힙에서 각 인자별 인스턴스 객체를 생성 안해서 프린트 적용시 참조되는 주소가 없어서 에러가 뜸
		// CellPhone[] newArr = new CellPhone[] {cp1,
        // cp2,
        // cp3};
				
		System.out.println("================================3");

		CellPhone[] newArr = new CellPhone[] {new CellPhone(),
				                              new CellPhone(),
				                              new CellPhone()};
		
		
		for(int i = 0 ; i < newArr.length ; i ++) {
			System.out.println(newArr[i].name);
		}
		
		System.out.println("================================4");
		// this one is shallow copy of class but deep copy of array which is not efficient
		CellPhone[] newArr2 = new CellPhone[] {cp1,cp2,cp3};
		cp1.name = "Smith";
		for(int i  =0 ; i < newArr2.length ; i++) {
			System.out.println(newArr2[i].name);
		}
		
		
		
		
		
		
	}
}
