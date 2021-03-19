package assignment0319;

public class IceCreamArr {

	private int num;
	private IceCream[] iceCreamArr;
	
	public IceCreamArr(int length) {
		iceCreamArr = new IceCream[length];
		num = length;
	
	}
	public void getinfo(IceCream iceCream , int index ){
		iceCreamArr[index] = iceCream;
	}
	
	public void printinfo() {
		System.out.println("------------" + num + "개의 아이스크림 정보------------");
		for(int i = 0 ; i < num ; i ++ ) {
			System.out.print( (i+1)  +  "      ");
			iceCreamArr[i].printInfo();
		}
	}
}
