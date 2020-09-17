package day15_String;

import java.util.Scanner;

public class StringToLowerCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName =   scan.next();  // "Cybertek"

        System.out.println("Eneter your last name");
        String lastName =   scan.next(); // "School"

        //  String fullName = firstName.concat( " ".concat(lastName)  ); // "CybertekSchool"
        String fullName = firstName+" "+lastName;

       String name2 = fullName.toLowerCase();
        System.out.println(name2);
        String name3 = fullName.toUpperCase();
        System.out.println(name3);
        //  System.out.println( "Your full name is: ".concat(fullName ) );
        System.out.println( "Your full name is: " + fullName  );


    }
}



