package day13;

import java.util.Scanner;

public class salary_aftertax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your annual salary");
        int salary = input.nextInt();
        System.out.println("Enter your state tax rate: ");
        double stateTaxRate = input. nextDouble();
        double stateTax = salary*stateTaxRate;
        System.out.println("Enter your federal tax rate: ");
         double federalTaxRate = input.nextDouble();
         double federalTax = salary*federalTaxRate;
         double salaryAfterTax = salary -stateTax-federalTaxRate;
        System.out.println("Your annual salary: $ "+salary );
        System.out.println("Your state tax: $ " +stateTax);
        System.out.println("Federal tax : $ " +federalTax);
        System.out.println("your salary after tax: $ " + salaryAfterTax);





    }
}
