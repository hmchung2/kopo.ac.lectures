package assignment0322;

public class Rectangle extends Shape {
	
	private int feature1;
	private int feature2;
    

    public Rectangle(int feature1 , int feature2) {
    	this.feature1 = feature1;
        this.feature2 = feature2;
        this.name = "직사각형";
    }

    @Override
    public void calculateResult() {
        this.result = (double) feature1 * feature2;
    }

    @Override
    public void printFinalArea() {
    	System.out.print("가로 길이 " + feature1 + " 세로 길이 " + feature2 +"  ");
    	super.printArea();
    }
    

}
