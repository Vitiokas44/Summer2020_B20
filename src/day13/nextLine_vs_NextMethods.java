package day13;

import java.util.Scanner;

public class nextLine_vs_NextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();
        scan.nextLine();// use it to take out the Enters that ere left in scanner;
        System.out.println("Enter your full name: ");

        String fullName =  scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("full name: "+fullName);

    }
}
