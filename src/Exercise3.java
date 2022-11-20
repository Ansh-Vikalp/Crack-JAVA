import java.util.Scanner;

class Game {
    private int noOfGuesses;
    private int user_no;
    private int comp_no;

    public Game() {
        int max = 6, min = 1;
        comp_no = (int) (Math.random() * (max - min + 1) + min);
    }

    Scanner sc = new Scanner(System.in);

    public void takeUserInput() {
        System.out.print("Enter a no- ");
        int i = sc.nextInt();
        user_no = i;

    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses() {
        System.out.print("Enter no of GUESSES: ");
        int j = sc.nextInt();
        this.noOfGuesses = j;

    }

    public void isCorrectNo() {

        while (this.noOfGuesses != 0) {
            takeUserInput();
            if (user_no == comp_no) {
                System.out.println("Correct Guess");
                return;
            } else if (user_no < comp_no) {
                System.out.println("Some more higher");
                System.out.println();
                this.noOfGuesses--;

                System.out.println("CHANCES left= " + getNoOfGuesses());
                System.out.println();
                System.out.println();

            } else {
                System.out.println("Some little less");
                this.noOfGuesses--;

                System.out.println("CHANCES left= " + getNoOfGuesses());
                System.out.println();
                System.out.println();

            }

        }

    }

}

public class Exercise3 {
    public static void main(String[] args) {

        System.out.println(" GUESS THE NO ");
        Game p1 = new Game();
        p1.setNoOfGuesses();
        p1.isCorrectNo();

    }
}