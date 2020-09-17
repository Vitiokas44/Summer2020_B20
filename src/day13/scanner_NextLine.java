package day13;

import java.util.Scanner;

public class scanner_NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Full name:");
          String firstName =  scan.nextLine();
        System.out.println("Enter your Company  Name");
        String lastName = scan.nextLine();
        System.out.println("Enter your age: ");
        int age= scan.nextInt();
        System.out.println("Enter your CITY:");
        String city = scan.next();
        System.out.println("Enter your  phone number:");
        long phoneNumber = scan.nextLong();
    }
}
