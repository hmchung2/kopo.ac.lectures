package assignment0319;

public class Circle extends Polygon {
    public static final double  PI= 3.14;

    public Circle(int feature1){
        super(feature1);
        this.name = "동그라미";
    }

    @Override
    public void calculateResult(){
        this.result = (double) (feature1 * 2) * PI;
    }

    @Override
    public void printInfo(){
        System.out.println("반지름 길이 " + feature1);
        super.printInfo();
    }

}
