package day15_String;
import java.util.Scanner;
public class stringPractice5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next(); // cybertek

        System.out.println("Enetr your last name: ");
        String lastName = input.next(); // school

        String fullName = firstName+" "+lastName; // cybertek school

        fullName = fullName.toUpperCase(); //CYBERTEK SCHOOL

        System.out.println(fullName);



    }
}
