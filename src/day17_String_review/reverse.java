package day17_String_review;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "Java";
        char last = str.charAt(str.length() - 1);

       // System.out.println(" " + str.charAt(str.length() - 1) + str.charAt(str.length() - 2) + str.charAt(str.length() - 3) + str.charAt(str.length() - 4));
        System.out.println(" " + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0));
        System.out.println(str.substring(4) + str.substring(3,4) + str.substring(2,3) + str.substring(1,2)+str.substring(0,1));
        System.out.println(str.substring(2));
        System.out.println(str.substring(3));




    }
}