import java.util.Scanner;//Build in Package

import AccessModifiers.Modifiers.cwh_25_AccessModifiers;
import Calculators.*;
import Country.State.District.Patna;

public class Practice11 extends cwh_25_AccessModifiers {

    // Q1) Create three classes calculator , Sc calculator and Hybridcalculator and
    // group them into a package.
    // Q2) Use a build-in package in java to write a class which displays a message
    // ( by using sout ) after taking input from the user
    // Q3) Create a package in class with three package levels folder , folderL1 ,
    // folderL2
    // Q4) prove that you cannot access deafault property but can access protected
    // properly from the subclass.

    public static void main(String[] args) {

        System.out.println("-------------------Simple Calculator---------------------");
        SimpleCalc s1 = new SimpleCalc();
        s1.setter(8, 2);
        s1.add();
        s1.sub();
        s1.mul();
        s1.div();
        System.out.println();
        System.out.println();

        System.out.println("------------------Scientific Calculator-------------");
        ScientificCalc s2 = new ScientificCalc();
        s2.setter(8, 2);
        s2.add();
        s2.sine(0);
        s2.cosine(30);
        s2.tan(45);
        s2.sineh(60);
        s2.cosh(90);
        System.out.println();
        System.out.println();

        System.out.println("------------------Hybrid Calculator-----------------");
        HybridCalc s3 = new HybridCalc();
        s3.setter(8, 2);
        s3.sub();
        s3.cot(90);
        s3.binaryEquivalent(2);
        s3.hexaEquivalent(10);
        s3.octalEquivalent(8);

        System.out.println();
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String h = sc.nextLine();
        sc.close();
        System.out.println("Your Name is-- " + h);
        System.out.println();
        System.out.println();

        Patna p = new Patna();
        p.fun();

        System.out.println();
        System.out.println();

        Practice11 obj = new Practice11();// sub class of parent cwh_25_AccessModifiers
        System.out.println("We can access protected properties: " + obj.cwh_25_y);
        // System.out.println("We can not access default properties: "+ obj.cwh_25_z);❌

    }
}