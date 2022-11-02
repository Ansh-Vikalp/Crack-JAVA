public class chw_6_Conditionals {
    public static void main(String[] args) {

        int marks = 98;
        // If-Else block
        // only one get executed
        if (marks > 95) {
            System.out.println("Brilliant Student");
        } else if (marks > 90) {
            System.out.println("Intelligent Student");
        } else if (marks > 80) {
            System.out.println("Excellent");
        } else if (marks > 70) {
            System.out.println("Very Good");
        }

        else {
            System.out.println("Try to improve");
        }

        // All possible condn get executed
        // if (marks > 95) {
        // System.out.println("Brilliant Student");
        // }
        // if (marks > 90) {
        // System.out.println("Intelligent Student");
        // }
        // if (marks > 80) {
        // System.out.println("Excellent");
        // }
        // if (marks > 70) {
        // System.out.println("Very Good");
        // }

        // else {
        // System.out.println("Try to improve");
        // }

        // Use of Logical operator(&&, ||, !)
        int y = 1;

        if (y > 6 && y <= 10) {
            System.out.println("No. b/w 7 and 10");
        } else if (y > 3 && y <= 6) {
            System.out.println("No. b/w 4 and 6");
        } else if (y > 1 && y <= 3) {
            System.out.println("No b/w 2 and 3");
        } else {
            System.out.println("No. b/w 0 and 1");
        }
        //This is progr

        // Switch Case
        String var = "Ansh";

        switch (var) {
            case "Vikalp":
                System.out.println("var= Vikalp");
                break;

            case "Ansh":
                System.out.println("var= Ansh");
                break;

            case "Vansh":
                System.out.println("var= Vansh");
                break;
            case "Hariom":
                System.out.println("var= Hariom");
                break;
            default:
                System.out.println("No name");
        }

        // If remove break lead to continue execution until it finds break

        // switch (var) {
        // case "Vikalp":
        // System.out.println("var= Vikalp");

        // case "Ansh":
        // System.out.println("var= Ansh");

        // case "Vansh":
        // System.out.println("var= Vansh");
        // break;
        // case "Hariom":
        // System.out.println("var= Hariom");
        // break;
        // default:
        // System.out.println("No name");
        // }

        // }

        // Modified Switch Case
        // Not for vs code
        // switch (var) {
        // case "Vikalp" -> {
        // System.out.println("var= Vikalp");
        // System.out.println("Vikalp is a good boy");
        // }

        // case "Ansh" ->
        // System.out.println("var= Ansh");

        // case "Vansh" ->
        // System.out.println("var= Vansh");

        // case "Hariom" ->
        // System.out.println("var= Hariom");

        // default ->
        // System.out.println("No name");
        // }

    }

}
