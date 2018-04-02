/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr1, 2018
*/

public class MovieTimeParser {
    public static void main(String[] args) {

        String movietime = getMovieTime("9.30a,11.15a,1.30p,3.00p,6.45p,9.00p", 3);
        System.out.println(movietime);
    }

    public static String getMovieTime(String times, int index) {

        String[] arrayOfTimes = times.split(",");

        String movieTime = arrayOfTimes[index - 1];

        return movieTime;
    }

}