package day15_String;

import java.util.Scanner;

public class String_ToUpperCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first NAME:");
        String firstName = input.next();
        System.out.println("Enter last name: ");
        String lastName = input.next().toUpperCase();
        String fullName = firstName +" "+lastName;
        fullName = fullName.toUpperCase();
        System.out.println(fullName);


    }
}
