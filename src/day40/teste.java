package day40;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class teste {
    public static void main(String[] args) {
        LocalDate date= LocalDate.of(2018,1,18);
        LocalTime time = LocalTime.of(14,42);
        LocalDateTime dateTIME=LocalDateTime.of(date, time);
        DateTimeFormatter format=DateTimeFormatter.ofPattern("MM/dd/yyyy | hh:mm");

        System.out.println(dateTIME);
    }
}
