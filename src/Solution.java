import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {

            arr.add(sc.nextInt());

        }

        int Q = sc.nextInt();
        sc.nextLine();
        while (Q-- > 0) {

            String s = sc.nextLine();
            if (s.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                sc.nextLine();

                arr.add(x, y);
            } else {
                int d = sc.nextInt();
                arr.remove(d);
            }
        }

        Iterator<Integer> itr = arr.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }
}
