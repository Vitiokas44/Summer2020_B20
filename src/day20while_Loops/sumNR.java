package day20while_Loops;

import java.util.Scanner;

public class sumNR {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);


        int sum =0;
        for(int i =0;i>=0;i++){
            System.out.println("Enter your numbers");
            int n = s.nextInt();
            sum +=n;
        }
            System.out.println(sum);
        }
    }

