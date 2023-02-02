import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyQuiz extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 6) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
            i++;
        }
    }

    private ArrayList<String> questions;
    private ArrayList<ArrayList<String>> options;
    private ArrayList<String> correct;
    private int score;
    private float percentage;

    public MyQuiz() {
        this.questions = new ArrayList<>();
        this.options = new ArrayList<ArrayList<String>>();
        this.correct = new ArrayList<>();
    }

    private void setter() {

        questions.add("Who invented Java Programming?");
        questions.add("Which statement is true about Java?");
        questions.add("Which component is used to compile, debug and execute the java programs?");
        questions.add("Which one of the following is not a Java feature?");
        questions.add("Which of these cannot be used for a variable name in Java?");
        questions.add(
                "What will be the output of the following Java code?\nclass increment {\n   public static void main(String args[]){\n\tint g = 3;\n\tSystem.out.print(++g * 8);\n   }\n}");
        questions.add("What will be the error in the following Java code?\n\tbyte b=50;\n\tb = b*50;");
        questions.add("Which of the following is a type of polymorphism in Java Programming?");
        questions.add("Which exception is thrown when java is out of memory?");
        questions.add("Which of the following is a superclass of every class in Java?");
        questions.add("Which of these statements is incorrect about Thread?");
        questions.add("Which of these keywords are used for the block to be examined for exceptions?");
        questions.add("Who is the creator of this Quiz?");
        // ArrayList<ArrayList<String>> options = new ArrayList<ArrayList<String>>();
        options.add(0, new ArrayList<>(
                Arrays.asList("Guido van Rossum", "James Gosling", "Dennis Ritchie", "Bjarne Stroustrup")));
        options.add(1, new ArrayList<>(Arrays.asList("Java is a sequence-dependent programming language",
                "Java is a code dependent programming language", "Java is a platform-dependent programming language",
                "Java is a platform-independent programming language")));
        options.add(2, new ArrayList<>(Arrays.asList("JRE", "JIT", "JDK", "JVM")));
        options.add(3, new ArrayList<>(
                Arrays.asList("Object-oriented", "Use of pointers", "Portable", "Dynamic and Extensible")));
        options.add(4, new ArrayList<>(Arrays.asList("int $45Uit", "int String", "int 43Ramu", "int _6784")));
        options.add(5, new ArrayList<>(Arrays.asList("32", "33", "24", "25")));
        options.add(6, new ArrayList<>(Arrays.asList("b cannot contain value 50",
                "b cannot contain value 100, limited by its range", "No error in this code",
                "* operator has converted b * 50 into int, which can not be converted to byte without casting")));
        options.add(7, new ArrayList<>(Arrays.asList("Multiple polymorphism", "Compile time polymorphism",
                "Multilevel polymorphism", "Execution time polymorphism")));
        options.add(8, new ArrayList<>(
                Arrays.asList("MemoryError", "OutOfMemoryError", "MemoryOutOfBoundsException", "MemoryFullException")));
        options.add(9, new ArrayList<>(Arrays.asList("ArrayList", "Abstract class", "Object class", "String")));
        options.add(10,
                new ArrayList<>(Arrays.asList("start() method is used to begin execution of the thread",
                        "run() method is used to begin execution of a thread before start() method in special cases",
                        "A thread can be formed by implementing Runnable interface",
                        "A thread can be formed by a class that extends Thread class")));
        options.add(11, new ArrayList<>(Arrays.asList("check", "throw", "catch", "try")));
        options.add(12, new ArrayList<>(Arrays.asList("@Rohit Mehra", "@Jadeja", "@RamManus", "@Ansh Vikalp")));
        // options.get(0).add("A");
        // options.get(0).add("B");
        // options.get(0).add("C");
        // options.get(0).add("D");
        // System.out.println(questions.get(0));

        // ArrayList<String> correct = new ArrayList<>();
        correct.add("James Gosling");
        correct.add("Java is a platform-independent programming language");
        correct.add("JDK");
        correct.add("Use of pointers");
        correct.add("int 43Ramu");
        correct.add("32");
        correct.add("* operator has converted b * 50 into int, which can not be converted to byte without casting");
        correct.add("Compile time polymorphism");
        correct.add("MemoryOutOfBoundsException");
        correct.add("Object class");
        correct.add("run() method is used to begin execution of a thread before start() method in special cases");
        correct.add("try");
        correct.add("@Ansh Vikalp");

    }

    public void playerMcq() {

        // int score = 0;
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
            // sc.close();
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
        // System.out.println("----------------------------");
        // System.out.println("Total marks: " + score + "/" + questions.size());
        // System.out.printf("%+14sTotalMarks", "");

        System.out.printf("%100s\n", "-----------------------------------------");
        System.out.printf("%71s%28s\n", "Total Marks", "Percentage");
        System.out.printf("%100s\n\n", "-----------------------------------------");
        System.out.printf("%65d/%d%30.2f\n", score, questions.size(), round_percent);
        System.out.printf("%100s\n", "-----------------------------------------");
        // System.out.println("Percentage: " + round_percent + "%");
        // System.out.println("----------------------------");
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
            // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().wait(3000L);
            // System.out.print("0 min");
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
        System.out.println();
        System.out.println("@RULES:");
        System.out.println("\t^_~ This MCQ contains 13 Question each of 1 marks.");
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
        Scanner sc = new Scanner(System.in);
        String decigion = sc.next();
        // sc.close();
        if (decigion.equalsIgnoreCase("Y") || decigion.equalsIgnoreCase("Yes")) {
            this.setter();
            System.out.println();
            System.out.println();
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

        MyQuiz obj = new MyQuiz();
        // obj.start();
        obj.rules();
        obj.displayResult();
        // Date d= new Date();
        // System.out.println(d.getDate());

    }
}
