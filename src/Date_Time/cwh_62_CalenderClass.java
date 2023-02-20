package Date_Time;

import java.util.Calendar;
import java.util.TimeZone;

public class cwh_62_CalenderClass {
    public static void main(String[] args) {

        // * The use of Calender class is recommender over Date class */
        // ? Calender Class is an abstract class
        /**
         * ? Which means we can't create a direct instance of it by use of new.
         * ? however this class contains a static meathod callled as getInstance(),
         * ? which retuns an object of the class.
         * ? It contains many usefull meathods to fetch info about our Timezone,
         * ? CalenderType(Gregory), date, year... Setting custom timeZone by user in
         * ? parameterized constructor, Locle etc...
         * * Here we access date time month by its static feilds(attributes) of class
         * 
         * ! @See
         * !https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Calendar.html
         */

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println("DATE_OF_MONTH: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY_OF_WEEK: " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Date: " + c.get(Calendar.DATE));
        System.out.println("Position of date in year: " + c.get(Calendar.DAY_OF_YEAR));
        System.out.println();
        System.out.println();

        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c2.getCalendarType());
        System.out.println(c2.getTimeZone());
        System.out.println(c2.getTimeZone().getID());

    }
}
