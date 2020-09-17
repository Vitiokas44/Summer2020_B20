package day14Scanner;

import java.util.Scanner;

public class shippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number:");
        int buildingNumber = scan.nextInt();
        System.out.println("Enter your street address;");
        scan.nextLine();
        String streetAddress = scan.nextLine();
        System.out.println("Enter your city name:");
        String cityName = scan.next();
        System.out.println("Enter your state name:");
        String stateName = scan.next();
        System.out.println("Enter your zip code:");
        int zipCode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter full name of person:");
        String fullName = scan.nextLine();

        System.out.println("SHIP TO: "+fullName+" "+
                                       buildingNumber+" "+
                                       cityName+", "+stateName+" "+zipCode);

    }
}
