package day14Scanner;

import java.util.Scanner;

public class phone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your area code:");
        int areaCode = scan.nextInt();
        System.out.println("Write your local Number:");
        int localNumber = scan.nextInt();
       // System.out.println("phone Number is :" + areaCode+" "+localNumber);
       // String phoneNumber = (areaCode+"-"+localNumber);
        System.out.println("Calling number ("+areaCode+")-"+localNumber);

    }
}
