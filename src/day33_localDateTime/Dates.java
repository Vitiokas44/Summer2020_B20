package day33_localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dates {
    public static void main(String[] args) {
        LocalDate dob=LocalDate.of(1989,8,25);
        System.out.println(dob);//1989-08-25
        LocalDate today=LocalDate.now();
        System.out.println(today);
        LocalDate lip=LocalDate.of(2019,1,3);
        boolean result =lip.isLeapYear();
        System.out.println(result);
    }
}
