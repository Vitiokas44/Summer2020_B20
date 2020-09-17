package day14Scanner;

import java.util.Scanner;

public class adress_scan {
    public static void main(String[] args) {
        Scanner address = new Scanner(System.in);
        System.out.println("Print building number: ");
        int buildingNR = address.nextInt();
        System.out.println("Street name: ");
        String streetName = address.next();
        System.out.println("Print road name: ");
        String roadName = address.next();
        System.out.println("Print your city name: ");
        String cityName = address.next();
        System.out.println("Print your state: ");
        String state = address.next();
        System.out.println("Enter your zip code: ");
        int zippCode = address.nextInt();
        System.out.println("My address is: "+buildingNR+" "+streetName+" "+roadName+", "+cityName+" "+state+", "+zippCode);


    }
}
