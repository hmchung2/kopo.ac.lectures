package kr.ac.kopo.day10;

public class Manager01 {
    int no;
    String name;
    int salary;
    String grade;
    Employee[] emplist; //관리 사원 목록 저장

    public Manager01(int no, String name, int salary, String grade, Employee[] emplist) {
        this.no = no;
        this.name = name;
        this.salary = salary;
        this.grade = grade;
        this.emplist = emplist;
    }

    public void info(){
        System.out.println("사원 번호 : " + no + " 사원명 : " + name + " 연봉 : " + salary + " 직급 : " + grade);
        System.out.println("========================== 관리 사원 ===========================");
        for(Employee e : emplist){
            e.info();
        }
        System.out.println("===============================================================");
    }

}
