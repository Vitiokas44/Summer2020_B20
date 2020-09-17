package day33_localDateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class hourTrenirovca {
    public static void main(String[] args) {
       // LocalTime now=LocalTime.now();

       DateTimeFormatter DTfORMAT=DateTimeFormatter.ofPattern("MMM/dd/yyyy, EEEE");
        LocalDate LoDate=LocalDate.of(2019,05,20);
        LocalTime localT=LocalTime.of(4,30);
        DateTimeFormatter dateFormat2= DateTimeFormatter.ofPattern("hh:mm:ss a");
       // System.out.println(LoDate.format(dateFormat));
        System.out.println(LoDate.format(dateFormat2));
    }
}
