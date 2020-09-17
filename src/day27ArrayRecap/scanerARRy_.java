package day27ArrayRecap;

import java.util.Scanner;

public class scanerARRy_ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter");

        String[] students = new String[scan.nextInt()]; //3Enter

        scan.nextLine(); // take out the Enter in scanner
        for (int i = students.length - 1; i >= 0; i--) { //i: 0,1,2,3...students.length-1
            System.out.println("Enter a name");
            students[i] = scan.nextLine();
        }
    }
}