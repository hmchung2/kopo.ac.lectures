package assignment0319;
import java.util.Scanner;
import java.util.Random;
public class AreaFinder {

    Scanner sc = new Scanner(System.in);

    private int shape;
    private Random rand = new Random();
    private int feature1;
    private int feature2;
    private int min = 1;
    private int max = 20;
    private Polygon polygon = new Polygon();



    public AreaFinder(){
        StringBuffer sbuffer = new StringBuffer();
        System.out.println("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원)");
        sbuffer.append(sc.next());
        while( (int)sbuffer.charAt(0)  < (int)'1' || (int)sbuffer.charAt(0) > (int)'4'){
            sbuffer.setLength(0);
            System.out.println("제대로 입력 바랍니다");
            System.out.println("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원)");
            sbuffer.append(sc.next());
        }
        this.shape = Integer.parseInt(String.valueOf(sbuffer.charAt(0) ));
    }

    public AreaFinder(int shape){
        this.shape = shape;
    }

    public void getRandomFeatures(){
        this.feature1 = rand.nextInt((max - min) + 1) + min;
        this.feature2 = rand.nextInt((max - min) + 1) + min;
    }

    public void shapeFormat() {
        if (this.shape == 1) {
            polygon = new Rectangle(this.feature1, this.feature2);
        } else if(this.shape == 2){
            polygon = new Square(this.feature1);
        } else if(this.shape ==3){
            polygon =  new Triangle(this.feature1 , this.feature2);
        } else {
            polygon = new Circle(this.feature1);
        }
    }
    public void calculate(){
        polygon.calculateResult();
    }
    public void printArea(){
        polygon.printInfo();
    }

    public void setShape(int x){
        System.out.println("1. 직사각형, 2. 정사각형, 3.삼각형, 4.원)");
        this.shape = x;
    }
    public int getShape(){
        return this.shape;
    }

    public void setFeatures(int x, int y){
        this.feature1 = x;
        this.feature2 = x;
    }
    public void setFeatures(int x){
        this.feature1 = x;
    }

    public int[] getFeatures(){
        System.out.println("feature 1 : " + this.feature1);
        System.out.println("feature 2 : " + this.feature2);
        return new int[] {feature1 , feature2};
    }
}
