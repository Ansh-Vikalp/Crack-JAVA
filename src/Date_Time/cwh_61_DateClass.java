package Date_Time;

import java.util.Date;

public class cwh_61_DateClass {
    public static void main(String[] args) {
        // This class belongs to java.util package and it's use has been Depricated
        // since java 8

        Date d = new Date();
        System.out.println(d);
        System.out.println("Current Date: " + d.getDate());
        // Month count start from [0-11]
        System.out.println("Current Month: " + d.getMonth());
        System.out.println("Current Day: " + d.getDay());
        System.out.println("Current Hours: " + (d.getHours() - 12));
        System.out.println("Current Minutes: " + d.getMinutes());
        System.out.println("Current Seconds: " + d.getSeconds());
        System.out.println("Current Time: " + d.getTime() + " millis");

        /*
         * public Date(long date)
         * Allocates a Date object and initializes it to represent the specified number
         * of milliseconds since the standard base time known as "the epoch", namely
         * January 1, 1970, 00:00:00 GMT.
         * Parameters:
         * date - the milliseconds since January 1, 1970, 00:00:00 GMT
         * 
         */
        System.out.println();
        System.out.println();
        Date d2 = new Date(0);// it initializes to Jan 1 1970
        System.out.println(d.after(d2));
        System.out.println("As d > d2: " + d.compareTo(d2));
        System.out.println("1970 Date: " + d2);
        d2.setDate(2);
        System.out.println("1970 Modified Date: " + d2);

    }
}
