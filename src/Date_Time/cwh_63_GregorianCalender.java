package Date_Time;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class cwh_63_GregorianCalender {
    public static void main(String[] args) {

        String months[] = { "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December" };

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.getTime());
        System.out.println("Millis: " + gc.getTimeInMillis());
        System.out.println("Calender Type: " + gc.getCalendarType());
        System.out.println("TimeZone: " + gc.getTimeZone().getDisplayName());
        System.out.println("TimeZone Id: " + gc.getTimeZone().getID());
        System.out.println("current Time: " + gc.get(GregorianCalendar.HOUR) + " : " + gc.get(GregorianCalendar.MINUTE)
                + " : " + gc.get(GregorianCalendar.SECOND) + (gc.get(GregorianCalendar.AM_PM) == 0 ? " AM" : " PM"));
        System.out.println("");
        System.out.println("Date: " + gc.get(Calendar.DATE) + " " + months[gc.get(GregorianCalendar.MONTH)] + " "
                + gc.get(GregorianCalendar.YEAR));
        System.out.println("isLeapYear: " + gc.isLeapYear(gc.get(Calendar.YEAR)));

        System.out.println();
        System.out.println();
        System.out.println();

        // ? Creating Custom TimeZone AND Locale
        String arr[] = { "AM", "PM" };

        // creating instance of the Locale class to pass it to the GregorianCalendar
        // object constructor
        Locale locale = new Locale("en", "IN");

        // creating instance of the TimeZone class to pass it to the GregorianCalendar
        // object constructor
        TimeZone timezone = TimeZone.getTimeZone("GMT+5:30");
        // TimeZone timezone = TimeZone.getTimeZone("Asia/Singapore");

        // creating GregorianCalendar class object by passing Locale and TimeZone to the
        // constructor
        GregorianCalendar obj = new GregorianCalendar(timezone, locale);
        // Showing the time, date, locale, and time zone
        System.out.print("Today's date = "
                + obj.get(Calendar.DATE) + " "
                + months[obj.get(Calendar.MONTH)] + ", "
                + obj.get(Calendar.YEAR) + "\n"
                + "Current time = "
                + obj.get(Calendar.HOUR) + "-"
                + obj.get(Calendar.MINUTE) + "-"
                + obj.get(Calendar.SECOND) + " "
                + arr[obj.get(Calendar.AM_PM)] + "\n"
                + "Current Time Zone = " + obj.getTimeZone().getDisplayName()
                + "\n"
                + "Locale = "
                + Locale.getDefault().getDisplayName());

    }
}
