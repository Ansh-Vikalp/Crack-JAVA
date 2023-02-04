package MyQuizzer;

import java.util.Scanner;

public class MainPlayer extends MyQuizzer {

    private int score;
    private float percentage;

    public void playerMcq() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Ques" + (i + 1) + " " + questions.get(i));
            for (int j = 0; j < options.get(i).size(); j++) {
                String key = "";
                switch (j) {
                    case 0:
                        key = "\t<A> ";
                        break;
                    case 1:
                        key = "\t<B> ";
                        break;
                    case 2:
                        key = "\t<C> ";
                        break;
                    case 3:
                        key = "\t<D> ";
                    default:
                        break;
                }
                System.out.println(key + options.get(i).get(j));
            }
            System.out.print("\n\tEnter correct option: ");
            String answer = sc.next();

            int make = -1;
            switch (answer.toUpperCase()) {
                case "A":
                    make = 0;
                    break;
                case "B":
                    make = 1;
                    break;
                case "C":
                    make = 2;
                    break;
                case "D":
                    make = 3;
                default:
                    break;
            }
            try {

                if (correct.get(i).equals(options.get(i).get(make))) {
                    score++;

                }
                System.out.println();

            } catch (Exception e) {
                System.out.println("Please make valid selection : : Point DEDUCTED ");
                score--;
                System.out.println();

            }

        }
        sc.close();

    }

    public void displayResult() {
        percentage = (float) (score) / questions.size() * 100;
        float round_percent = Math.round(percentage * 100) / 100f;

        System.out.printf("%100s\n", "-----------------------------------------");
        System.out.printf("%71s%28s\n", "Total Marks", "Percentage");
        System.out.printf("%100s\n\n", "-----------------------------------------");
        System.out.printf("%65d/%d%30.2f\n", score, questions.size(), round_percent);
        System.out.printf("%100s\n", "-----------------------------------------");

        System.out.println();
        if (round_percent <= 100 && round_percent > 90) {
            System.out.println("EXCELLENT");
        } else if (round_percent <= 90 && round_percent > 70) {
            System.out.println("Nice WORK");
        } else if (round_percent <= 70 && round_percent > 30) {
            System.out.println("GOOD");
        } else {
            System.out.println("Better Luck Next Time!");
        }
        System.out.println(
                "\n\n\t\t\t\t---------------------------------------Answer KEY---------------------------------------");

        for (int i = 0; i < correct.size(); i++) {
            if (i + 1 < 10)
                System.out.println("Q" + (i + 1) + "------ " + correct.get(i));
            else
                System.out.println("Q" + (i + 1) + "----- " + correct.get(i));
        }

    }

    private static void timer() {
        System.out.print("\t\t\t\t\t\t\t\t\t\tTEST STARTS IN: ");

        try {
            for (int i = 8; i > 0; i--) {
                System.out.printf("%d%s\b\b\b\b\b", i, " sec");

                Thread.sleep(1000);

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void rules() {
        System.out.println(
                "-----------------------------------------Welcome to MyQuiz-----------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("1. Admin Login");
        System.out.println("2. Quick Start");
        System.out.print("\nEnter Your Choice--> ");
        int g = sc.nextInt();
        if (g == 1) {
            // TODO: Admin LOGIN
            admin();

        } else {
            super.setMcq();
        }
        System.out.println();

        try {
            // ?Taken from YuTube Creates new Windows Poweshell
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().wait();
        } catch (Exception e) {
            // System.out.println(e);
        }
        System.out.println(
                "-----------------------------------------Welcome to MyQuiz-----------------------------------------");
        System.out.println("@RULES:");
        System.out.println("\t^_~ This MCQ contains " + questions.size() + " Question each of 1 marks.");
        System.out.println("\t^_~ Some Coding Question are also included.");
        System.out.println(
                "\t^_~ Type only option no. in your Answer. (Ex- If A is correct option for Ques1 Type A and Hit ENTER)");
        System.out.println(
                "\t^_~ NOTE: Don't try to make irrelevent choice. Doing so will deduct your score by -1. (EX- Typing some String or char other than A, B, C, D)");
        System.out.println("\t^_~ Don't involve in any malpractices!");
        System.out.println("\t^_~ Answer KEY is provided at end for your reference.");
        System.out.println(
                "-----------------------------------------  :) ALL THE BEST (: -----------------------------------------");

        System.out.println();
        System.out.print("Are you Sure to START? (Y/N): ");

        String decigion = sc.next();

        if (decigion.equalsIgnoreCase("Y") || decigion.equalsIgnoreCase("Yes")) {

            System.out.println("\n\n");

            timer();
            System.out.println();
            System.out.println();
            this.playerMcq();

        } else {
            System.exit(0);
        }
        sc.close();

    }

    public static void main(String[] args) {

        MainPlayer p1 = new MainPlayer();
        p1.rules();
        p1.displayResult();

    }

}
