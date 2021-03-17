package kr.ac.kopo.day08;

public class ConstructorMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		car.print();
		
		Car car2 = new Car("kia");
		System.out.println(car2.name);
		

	}
}
