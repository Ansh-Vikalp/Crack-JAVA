import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        int min = 1;
        int max = 3;
        int comp_wins = 0;
        int user_wins = 0;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------------Welcome to Game----------------------");
        System.out.println();
        System.out.println("Choices:");
        System.out.println("1--> Rock");
        System.out.println("2--> Paper");
        System.out.println("3--> Scissor");
        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println();
        System.out.print("No. of times you want to play: ");
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        System.out.println();
        System.out.println();

        while (times-- != 0) {
            int comp = (int) (Math.random() * (max - min + 1) + min);

            String compa;
            switch (comp) {
                case 1:
                    compa = "Rock";
                    break;

                case 2:
                    compa = "Paper";
                    break;

                default:
                    compa = "Scissor";
                    break;
            }
            System.out.print("USER select: ");
            int user = sc.nextInt();
            if (user == 1) {
                if (comp == 2) {
                    System.out.println("computer select: " + compa);
                    System.out.println("Lose");
                    System.out.println();
                    System.out.println();
                    comp_wins++;
                } else if (comp == 3) {
                    System.out.println("computer select: " + compa);
                    System.out.println("Win");
                    System.out.println();
                    System.out.println();
                    user_wins++;
                } else {
                    System.out.println("computer select: " + compa);
                    System.out.println("Draw");
                    System.out.println();
                    System.out.println();
                }

            }

            else if (user == 2) {
                if (comp == 1) {
                    System.out.println("computer select: " + compa);
                    System.out.println("Win");
                    System.out.println();
                    System.out.println();
                    user_wins++;
                } else if (comp == 3) {
                    System.out.println("computer select: " + compa);
                    System.out.println("Lose");
                    System.out.println();
                    System.out.println();
                    comp_wins++;
                } else {
                    System.out.println("computer select: " + compa);
                    System.out.println("Draw");
                    System.out.println();
                    System.out.println();
                }
            }

            else {
                if (comp == 1) {
                    System.out.println("computer select: " + compa);
                    System.out.println("Lose");
                    System.out.println();
                    System.out.println();
                    comp_wins++;
                } else if (comp == 2) {
                    System.out.println("computer select: " + compa);
                    System.out.println("Win");
                    System.out.println();
                    System.out.println();
                    user_wins++;
                } else {
                    System.out.println("computer select: " + compa);
                    System.out.println("Draw");
                    System.out.println();
                    System.out.println();
                }

            }

        }

        sc.close();

        if (user_wins > comp_wins) {
            System.out.println("You Win the Match by " + user_wins);
        } else if (comp_wins > user_wins) {
            System.out.println("Computer wins the Match by " + comp_wins);
        }

        else {
            System.out.println("DRAW, Try AGAIN! " + user_wins);
        }
    }

}
