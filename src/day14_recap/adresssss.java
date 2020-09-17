package day14_recap;

import java.util.Scanner;
/*
 1. write a program for the shipping info that, the program should ask:
                    building number ( nextInt() )
                            nextLine()
                    Street address (Assume it has more than one word) ( nextLine() )
                    city name (nextLine() )
                    state name ( next() )
                    zip code ( nextInt() )
                            nextLine()
                    full name of the person ( nextLine() )
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
 */
public class adresssss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print building number: ");
        int buildingNR = input.nextInt();
        input.nextLine();
        System.out.println("Enter your street address: ");
        String streetAddress = input.nextLine();
        System.out.println("Print your city name: ");
       // input.nextLine();
        String cityName = input.nextLine();
        System.out.println("Print your state: ");
        String state = input.next();
        System.out.println("Enter your zip code: ");
        int zippCode = input.nextInt();
        input.nextLine();
        System.out.println("Enter your full name:");
        String fullName = input.nextLine();
        System.out.println("Ship to " +fullName+"\n"+buildingNR+" "+streetAddress+"\n"+cityName+", "+state+" "+zippCode);
    }

}
/*  public static void main(String[] args) {
        Scanner address = new Scanner(System.in);
        System.out.println("Print building number: ");
        int buildingNR = address.nextInt();
        System.out.println("Street name: ");
        String streetName = address.nextLine();
        System.out.println("Print road name: ");
        String roadName = address.next();
        System.out.println("Print your city name: ");
        String cityName = address.next();
        System.out.println("Print your state: ");
        String state = address.next();
        System.out.println("Enter your zip code: ");
        int zippCode = address.nextInt();
        System.out.println("My address is: "+buildingNR+" "+streetName+" "+roadName+", "+cityName+" "+state+", "+zippCode);


    }*/