package day20while_Loops;

import java.util.Scanner;

public class sumOfNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          int sum=0;

        for(int i=0;i<=5;i++){
            System.out.println("enter numbers:");
            int n = scan.nextInt();
            sum+=n;
            System.out.println(sum);

        }
    }
}
