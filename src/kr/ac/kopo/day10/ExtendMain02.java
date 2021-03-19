package kr.ac.kopo.day10;

public class ExtendMain02 {
    public static void main(String[] args) {
        //사원번호가 1, 연봉을 40000원 받은 홍길동 사원 객체 생성
        Employee employee  = new Employee(1, "홍길도", 4_000, "사원");
        Employee employee2 = new Employee(2, "박길동", 4_200, "사원");
        Employee employee3 = new Employee(3, "강길동", 4_800, "대리");
        Employee employee4 = new Employee(4, "한길동", 5_500, "과장");
        Employee employee5 = new Employee(5, "윤길동", 5_200, "대리");

        employee.info();
        employee2.info();
        employee3.info();
        employee4.info();
        employee5.info();
        Employee[] emplist = {employee, employee2, employee4};
        Manager02 m = new Manager02(100, "나캡틴", 9_000, "부장", emplist);
        m.info();
        System.out.println();


    }
}
