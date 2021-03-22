package kr.ac.kopo.day11;

public abstract class HPPrinter extends Printer {
}


class HPLaserPrinter extends HPPrinter{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("HP 레이저 프린터 출력중");
	}
}
class HPInkPrinter extends HPPrinter{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("HP 잉크 프린터 출력중");
	}
}