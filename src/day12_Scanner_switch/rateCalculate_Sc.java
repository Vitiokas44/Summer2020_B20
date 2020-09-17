package day12_Scanner_switch;

import java.util.Scanner;

public class rateCalculate_Sc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR SALARY: ");
        double salary = scan.nextDouble();
        System.out.println("enter your hours per week : ");
        int weeklyHour = scan. nextInt();
        int totalHours = weeklyHour* 52;
      //  System.out.println("enter your hour rates");
        double hourRates = salary/totalHours;

        System.out.println("your hourly rate is $ : " +  hourRates );

    }
}
