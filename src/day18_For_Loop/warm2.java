package day18_For_Loop;

import java.util.Scanner;

public class warm2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your first name:");
        String  firstName =scan.next();
        System.out.println("Enter your last name:");
        String  lastName = scan.next();
      //  char ch1 = firstName.charAt(0);
        //char ch2 = lastName.charAt(0);
        String firstIndexFirst = firstName.substring(0,1);
        String firstIndexLast = lastName.substring(0,1);
        System.out.println("Your initial is: "+firstIndexFirst.toUpperCase().concat(firstIndexLast.toUpperCase()));

    }
}
