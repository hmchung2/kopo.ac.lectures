package assignment0318;

public class Assignment0318 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub



        StringUtil stringUtil = new StringUtil();

        // question 1
        System.out.println(" 'a'  upper case check :  " + stringUtil.isUpperChar('a'));
        System.out.println(" 'A'  upper case check :  " + stringUtil.isUpperChar('A'));

        // question 2
        System.out.println(" 'a'  lower case check :  " + stringUtil.isLowerChar('a'));
        System.out.println(" 'A'  lower case check :  " + stringUtil.isLowerChar('A'));

        //question 3
        System.out.println("maximum number between 5 and 6 : " + stringUtil.max(5, 6));

        //question 4
        System.out.println("minimum number between 5 and 6 : " + stringUtil.min(5, 6));

        //question 5
        System.out.println("reverse of hello world --> " + stringUtil.reverseString("Hello World"));

        //question 6
        System.out.println("Hello World uppercase : " + stringUtil.toUpperString("Hello World"));

        //question 7
        System.out.println("Hello World uppercase : " + stringUtil.toLowerString("Hello World"));

        //question 8
        System.out.println("Hello World Java: count 'o' -->" + StringModify.checkChar("Hello World Java", 'o'));
        System.out.println("Hello World Java: count 'W' -->" + StringModify.checkChar("Hello World Java", 'W'));

        //question 9
        System.out.println("Hello World Java: delete l -->" + StringModify.removeChar("Hello World Java", 'l'));


    }

}
