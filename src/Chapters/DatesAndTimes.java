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
        // public static LocalTime of(int hour, int minute)
        // public static LocalTime of(int hour, int minute, int second)
        // public static LocalTime of(int hour, int minute, int second, int nanos)
        LocalTime localTime1;
        instanceOfLocalTime();
        // public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
        // public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
        // public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nano)
        // public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)
        // public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
        // public static LocalDatetime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nano)
        // public static LocalDateTime of(LocalDate date, LocalTime localTime)
        LocalDateTime localDateTime;
        instanceOfLocalDateTime();

        // LocalDate d = new LocalDate(); // DOES NOT COMPILE
        // LocalDate.of(2015, Month.JANUARY, 32); // java.time.DateTimeException
    }

    protected static void instanceOfLocalDate(){
        System.out.println("------------------- instanceOfLocalDate()");
        LocalDate localDate1 = LocalDate.of(2015, Month.SEPTEMBER, 16);
        System.out.println(localDate1);
        System.out.println("localDate.getEra()");
        System.out.println(localDate1.getEra());
        System.out.println("localDate.getDayOfYear()");
        System.out.println(localDate1.getDayOfYear());
        System.out.println("localDate.toEpochDay()");
        System.out.println(localDate1.toEpochDay());
        System.out.println("localDate.getChronology()");
        System.out.println(localDate1.getChronology());
        LocalDate localDate2 = LocalDate.of(2015, 1, 20);
        System.out.println(localDate2);
    }

    protected static void instanceOfLocalTime(){
        System.out.println("------------------- instanceOfLocalTime()");
        LocalTime localTime1 = LocalTime.of(6,15);
        System.out.println(localTime1);
        LocalTime localTime2 = LocalTime.of(6, 15, 30);
        System.out.println(localTime2);
        LocalTime localTime3 = LocalTime.of(6, 15, 30, 999999999);
        System.out.println(localTime3);
        localTime3 = localTime3.plusNanos(1);
        System.out.println(localTime3);
    }

    protected static void instanceOfLocalDateTime(){
        System.out.println("------------------- instanceOfLocalDateTime()");
        System.out.println("Date Now");
        System.out.println(LocalDateTime.now());

        LocalDate localDate1 = LocalDate.of(2020, Month.SEPTEMBER, 16);
        LocalTime localTime1 = LocalTime.of(14,31, 01);

        LocalDateTime dateTime1 = LocalDateTime.of(2020, Month.SEPTEMBER, 16, 14, 31, 01);
        System.out.println(dateTime1);
        LocalDateTime dateTime2 = LocalDateTime.of(localDate1, localTime1);
        System.out.println(dateTime2);

    }

}
