package assignment0318;

public class StringUtil {
	boolean upper;

	boolean isUpperChar(char c) {
		if((int)c >= 97 & (int)c <= 122  ){
			upper = false;
		} else if ((int)c >= 65 && (int)c <= 90 ) {
			upper = true;
		} else {
			System.out.println("Please type english");
			upper = false;
		}
		return upper;
	}
	boolean isLowerChar(char c) {
		if ((int)c < 65 || (int)c > 122 ) {
			System.out.println("Please type english");
			return false;
		}
		return isUpperChar(c)? false:true;
	}
	
	int max(int i , int j ) {
		return (i > j)? i : j;
	}
	
	int min(int i , int j) {
		return (i > j)? j : i;
	}
	
	char[] reverseString(String str) {
		
		
		return new char[5] ;
	}
	
	
	
	
}
