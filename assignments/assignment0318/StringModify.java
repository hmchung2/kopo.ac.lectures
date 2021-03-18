package assignment0318;

public class StringModify {
    static int num;
    static StringBuffer sb = new StringBuffer();

    public static int checkChar(String strData, char ch) {
        num = 0;
        for (int i = 0; i < strData.length(); i++) {
            if (strData.charAt(i) == ch) {
                num++;
            }
        }
        return num;
    }

    public static String removeChar(String oriStr, char delChar) {

        sb.setLength(0);
        for (int i = 0; i < oriStr.length(); i++) {
            if (oriStr.charAt(i) != delChar) {
                sb.append(oriStr.charAt(i));
            }
        }
        return sb.toString();
    }
}
