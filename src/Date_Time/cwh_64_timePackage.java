package Date_Time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_64_timePackage {
    public static void main(String[] args) {
        /**
         ** Now we will continue our discussion about java.time package
         ** This was introduced in Java 8 and has much more capability
         ** It is also able to store time in nanoseconds.offering highest accuracy
         ** In it was felt to have seprate classes for both Date and Time - LocalDate &
         ** LocalTime All previous depected Classes for DATE & TIME is of type
         ** mutable(modificable) but, why should we chage a date of obj while we can
         ** create a new one that's initialized with desired value. So, all classes of
         ** this package were made to be of type IMMUTABLE
         * ! Important Classes
         * ? a) LocalDate- Represents a Date
         * ? b) LocalTime- Represents a Time
         * ? c) LocalDateTime- Represents a Date + Time
         * ? d) DateTimeFormmater- Provides a formatter(beautify) to parse-display date
         * ? & time in suitable format, it has some pre-defined Format or yu can use
         * ? your own also
         * ? e) ZonedDateTime Represents Date + Time + Zonal Location
         * 
         * ! SEE Java Docs for more informaton.
         ** 
         **/

        LocalDate d = LocalDate.now();
        System.out.println("LocalDate ~ " + d);

        System.out.println();

        LocalTime t = LocalTime.now();
        System.out.println("LocalTime ~ " + t);

        System.out.println();

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("LocalDateTime ~ " + dt);
        System.out.println(dt.getHour() + " : " + dt.getMinute() + " : " + dt.getSecond());
        System.out.println(dt.getDayOfMonth() + ", " + dt.getMonth() + " " + dt.getYear());

        System.out.println();

        ZonedDateTime ztd = ZonedDateTime.now();
        System.out.println("ZonedDateTime ~ " + ztd);

        System.out.println();

        Instant i = Instant.now();
        System.out.println("Instant ~ " + i);

        System.out.println();
        System.out.println();

        // ? Formatting the date & Time
        // ? see dd or MM or mm or E etc meaning on java docs everthing is diffrent
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String formatted_date = dt.format(format);
        System.out.println("Formatted Date(Custom): " + formatted_date);
        System.out.println();
        DateTimeFormatter format2 = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter format3 = DateTimeFormatter.ISO_LOCAL_TIME;
        String formatted_date2 = dt.format(format2);
        String formatted_time3 = dt.format(format3);
        System.out.println("Formatted Date (ISO_LOCAL_DATE): " + formatted_date2);
        System.out.println("Formatted Time (ISO_LOCAL_TIME): " + formatted_time3);

        System.out.println();
        System.out.println();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd,LLL,YYYY - EEEE");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("EEEE, dd/LLLL/YYYY  \th:m:s a (B) ");
        String f_date = dt.format(f);
        String f2_date = dt.format(f2);
        System.out.println("Formatted Date(Custom): " + f_date);
        System.out.println();
        System.out.println();
        System.out.println("Formatted Date & Time(Custom): " + f2_date);
        System.out.println();
        System.out.println();
        // ! See the table and try your own Pattens
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

    }
}
