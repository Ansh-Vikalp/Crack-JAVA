import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Practice14 {
    public static void main(String[] args) {
        // ? Q1) Create a ArraList and store names of 10 Students inside it? Print it
        // ? using a for each loop.

        ArrayList<String> arr = new ArrayList<>(10);

        arr.add("Student 1");
        arr.add("Student 2");
        arr.add("Student 3");
        arr.add("Student 4");
        arr.add("Student 5");
        arr.add("Student 6");
        arr.add("Student 7");
        arr.add("Student 8");
        arr.add("Student 9");
        arr.add("Student 10");

        for (String string : arr) {
            System.out.println(string);
        }
        System.out.println();

        // ? Q2) Use date class in java to print time in following format:- 21:47:02
        Date d = new Date();
        System.out.println("Current Time: " + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        // ? Q3) Repeat 2 using the Calender class?
        Calendar c = Calendar.getInstance();
        System.out.println("Current Time: " + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":"
                + c.get(Calendar.SECOND) + " " + (c.get(Calendar.AM_PM) == 0 ? "AM" : "PM"));

        // ? Q4)Repeat 2 using the java.time API?
        ZonedDateTime dt = ZonedDateTime.now();
        DateTimeFormatter ff = DateTimeFormatter.ofPattern("dd-MMM-YYYY, EEEE (B) ");
        DateTimeFormatter ff2 = DateTimeFormatter.ofPattern("h:m a -VV");
        System.out.println("Date: " + dt.format(ff));
        System.out.println("Time: " + dt.format(ff2));
        System.out.println();
        System.out.println();

        // ? Q5) Create a Set in java. Try to store the duplicate values elements inside
        // ? this set and verify that only one instance is stored.

        HashSet<Integer> hr = new HashSet<>();
        hr.add(1);
        hr.add(2);
        hr.add(3);
        hr.add(2);
        hr.add(1);
        System.out.println(hr);
    }
}
