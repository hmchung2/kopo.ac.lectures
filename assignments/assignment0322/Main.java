package assignment0322;

public class Main {

	public static void printingAreaInfo(Shape sh) {
		sh.calculateResult();
		sh.printFinalArea();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		AreaFinder areaFinder = new AreaFinder();
		areaFinder.getRandomFeatures();
		areaFinder.shapeFormat();		
		printingAreaInfo(areaFinder.polygon);
	}
}
