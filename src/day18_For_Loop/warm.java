package day18_For_Loop;

import java.util.Scanner;

public class warm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 =word2.substring(1);
        System.out.println(word1.concat(word3));
    }
}
