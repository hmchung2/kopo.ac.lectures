package assignment0322;

public class Circle extends Shape {
    public static final double  PI= 3.14;
    private int feature1;
    
    

    public Circle(int feature1){
        this.feature1 = feature1;
        this.name = "동그라미";
    }

    @Override
    public void calculateResult(){
        this.result = (double) (feature1 * 2) * PI;
    }

    @Override
    public void printFinalArea() {
    	System.out.print("반지름 길이 " + feature1 + "  ");
    	 super.printArea();
    }
}
