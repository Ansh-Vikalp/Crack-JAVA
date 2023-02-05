package MyQuizzer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class MyQuizzer {
    protected ArrayList<String> questions;
    protected ArrayList<ArrayList<String>> options;
    protected ArrayList<String> correct;
    private static String password;// all teacher has same password

    public MyQuizzer() {
        this.questions = new ArrayList<>();
        this.options = new ArrayList<ArrayList<String>>();
        this.correct = new ArrayList<>();
        // TODO: Default password
        password = "@anshvikalp511";
    }

    public static boolean passVerifier(String name) {
        if (password.equals(name)) {
            return true;
        }
        return false;

    }

    protected void setMcq() {

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

    public void admin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Password: ");
        String userpass = scanner.nextLine();
        if (passVerifier(userpass) != true) {
            System.out.println("Wrong Password!");
            System.exit(1);
        }
        System.out.println("Press N to exit\n");

        for (int i = 0; i < 30; i++) {
            System.out.print("Ques" + (i + 1) + " ");
            String que = scanner.nextLine();
            if (que.equals("N")) {
                break;
            } else {

                questions.add(i, que);
            }

            options.add(i, new ArrayList<>());

            for (int j = 0; j < 4; j++) {
                System.out.print("\n\t<" + (char) (65 + j) + "> ");
                String op = scanner.nextLine();
                options.get(i).add(op);

            }

            System.out.printf("%33s", "Correct Option: ");
            String co = scanner.nextLine();
            int val = -1;
            switch (co.toUpperCase()) {
                case "A":
                    val = 0;
                    break;
                case "B":
                    val = 1;
                    break;
                case "C":
                    val = 2;
                    break;
                case "D":
                    val = 3;
                    break;
                default:
                    break;
            }
            correct.add(i, options.get(i).get(val));
            System.out.println();

        }

    }

}
