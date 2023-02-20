package Date_Time;

public class cwh_60_DATE_TIME {
    public static void main(String[] args) {

        /*
         * System.timeMills() returns no of miliseconds passed since 1 Jan 1970.
         * Date and time in java is stored in form of long number This long no hold the
         * no of milisec passed since 1 jan 1970.
         * Note- Java assume 1900 as the base year which means it calculate yers passed
         * since, 1900 whenever we ask for it YEARS passed?
         */

        System.out.println("No of milisecond passed since 1 Jan 1970: " + System.currentTimeMillis());
        System.out.println("No of second passed since 1 Jan 1970: " + System.currentTimeMillis() / 1000);
        System.out.println("No of minutes passed since 1 Jan 1970: " + (System.currentTimeMillis() / 1000) / 60);
        System.out.println("No of hours passed since 1 Jan 1970: " + (System.currentTimeMillis() / 1000) / 3600);
        System.out.println("No of days passed since 1 Jan 1970: " + (System.currentTimeMillis() / 1000 / 3600) / 24);
        System.out.println(
                "No of years passed since 1 Jan 1970: " + (System.currentTimeMillis() / 1000 / 3600 / 24) / 365);
        System.out.println("So, CURRENT Year is: " + (1970 + (System.currentTimeMillis() / 1000 / 3600 / 24) / 365));

        /*
         * As we know that time get stored in long data type, so our question is that
         * After how many years from 1970 does it exceeds long range
         * 
         */
        System.out.println();
        System.out.println();

        System.out.println("Max no of year: " + (Long.MAX_VALUE / 1000 / 3600 / 24) / 365);
        System.out.println();
        System.out.println(
                "So after " + (((Long.MAX_VALUE / 1000 / 3600 / 24) / 365) - 53)
                        + " YEARS from now(2023) it exceeds long value");
    }

}
