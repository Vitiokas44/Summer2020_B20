package day17_String_review;

import java.util.Scanner;

public class substractFirst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scan.next();
       String r = word.substring(1);
       // char s = word.charAt(0);
        System.out.println(r);

    }
}
