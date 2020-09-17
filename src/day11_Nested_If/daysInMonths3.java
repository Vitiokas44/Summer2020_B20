package day11_Nested_If;

public class daysInMonths3 {
    public static void main(String[] args) {
        /*
package day11_NestedIf_Switch;
/*
    2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:  28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
                Invalid:  num < 1 || num > 12
 */
        int month = 12; // 1~12
        boolean validNumber = month>=1 && month<=12;
        boolean invalid = month<1 && month >12;
        boolean days28 = month == 2;
        boolean days30 = month ==4 || month ==6 || month == 9 || month == 11;
        String result = "";
        if(days28){
         result = "28 days";
        } else if(days30){
            result = "30 days";
        }else if (invalid){
            result = "invalid";
        }else{
            result = "31 days";
        }
        System.out.println(result);

    }
}
