package com.java.java8.DateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeApiExample1 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        //get day , month, year
        System.out.println(date.getDayOfMonth() +"-"+date.getMonthValue()+"-"+date.getYear());

        //get hr, min, sec
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        System.out.println();

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println();

        LocalDateTime futureDateTime = LocalDateTime.of(2021, Month.DECEMBER, 20, 9, 30, 22);
        System.out.println(futureDateTime);

    }
}
