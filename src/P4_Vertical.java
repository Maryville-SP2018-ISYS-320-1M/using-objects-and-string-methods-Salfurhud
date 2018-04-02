/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr1, 2018
*/

public class P4_Vertical {

	public static void main(String[] args) {

		String str = "hey now";
		vertical(str);

	}

	public static void vertical(String str) {

		int length = str.length();

		for (int x = 0; x < length; x++) {
			System.out.println(str.charAt(x));
		}
	}
}