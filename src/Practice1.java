import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.print("Enter distance in Km ");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        sc.close();
        float miles = km * 0.621f; // If we remove f the it treats as double and as float<-- double can't assigned
                                   // due to OVERFLOW
        System.out.println("Distance in miles " + miles);
    }
}
