package day13;

import java.util.Scanner;

public class nextLine_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building nr: ");
        int buildingNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your street name:");
        String streetName = scan.nextLine();
        System.out.println(buildingNumber+" "+ streetName);
    }
}
