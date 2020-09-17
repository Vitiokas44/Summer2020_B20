package day12_Scanner_switch;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class userImput_Practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        double num = scan.nextDouble();
        System.out.println("Enter your number: ");
        int num3 =scan.nextInt();
        //String result = (num%2 ==0)? "Even" : "Odd";
       //System.out.println("your number is: "+ result);
        System.out.println("sum num and num3 is:"+(num+num3));
    }


}
