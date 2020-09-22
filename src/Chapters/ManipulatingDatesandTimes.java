package Chapters;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Locale;

public class ManipulatingDatesandTimes {

    public static void main(String[] args){
        // Plus Days, Weeks, Months and Years
        LocalDate localdate = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(localdate);
        localdate = localdate.plusDays(2);
        System.out.println(localdate);
        localdate = localdate.plusWeeks(1);
        System.out.println(localdate);
        localdate = localdate.plusMonths(1);
        System.out.println(localdate);
        localdate = localdate.plusYears(5);
        System.out.println(localdate);

        // Minus Days, Weeks, Months and Years
        LocalDate localDate1 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime localTime1 = LocalTime.of(5, 15);
        LocalDateTime localDateTime = LocalDateTime.of(localDate1, localTime1);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusDays(1);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusHours(10);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusSeconds(30);
        System.out.println(localDateTime);

        localDateTime = localDateTime.minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(localDateTime);

        // Available Methods

        // plusYears / minusYears
        // plusMonths / minusMonths
        // plusWeeks / minusWeeks
        // plusDays / minusDays
        // plusHours / minusHours
        // plusMinutes / minusMinutes
        // plusSeconds / minusSeconds
        // plusNanos / minusNanos

        workingWithPeriods();
    }


    protected static void workingWithPeriods(){

    }
}
