package day14Scanner;

import java.util.Scanner;

public class carInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your car brand: ");
        String brand = scan.nextLine();
        System.out.println("Write your car model: ");
        String model = scan.nextLine();
        System.out.println("Write your car year: ");
        int year = scan.nextInt();
        System.out.println("Write your car's color");
        String color = scan.next();
        System.out.println("Write car's mileage: ");
        int mileage = scan. nextInt();
        System.out.println("Write your car's price: ");
        int price = scan.nextInt();
        System.out.println(year+" "+brand+" "+model+" "+color+", "+mileage+" miles, "+price+" dollars");
    }




}
