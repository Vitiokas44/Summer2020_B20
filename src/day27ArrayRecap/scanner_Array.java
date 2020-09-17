package day27ArrayRecap;

import java.util.Arrays;
import java.util.Scanner;

public class scanner_Array {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers?");
        String [] names = new String[ scan.nextInt()];
        scan.nextLine();
        for(int i=0;i<=names.length-1;i++){
            System.out.println("Enter a name:");
            names[i]=scan.nextLine();


        }
        System.out.println(Arrays.toString(names));
    }
}