package day12_Scanner_switch;

import java.util.Scanner;

public class sksksk {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens =scan.nextInt();
        int nonSeniorCitizens =scan.nextInt();
        System.out.println("What is new citizen's age?");
       int age = scan.nextInt();
       if (age>=65){
           System.out.println("Senior Citizens");
           seniorCitizens +=1;

           System.out.println(seniorCitizens);

       }if(age<65 ){
            System.out.println("nonSeniorCitizens");
            nonSeniorCitizens +=1;
            System.out.println(+nonSeniorCitizens);

        }
      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Write your area code:");
        int areaCode = scan.nextInt();
        System.out.println("Write your local Number:");
        int localNumber = scan.nextInt();
        System.out.println("phone Number is :" + areaCode+" "+localNumber);
   /*     Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();


       *//*
int sum =( num1+ num2+ num3);
int ValueOfSum = sum;
        System.out.println("Sum of Numbers:"+ValueOfSum);*/
    }
}
