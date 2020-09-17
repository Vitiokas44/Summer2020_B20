package day21Loops;

import java.util.Scanner;

public class carInsurance {
    public static void main(String[] args) {
     double premium = 0;
     int accidentAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        System.out.println("Enter your name");
        name = scan.nextLine();


        System.out.println("Do you have a US driver license?");
       String drvLicence = scan.next();
        if (drvLicence.equalsIgnoreCase("No")) {
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
       int zipcode = scan.nextInt();
        if (zipcode == 20910 || zipcode == 20740) {
            premium = 60;
        } else if (zipcode == 22102 || zipcode == 22103) {
            premium = 30;
        } else {
            premium = 50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();
        if (vehicleOwnership.equalsIgnoreCase("owned")) {
            premium += 10;
        } else {
            premium += 20;
        }


        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();
        if (vehicleUsage.equalsIgnoreCase("Business")) {
            premium += 50;
        } else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
            premium += 10;
        } else if (vehicleUsage.equalsIgnoreCase("Commute")) {
            premium += 20;
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = scan.nextInt();
            if (daysDrivenToWorkOrSchool != 0) {
                premium += (5 * daysDrivenToWorkOrSchool);
            }

            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            premium += milesToWorkOrSchool;
        }

        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (age < 16) {
            System.out.println("Invalid data!");
            System.exit(0);
        } else if (age >= 16 && age < 18) {
            premium *= 20;
        } else if (age >= 18 && age <= 21) {
            premium *= 6;
        } else if (age > 21 && age < 25) {
            premium *= 2;
        }

        System.out.println("How many years you've been driving?");
        int record=scan.nextInt();
        if (record<=0 || (age-record)<16){
            System.out.println("invalid data!");
            System.exit(0);
        }
        premium -= (record * 5);

        System.out.println("Have you had any accidents in the last 5 years?");
       String accidents = scan.next();
        if (accidents.equalsIgnoreCase("yes")) {
            System.out.println("How many?");
           int accidentsAmount=scan.nextInt();
            premium += (premium * 0.20) * accidentsAmount;
        }

        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance = scan.next();
        if (continuousInsurance.equalsIgnoreCase("no")) {
            premium *= 2;
        }

        System.out.println("What is the highest level of education you have completed?");
        education = scan.next();
        if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("bachelors") || education.equalsIgnoreCase("Masters")) {
            premium -= (premium * 0.05);
        } else if (education.equalsIgnoreCase("doctors")) {
            premium -= (premium * 0.10);
        } else if (education.equalsIgnoreCase("High School")) {
        } else {
            education="LESSTHanHighSchool";
            premium += (premium * 0.05);
        }

        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);
        referenceNumber += name.substring(0, 2);
        referenceNumber += age;
        referenceNumber += name.substring(name.length() - 2, name.length());
        referenceNumber += zipcode;
        referenceNumber+=education;
        System.out.println("Reference number: " + referenceNumber.toUpperCase());

    }
}