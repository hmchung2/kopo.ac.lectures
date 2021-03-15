package kr.ac.kopo.day06;
// 실행 클래스 (메인 메소드. 프로그램을 실행 하기 위해 필요한 클래스)


public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car;
		car = new Car();
		
		System.out.println(car.name);
		System.out.println(car.company);
		System.out.println(car.price);

		
		Car car2;
		car2 = new Car();
		
		
		car = new Car();
		car.name = "K7";
		car.company = "KIA";
		car.stock = 100;
		System.out.println(car.name);
		System.out.println(car.company);
		System.out.println(car.price);
		
		
		// drag then CTRL + space -> then select print method then press enter
		System.out.println("car2 name : " +  car2.name);
		System.out.println("stock price for car2 : " +  car2.stock);
		
		
		TestCar testcar2 = new TestCar();
		System.out.println(testcar2.name);
		
		
		car2 = car;
		//System.gc();
		
//        int mb = 1024 * 1024;
//         // get Runtime instance
//        Runtime instance = Runtime.getRuntime();
//        System.out.println("***** Heap utilization statistics [MB] *****\n");
//        // available memory
//        System.out.println("Total Memory: " + instance.totalMemory() / mb);
//        // free memory
//        System.out.println("Free Memory: " + instance.freeMemory() / mb);
//        // used memory
//        System.out.println("Used Memory: "
//                + (instance.totalMemory() - instance.freeMemory()) / mb);
//        // Maximum available memory
//        System.out.println("Max Memory: " + instance.maxMemory() / mb);
//
		
	}
}
