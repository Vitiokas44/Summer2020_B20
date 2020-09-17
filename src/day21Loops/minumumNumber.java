package day21Loops;

import java.util.Scanner;

public class minumumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 999999999;
        for(int i =1; i<= 10; i++){

            System.out.println("Enter a number");
            int num = scan.nextInt(); // 50, 10, 5, 20, 3

            if(num < min){
                min = num;
            }

        }

        System.out.println("Minimum number: "+min);



    }



}