package assignment0319;

public class IceCream {
	private String name;
	private int price;
	
	public IceCream() {
		
	}
	
	public IceCream(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void setName(String name , int price) {
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println(this.name + "       " + this.price );
	}
	
}
