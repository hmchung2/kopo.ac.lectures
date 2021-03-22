package kr.ac.kopo.day11;

public class SamsungPrinter extends Printer {

	@Override
	public void print() {
		System.out.println("삼성 프린터에서 출력중....");
	}

}


class MaxFinder{
	public void max(int x , int y) {
		System.out.println(x>y?x:y);
	}
	
	
	public double max(double x , double y) {
		return x>y?x:y;
	}
	
}