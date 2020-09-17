package day33_localDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class times {
    public static void main(String[] args) {
       LocalTime lt= LocalTime.of(15,45,55,100);
        System.out.println(lt);
        LocalTime T2=LocalTime.now();
        System.out.println(T2);
        LocalDateTime t3=LocalDateTime.of(2020,07,25,15,30);
        System.out.println(t3);
    }
}
