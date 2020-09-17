package day14Scanner;

public class age {
    public static void main(String[] args) {
        int age = 8 ;
        boolean ineligible = (age>2 && age>18);
        boolean eligible =(age >=2 && age <= 18);
        String result =" ";
        if (eligible) {
            if (age == 2) {
                result ="toddler";
            }else  if( age >= 3 && age<= 5){
                result ="early childhood";
            }else if (age >=6 && age<= 7){
                result ="young reader";
            } else if(age>=8 && age<=10){
                result ="elementary";
            } else if(age == 11 && age == 12){
                result ="middle";
            } else if(age == 13){
                result ="impossible";
            }else if(age >=14 && age <=16){
                result ="high school";
            }else {
                result ="scholar";
            }
            }else{
            System.out.println(ineligible);
        }
        System.out.println("Enter age: "+age );
        System.out.println(result );

    }



    }