package day05;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class EmployeeInfo {
    public static void main(String[]args){
        String firstName = "Victor";
        String lastName = "Russ";
        char gender = 'M';
        byte age = 30;
        String companyName = "NATCO";
        String jobTitle = "driver";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 110000.55;

        System.out.println("Employee full name is:"+firstName+" "+lastName);
        System.out.println(firstName+ " "+lastName+" "+"gender is:"+" "+gender);
        System.out.println(firstName+" "+lastName+" "+"age is:at:"+" "+companyName);
        System.out.println(firstName+" "+lastName+" "+"jobTitle is:"+" "+jobTitle);
        System.out.println(firstName+" "+lastName+" "+ "salary is:"+""+salary);

        System.out.println(firstName+" "+lastName+" "+"is full time Employee:"+" "+isFullTime);
        System.out.println(firstName+" "+lastName+" "+"is married:"+" "+isMarried);




    }
}








