package kr.ac.kopo.day10;

public class Manager02 extends Employee {

    Employee[] emplist; //관리 사원 목록 저장

    public Manager02(int no, String name, int salary, String grade, Employee[] emplist) {
        super(no, name , salary , grade);
        this.emplist = emplist;
    }

    @Override // 에러체크
    public void info(){
        super.info();
        System.out.println("========================== 관리 사원 ===========================");
        for(Employee e : emplist){
            e.info();
        }
        System.out.println("===============================================================");

        System.out.println(super.name);
        print();
    }

}
