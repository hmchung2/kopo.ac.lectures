package assignment0318;

public class StringUtil {
    private boolean upper;
    private StringBuffer sb = new StringBuffer();

    boolean isUpperChar(char c) {
        if ((int) c >= 97 && (int) c <= 122) {
            upper = false;
        } else if ((int) c >= 65 && (int) c <= 90) {
            upper = true;
        } else {
            System.out.println("Please type english");
            upper = true;
        }
        return upper;
    }

    boolean isLowerChar(char c) {
        if ((int) c < 65 || (int) c > 122) {
            System.out.println("Please type english");
            return true;
        }
        return !isUpperChar(c);
    }

    int max(int i, int j) {
        return (i > j) ? i : j;
    }

    int min(int i, int j) {
        return (i > j) ? j : i;
    }

    StringBuffer reverseString(String str) {
        sb.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(str.length() - 1 - i));
        }
        return sb;
    }


    StringBuffer toUpperString(String str) {
        sb.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            if (isUpperChar(str.charAt(i))) {
                sb.append(str.charAt(i));
            } else {
                sb.append((char) ((int) str.charAt(i) - 32));
            }
        }
        return sb;
    }

    StringBuffer toLowerString(String str) {
        sb.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            if (isLowerChar(str.charAt(i))) {
                sb.append(str.charAt(i));
            } else {
                sb.append((char) ((int) str.charAt(i) + 32));
            }
        }
        return sb;
    }

}
