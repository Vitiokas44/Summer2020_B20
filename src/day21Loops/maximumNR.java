package day21Loops;
import java.util.Scanner;
public class maximumNR {
    public static void main(String[] args) {
        /* 1. write a program that asks user to enter 5 numbers and returns
    the maximum number*/
        Scanner scan = new Scanner(System.in);

        int max  = -9999999;  // -100

        for(int i = 10; i <= 50; i += 10) {

            System.out.println("Enter a number");
            int num = scan.nextInt(); //

            if(num > max ){
                max = num;
            }

        }

        System.out.println("Max number: " +max);



    }

}