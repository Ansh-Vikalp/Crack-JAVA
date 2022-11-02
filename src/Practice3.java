import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        /* 👨‍🎓 What will output of the program */
        int a = 11;
        if (a == 11) {
            System.out.println("I am 11");
        } else {
            System.out.println("I am not 11");
        }

        /*
         * 👨‍🎓 Write a program to find whether a student is pass or fail if it
         * requires
         * total 40% and at least 33%
         * in each subject to pass.Assume 3 subject and take marks as input from user.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in physics: ");
        float f1 = sc.nextFloat();
        System.out.println("Enter marks in chemistry: ");
        float f2 = sc.nextFloat();
        System.out.println("Enter marks in Maths: ");
        float f3 = sc.nextFloat();
        // sc.close();
        float total = (f1 + f2 + f3) / 3;

        if (total > 40 && f1 > 33 && f2 > 33 && f3 > 33) {
            System.out.println("You Pass!");
        } else {
            System.out.println("You Fail");
        }

        /*
         * 👨‍🎓 Calculate income tax paid by an employee to the govenment as per the
         * slabs
         * mentioned below:
         * Income Slab | Tax
         * 2.5L-5.0L | 5%
         * 5.0L-10.0L | 20%
         * Above 10.0L | 30%
         * < 2.5L | No Tax
         *
         */
        System.out.println();
        System.out.println("Enter your Salary");
        float sal = sc.nextFloat();
        float tax = 0;

        if (sal >= 2.5f && sal < 5.0f) {
            tax += (sal - 2.5f) * 0.05f;

        } else if (sal >= 5.0 && sal < 10.0) {
            tax += (5.0f - 2.5f) * 0.05f;
            tax += (sal - 5.0f) * 0.2f;
        } else if (sal >= 10) {
            tax += (5.0f - 2.5f) * 0.05f;
            tax += (10.0f - 5.0f) * 0.2f;
            tax += (sal - 10.0f) * 0.3f;
        } else {
            tax += 0;
        }

        if (tax != 0.0f) {
            System.out.println("You need to pay tax amount: " + tax);
        } else {
            System.out.println("You don't need to pay any tax.");
        }

        System.out.println();

        /*
         * 👨‍🎓 write a Java program to find out the day of the week given the number
         * [1 for Monday, 2 for Tuesday... and so on!]
         */
        System.out.print("Enter the no. ");
        int no = sc.nextInt();

        switch (no) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
        // sc.close();

        /*
         * 👨‍🎓 Write a java program to find whether a year entered by user is a leap
         * year o not.
         */
        System.out.println();
        System.out.println();
        System.out.println("Enter any year");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {

                if (year % 400 == 0) {

                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a leap year");
                }

            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a leap year");
        }

        /*
         * 👨‍🎓 Write a pgm to find out the type of website from the url
         */
        String s = sc.nextLine();
        int i = s.lastIndexOf('.');
        String sub = s.substring(i + 1);
        String web;
        switch (sub) {
            case "com":
                web = "commercial";
                break;
            case "org":
                web = "Organization";
                break;
            case "in":
                web = "Indian";
                break;

            default:
                web = "N/A";
                break;
        }
        // s.endsWith("com") another way to check;
        System.out.println("The website type is " + web);
        sc.close();
    }
}
