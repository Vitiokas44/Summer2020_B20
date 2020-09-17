package day23_Array;

import java.util.Scanner;
/*  2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculats the total price
            and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outter loop need to be an infinite loop
*/
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){

            System.out.println("Enter two numbers");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            System.out.println("Enter the math operator");
            char o = input.next().charAt(0);

            /*
            double result = (o == '+')? num1+num2 :( o == '-')? num1-num2 :(o =='*')? num1 * num2
                          :( o == '/')? num1/num2  :(o=='%')? num1%num2 : 0;
                          System.out.println(result);
            */

            switch(o){

                case '+':
                    System.out.println(num1+num2);
                    break;

                case '-':
                    System.out.println(num1-num2);
                    break;

                case '*':
                    System.out.println(num1*num2);
                    break;

                case '/':
                    System.out.println(num1/num2);
                    break;

                case '%':
                    System.out.println(num1%num2);
                    break;

                default:
                    System.out.println("Invalid Operator");
            }



            System.out.println("Do you want to continue?");
            String a = input.next().toLowerCase();  // yes

            while(  ! (a.equals("yes") || a.equals("no")) ){ // while the answer is invalid
                System.out.println("Invalid Answer, please enter yes or no");
                System.out.println("Do you want to continue?");
                a = input.next().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }

        }


        System.out.println("Thanks for using Cybertek' Calculator");

        System.exit(0);


    }

}