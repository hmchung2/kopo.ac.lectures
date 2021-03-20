package assignment0319;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// question 1
		IceCreamMarket market = new IceCreamMarket();
		market.sell();
		
		// question 2
		AreaFinder areaFinder = new AreaFinder();
		areaFinder.getRandomFeatures();
		areaFinder.shapeFormat();
		areaFinder.calculate();
		areaFinder.printArea();

	}
}
