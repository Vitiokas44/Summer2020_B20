package day15_String;

import java.util.Scanner;

public class lengthPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = scan.next();
        int l =   name.length();
        System.out.println(l);

        //last index: length of String - 1
        int lastIndexNumber = name.length() - 1;

        System.out.println( lastIndexNumber );

        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);
    }
}
