package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@FunctionalInterface
interface Timer {
    public void settimer();
}

/**
 * <h4>File Handling</h4>
 * It is an important aspect of any programming.It is necessary step as to
 * hold/store our computational data inside a file system so, that it can remain
 * permanent.
 * The use of main memory(RAM) to store values is limited to very small amount
 * of results.
 * But when talking about lage volume then we need to have a file in our system
 * <p>
 * The various operation perform in our file are- <I>CREATE, READ, WRITE,
 * UPDATE, DELETE</I>
 * File in Java can be created by using object of file class. THis can evn
 * throws a IO Exception
 * Choices:-
 * <ul type="bullet">
 * <li>Handel the Exception in main meathod by surrounding it with Try-
 * catch(){}</li>
 * <li>Declare the main meathod itself to throws an IO Exception</li>
 * </ul>
 * 
 * @author Ansh-Vikalp
 * @since 25/2/2023
 * @version 1.0
 * @see also <a href="https://www.w3schools.com/java/java_files.asp"> W3 School
 *      </a>
 */
public class cwh_70_FileHandling {

    /**
     * A static meathod to set the timer for delay Processing...
     * Exception has already handled in the function itself.
     */

    /**
     * Main entry point for the launcher. Note: This method calls System.exit.
     * 
     * @param args Input taken from command line Interface
     * @throws Exception - only if an uncaught internal exception occurs; just
     *                   retained for historical compatibility
     */
    public static void main(String[] args) {

        // ? Creating a File

        // This not throw IO error
        File file = new File("D:\\JAVA_Training\\Crack-JAVA\\src\\File_Handling\\mypasswordfile.txt");
        try {

            /*
             * //? file.createNewFile()
             * This method returns a boolean value: true if the file was successfully
             * created, and false if the file already exists. Note that the method is
             * enclosed in a try...catch block. This is necessary because it throws an
             * IOException if an error occurs (if the file cannot be created for some
             * reason)
             * //! EX- java.io.IOException: The system cannot find the path specified
             */
            if (file.createNewFile()) {
                System.out.println("File CREATED: " + file.getName());
            } else {
                System.out.println("File already exist.");
            }

        } catch (IOException e) {
            System.out.println("Problem occured while creating new file.");
            e.printStackTrace();
        }

        // ? Write in the Created File
        // Below object throws IO Exception
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("This is very secret message.\nMy Email-id is: anshvikalp511@gmail.com");
            fileWriter.close();
            System.out.println("Successfully wrote to file.");

        } catch (IOException t) {
            System.out.println("An error occurred.");
            System.out.println(t.getMessage());
        }

        // ? Reading a file
        try {

            // timer();
            Timer t = () -> {
                System.out.print("Processing");
                try {
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(".");
                            Thread.sleep(500);
                        }
                        System.out.printf("\b\b\b");

                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println();
            };

            t.settimer();
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();

        } catch (IOException o) {
            System.out.println("An error occurred.");
            o.printStackTrace();

        }
        System.out.println();
        System.out.println();

        /* Some Extra Func related To File Class */

        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable " + file.canRead());
            System.out.println("File size in bytes " + file.length());
        } else {
            System.out.println("The file does not exist.");
        }
        System.out.println();
        System.out.println();

        // ? Deleting existing file
        System.out.print("Do yu want to delete file \"" + file.getName() + "\": ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        if (s.equalsIgnoreCase("Yes") || s.equalsIgnoreCase("Y")) {

            if (file.delete()) {
                System.out.println("Deleted the File: " + file.getName());
            } else {

                System.out.println("File can't be deleted");

            }

        }

    }
}