package day11_Nested_If;
/*
 Task01:
            precondition: minimum salary of 30k
                sub condition: minimum 2 years of job history
 */
public class NestedIf_Ternary {
    public static void main(String[] args) {
        double salary = 120000;
        int jobHistory = 5;

        if(salary>= 30000) {
            if (jobHistory >= 2) {

                System.out.println("you are qualified");
            }else{
                System.out.println("you must have been on job at least 2 years");
            }
        }else {
            System.out.println("you must yearn at least 30k");

        }


    }}











