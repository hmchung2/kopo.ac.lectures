package assignment0322;


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
public abstract class Shape {
    String name;
    double result;
	
    abstract void calculateResult();
    
    abstract void printFinalArea();
    
    public void printArea(){
        System.out.println( name + " 넓이는 " + result + " 입니다"  );
    }
}
