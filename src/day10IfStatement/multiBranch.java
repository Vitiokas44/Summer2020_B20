package day10IfStatement;

import sun.security.rsa.RSACore;

public class multiBranch {
    public static void main(String[] args) {
        int score = 98;
        String grade = "";
        if(score > 0 && score <= 10){
            grade = "you made 2";
        }else if (score >=10 && score<= 30){
            grade = "you made 3";
        }else if (score >=31 && score <= 55){
            grade = "you made 4";
        }else if (score >= 56 && score <= 100){
            grade =" yo made 6";
        }
        System.out.println(grade);


}}
