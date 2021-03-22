package assignment0322;

public class Main {

	public static void printingAreaInfo(Shape sh) {
		sh.calculateResult();
		sh.printFinalArea();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 넓이 찾는 클래스 선언
		AreaFinder areaFinder = new AreaFinder();
		// 랜덤 숫자 생성 메소드 실행
		areaFinder.getRandomFeatures();
		// 사용자 선택에 따라 도형 변화
		areaFinder.shapeFormat();
		// 도형 받기
		Shape polygon = areaFinder.getPolygon();
		// 도형 넓이 계산 및 출력
		printingAreaInfo(polygon);
	}
}
