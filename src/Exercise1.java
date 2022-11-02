import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float a = sc.nextfloat();
        // Now taking a simple input and checking it's validity
        // System.out.prfloatln(sc.hasNextInt());

        System.out.print("Enter Marks in Sub1:");
        float sub1 = sc.nextFloat();
        System.out.print("Enter Marks in Sub2:");
        float sub2 = sc.nextFloat();
        System.out.print("Enter Marks in Sub3:");
        float sub3 = sc.nextFloat();
        System.out.print("Enter Marks in Sub4:");
        float sub4 = sc.nextFloat();
        System.out.print("Enter Marks in Sub5:");
        float sub5 = sc.nextFloat();
        sc.close();

        System.out.println("Percentage: " + ((sub1 + sub2 + sub3 + sub4 + sub5) / 5));
        System.out.println("CGPA: " + ((sub1 + sub2 + sub3 + sub4 + sub5) / 50));

    }

}
