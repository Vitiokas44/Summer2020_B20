package day0;


import java.util.Arrays;
import java.util.Scanner;

public class ffffg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what size is the array?");
        int size= scan.nextInt();
        int []arr2= new int[size];
        for(int i=0;i<=arr2.length-1;i++){
            System.out.println("enter a number");
            arr2[i]=scan.nextInt();
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
