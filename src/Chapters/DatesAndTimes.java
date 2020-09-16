package Chapters;

import java.time.*;

public class DatesAndTimes {

    public static void main(String[] args){

        // Contains just the date, no time or timezone
        LocalDate myLocalDate;
        // Contains just the time, no date or timezone
        LocalTime myLocalTime;
        // Contains both date and time but no timezone
        LocalDateTime myLocalDateTime;

        System.out.println(LocalDate.now()); // YYYY-MM-DD
        System.out.println(LocalTime.now()); // HH:MM:SS.NS
        System.out.println(LocalDateTime.now()); // YYYY-MM-DDTHH:MM:SS.NS

        //For timezone
        ZonedDateTime myZonedDateTime;

        // Exam questions use MM/DD/YYYY and 24 hour clock


        // public static LocalDate of(int year, int month, int dayOfMonth)
        // public static LocalDate of(int year, Month, month, int dayOfMonth)
        LocalDate localDate1;
        instanceOfLocalDate();
    }

    protected static void instanceOfLocalDate(){
        System.out.println("------------------- instanceOfLocalDate()");
        LocalDate localDate1 = LocalDate.of(2015, Month.JANUARY, 20);
        System.out.println(localDate1);
        LocalDate localDate2 = LocalDate.of(2015, 1, 20);
        System.out.println(localDate2);
    }

}
