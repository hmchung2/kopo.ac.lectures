package kr.ac.kopo.day10;

public class Employee {
    int no;
    String name;
    int salary;
    String grade;

    public Employee() {
    }

    public Employee(int no, String name, int salary, String grade) {
        this.no = no;
        this.name = name;
        this.salary = salary;
        this.grade = grade;
    }

    public void info() {
        System.out.println("사원 번호 : " + no + " 사원명 : " + name + " 연봉 : " + salary + " 직급 : " + grade);
    }

    public void print(){
        System.out.println(" I am a employee!!!");
    }


}
