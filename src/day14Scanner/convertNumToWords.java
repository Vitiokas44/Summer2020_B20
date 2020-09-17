package day14Scanner;

import java.util.Scanner;

public class convertNumToWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =scan.nextInt();
        String output ="";
        if(num >=0 && num <= 9){
         if(num ==0){
             output = "zero";
         }else if(num ==1){
             output="one";
         }else if(num == 2){
             output="two";
         }else if(num ==3){
             output= "three";
         }else if(num==4){
             output= "four";
         }else if(num==5){
             output ="five";
         }else if(num == 6){
             output = "six";
         }else if(num==7){
             output="seven";
         }else if(num ==8) {
             output = "eight";
         }else {
             output = "nine";
         }
         }else{
             output = "invalid";
            }
        System.out.println(output);



        }
    }

