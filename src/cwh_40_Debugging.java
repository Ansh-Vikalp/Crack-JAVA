import java.util.Scanner;

public class cwh_40_Debugging {
    public static void main(String[] args) {
        // WAP to sum all n natural no
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;

        for (int i = 1; i < n; i++) {

            sum += i;// add breakpoint here

        }
        System.out.println("SUM= " + sum);
    }
}
