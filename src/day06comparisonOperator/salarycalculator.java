package day06comparisonOperator;

public class salarycalculator {
    /*   task04:
            Create a class called SalaryCalculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
                ex:
                    if: rate = 55;
                        stateTaxRate = 0.04;
                        federalTaxRate =0.22;
                        weeklyHours = 40;
                    then output will be:
                            your salary is: 105600 USD
                            your total tax is: 27456 USD
                            your income after tax is: 78144 USD
                Assume that a year has 48 weeks (excluding PTO) */
    public static void main(String[] args) {
        double rate = 48.5;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.2;
        int weeklyHours = 40;
        double salary = rate* weeklyHours*48;
        double totalTax = salary*(stateTaxRate+federalTaxRate);
        double salaryAfterTax = salary-totalTax;


        System.out.println("Salary before Tax is "+salary+" USD");
        System.out.println("Total Tax : "+totalTax+" USD");
        System.out.println("Take  home salary is "+salaryAfterTax+" USD");
        System.out.println();



    }

}
