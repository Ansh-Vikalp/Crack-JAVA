public class cwh_9_Arrays {
    public static void main(String[] args) {
        // Arrays
        int[] arr = new int[5];// declaration & initialization
        /*
         * int [] arr; arr= new int[6];
         * int[] arr= new int{1,2,3,4};
         * int brr[]={3,4,5};
         */
        System.out.println("Array length is " + arr.length);
        // Native way to access array elements
        arr[0] = 10;
        arr[1] = 20;
        // using for loop
        for (int i = 2; i < arr.length; i++) {
            arr[i] = (i + 1) * 10;

        }

        // Printing array element using for each loop
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println();

        // float jee[]={1.0f, 1.2f, 1.3f, 1.4f};

        // Multidimention array

        // 2-D Array(Regular)

        int[][] rrr = new int[2][3];
        for (int i = 0; i < rrr.length; i++) {
            for (int j = 0; j < rrr[i].length; j++) {
                rrr[i][j] = 2 * (j + 1);
            }
        }

        // OUTPUT

        for (int i = 0; i < rrr.length; i++) {
            for (int j = 0; j < rrr[i].length; j++) {
                System.out.print(rrr[i][j] + " ");
            }
            System.out.printf("\n");
        }

        System.out.println();
        System.out.println();
        // 2-D Array(Jagged)
        int[][] oop = new int[3][];
        oop[0] = new int[1];
        oop[1] = new int[3];
        oop[2] = new int[1];

        for (int i = 0; i < oop.length; i++) {
            for (int j = 0; j < oop[i].length; j++) {
                oop[i][j] = j;
            }
        }
        System.out.println("OUTPUT");
        for (int i = 0; i < oop.length; i++) {
            for (int j = 0; j < oop[i].length; j++) {
                System.out.print(oop[i][j] + " ");
            }
            System.out.printf("\n");
        }
        System.out.println();
        System.out.println();

    }
}
