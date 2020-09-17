package day15_String;

import java.util.Scanner;

public class String_Trim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("    CYBERTEK   ");
        String name = scan.next();
        String name2 = name.trim();
        System.out.println(name2);// unused space will remove
    }


}
