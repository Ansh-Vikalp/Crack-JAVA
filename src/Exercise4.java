import java.util.Scanner;

//Library Management System

class Library {
    String[] books = new String[20];
    // String[] availablebooks;
    String[] issuedbooks = new String[20];
    int k = 0;

    public Library(String... arr) {

        int i = 0;
        for (String string : arr) {
            books[i] = string;
            i++;
        }
    }

    public void addBook(String b) {
        for (int i = 0; i < books.length; i++) {

            if (books[i] == null) {
                books[i] = b;
                break;
            }

        }

    }

    private void delete(String del) {
        for (int i = 0; i < books.length; i++) {
            if (this.books[i].equals(del)) {
                this.books[i] = null;
                break;
            }
        }

    }

    public void showAvailableBook() {
        for (String string : books) {
            if (string != null) {
                System.out.println(string);
            }
        }
    }

    Scanner sc = new Scanner(System.in);

    public void issueBook() {
        System.out.println("Available books are: ");
        showAvailableBook();
        System.out.print("Choose your book: ");
        String issue = sc.nextLine();
        delete(issue);
        issuedbooks[k] = issue;
        k++;
        System.out.println("Book ISSUED");
    }

    public void returnBook() {
        System.out.print("Enter book name: ");
        String returnt = sc.nextLine();
        addBook(returnt);
        System.out.println("Book RETURNED");

    }

}

public class Exercise4 {

    public static void main(String[] args) {
        Library l1 = new Library("Math", "Science", "S.S.T", "Physical Education");
        l1.addBook("Intro to java");
        l1.addBook("Kali linux");
        l1.issueBook();
        System.out.println();
        System.out.println();
        l1.showAvailableBook();
        System.out.println();
        System.out.println();
        l1.returnBook();
        System.out.println();
        System.out.println();
        l1.showAvailableBook();

    }

}
