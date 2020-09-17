package day12_Scanner_switch;

import java.util.Scanner;
public class userInput_practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
       double num =  scan.nextDouble();
       String result = (num %2 == 0)? " is Even number" : num+" isOdd";
        System.out.println(result);
    }
}

