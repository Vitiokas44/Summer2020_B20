package day16String_methods;

import java.util.Scanner;

public class characterString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = scan.next();
        int length = word.length();
        if(length== 0){
            System.out.println("string is empty");

        }else if( length> 3){
            System.out.println(word.substring(4));
        }else{
            System.out.println(word);
        }

    }
}
