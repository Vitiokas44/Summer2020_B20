package day14Scanner;

import java.util.Scanner;

public class  companyName {
    public static void main(String[] args) {
        Scanner businnes = new Scanner(System.in);
        System.out.println("What is your company name: ");
        String company = businnes.nextLine();
        System.out.println("Enter your first name: ");
        String firstName = businnes.next();
        System.out.println("Enter your last name: ");
        String lastName = businnes.next();
        System.out.println("your job title: ");
        businnes.next();
        String jobTitle = businnes.nextLine();
        System.out.println("Your salary: ");
        int salary = businnes.nextInt();
        System.out.println("Company is: "+company+" first name is: "+ firstName+" "+jobTitle+" "+salary);

    }
}
