/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr1, 2018
*/

public class P5_UpperFirst {

	public static void main(String[] args) {
		System.out.println(upperFirst("lebron.James", "."));
	}

	public static String upperFirst(String str1, String str2) {

		String returnStr = str1.substring(0, str1.indexOf(str2)).toUpperCase()
				+ str1.substring(str1.indexOf(str2), str1.length());

		return returnStr;

	}

}