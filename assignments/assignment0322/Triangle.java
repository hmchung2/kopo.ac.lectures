package assignment0322;

public class Triangle extends Shape {
	
	private int feature1;
    private int feature2;
    

    public Triangle(int feature1 , int feature2){
        this.feature1 = feature1;
        this.feature2 = feature2;
        this.name = "삼각형";  
    }

    @Override
    public void calculateResult(){
        this.result = (double) feature1 * feature2 / 2;
    }

    @Override
    public void printFinalArea(){
    	System.out.print("밑변 길이 " + feature1 + " 높이 " + feature2 + "  ");
        super.printArea();

    }
    
}
