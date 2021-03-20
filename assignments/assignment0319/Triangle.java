package assignment0319;

public class Triangle extends Polygon {
    private int feature2;

    public Triangle(int feature1 , int feature2){
        super(feature1);
        this.feature2 = feature2;
        this.name = "삼각형";
    }

    @Override
    public void calculateResult(){
        this.result = (double) feature1 * feature2 / 2;
    }

    @Override
    public void printInfo(){
        System.out.print("밑변 길이 " + feature1 + " 높이 " + feature2 + "  ");
        super.printInfo();
    }
}
