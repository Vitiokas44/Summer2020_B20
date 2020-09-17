package day17_String_review;

import java.util.Scanner;

public class contain_task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        boolean  wordStartsWith  =(word.startsWith("x"));
        if(wordStartsWith){
            System.out.println(word.substring(1,word.length()));
        }else{
            System.out.println(word);
        }

    }}
