package day20while_Loops;

import java.util.Scanner;

public class factorialNr {
    public static void main(String[] args) {
        /*
    4. Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120*/
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        double result = 1; // 5 * 4 * 3 * 2 * 1 == 120

        for(int i = n; i >= 1; i-- ){ // i: 5, 4, 3, 2, 1
            result *= i;
        }

        System.out.println(result);

    }

}