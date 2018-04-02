/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr1, 2018
*/


public class P2_BananaStand {
	public static void main(String[] args) {
		String quote = "There's always money in the banana stand.";

		Object BANANA = quote;

		System.out.println(lasthalf(quote));

	}

	public static String lasthalf(String str) {

		int length = str.length() / 2;

		String returnString = "";

		for (int x = 1; x <= length; x++) {
			returnString += str.charAt(x + length);
		}

		return returnString;
	}
}