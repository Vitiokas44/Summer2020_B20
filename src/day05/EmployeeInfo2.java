package day05;

public class EmployeeInfo2 {
    public static void main(String[] args) {
        String firstName = "Victor";
        String lastName = "Russ";
        String gender = "Male";
        int age = 30;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120000.50;
        String fullName = firstName+ " "+lastName;

        System.out.println("Employee full name is: " +fullName);
        System.out.println(fullName+" "+"gender is: "+" "+gender);
        System.out.println(fullName+" "+"age is:"+" "+companyName);
        System.out.println(fullName+" "+"jobTitle is:"+" "+jobTitle);
        System.out.println(fullName+" "+ "salary is:"+""+salary);

        System.out.println(fullName+" "+"is full time Employee:"+" "+isFullTime);
        System.out.println(fullName+" "+"is married:"+" "+isMarried);

    }





}
