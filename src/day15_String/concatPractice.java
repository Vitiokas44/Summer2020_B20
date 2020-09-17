package day15_String;

import java.util.Scanner;

public class concatPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String schoolname =scan.next();
        String school=schoolname.concat("SCHOOL");
        System.out.println(school);

    }
}
