package assignment0525;

import java.util.Random;

public class Question3 {
    public static void main(String[] args) {

        CallCenter cs = new CallCenter();
        CallCenterThread ct = new CallCenterThread(cs , 1);

        CallCenterThread ct2 = new CallCenterThread(cs , 2);
        CallCenterThread ct3 = new CallCenterThread(cs , 3);
        CallCenterThread ct4 = new CallCenterThread(cs , 4);
        ct.start();
        ct2.start();
        ct3.start();
        ct4.start();

        try {
            ct.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            ct2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            ct3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            ct4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cs.printOutSum();

    }
}


class CallCenterThread extends Thread{
    private CallCenter cs;
    private int type;
    public CallCenterThread(CallCenter cs , int type){
        this.cs = cs;
        this.type =type;
    }
    @Override
    public void run(){
       switch (type){
           case 1:
               cs.center1();
               break;
           case 2:
               cs.center2();
               break;
           case 3:
               cs.center3();
               break;
           case 4:
               cs.center4();
               break;
       }
    }
}


class CallCenter{
    public int sum = 0;
    Random rn = new Random();

    public void center1(){
        int groupSum = 0;
        String groupName = "1";
        for(int i = 0 ; i < 10 ; i ++){
            int money = (rn.nextInt(10) + 1 ) * 1000;
            System.out.println(groupName+ "번 콜센터 : " + money + "원을 받았습니다.");
            sum =  sum + money;
            groupSum = groupSum + money;
        }
        System.out.println(groupName + "번 콜센터 총성금액 " + groupSum +"원");
    }
    public void center2(){
        String groupName = "2";
        int groupSum = 0;
        for(int i = 0 ; i < 10 ; i ++){
            int money = (rn.nextInt(10) + 1 ) * 1000;
            System.out.println(groupName+ "번 콜센터 : " + money + "원을 받았습니다.");
            sum =  sum + money;
            groupSum = groupSum + money;
        }
        System.out.println(groupName + "번 콜센터 총성금액 " + groupSum +"원");
    }
    public void center3(){
        String groupName = "3";
        int groupSum = 0;
        for(int i = 0 ; i < 10 ; i ++){
            int money = (rn.nextInt(10) + 1 ) * 1000;
            System.out.println(groupName+ "번 콜센터 : " + money + "원을 받았습니다.");
            sum =  sum + money;
            groupSum = groupSum + money;
        }
        System.out.println(groupName + "번 콜센터 총성금액 " + groupSum +"원");
    }

    public void center4(){
        String groupName = "4";
        int groupSum = 0;
        for(int i = 0 ; i < 10 ; i ++){
            int money = (rn.nextInt(10) + 1 ) * 1000;
            System.out.println(groupName+ "번 콜센터 : " + money + "원을 받았습니다.");
            sum =  sum + money;
            groupSum = groupSum + money;
        }
        System.out.println(groupName + "번 콜센터 총성금액 " + groupSum +"원");
    }

    public void printOutSum(){
        System.out.println("국민들이 보내주신 총 성금액 : "+ sum + "원");
    }

}