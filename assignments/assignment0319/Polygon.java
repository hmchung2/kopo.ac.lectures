package assignment0319;


//2. 다음의 결과를 보이는 프로그램을 작성
//
//도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => 1
//직사각형 선택시
//   Random하게 2 ~ 10사이의 정수 2개를 추출
//   가로 3, 세로 2의 직사각형 면적은 6입니다
//   
//도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => 2
//정사각형 선택시
//   Random하게 2 ~ 10사이의 정수 1개를 추출
//   가로 5의 정사각형 면적은 25입니다
public class Polygon {
    protected int feature1;
    protected double result;
    protected String name = "선";

    public Polygon(){

    }
    public Polygon(int feature1){
        this.feature1 = feature1;
    }

    public void calculateResult(){
        result = (double)feature1;
    }

    public double getResult(){
        return result;
    }
    public void printInfo(){
        System.out.println( name + " 넓이는 " + result + " 입니다"  );
    }
}
