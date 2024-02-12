package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        // Write code to output the current date and time.
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime nowZone = ZonedDateTime.now();
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy HH.mm.ss a");
        String formattedNow = now.format(formatter);

        System.out.println(now);
        System.out.println(formattedNow);
//        System.out.println(nowZone);
//        System.out.println(today);
        System.out.println();

        // Add a timespan of 2 weeks to the current date and output the new date.
        LocalDateTime in2Weeks = now.plusWeeks(2);
        System.out.println(in2Weeks.format(formatter));
        System.out.println();

        // Compare the current date with a specified future date and output whether the current date is before or after the specified date.
        LocalDate a = LocalDate.of(1991, 10, 1);
        LocalDate b = LocalDate.of(1994, 4, 10);
        LocalDate c = LocalDate.of(2020, 4, 19);
//        a.isBefore(b) == true
//        a.isBefore(a) == false
//        b.isBefore(a) == false

        System.out.println(a.isBefore(b));
        System.out.println(a.isAfter(b));
        System.out.println();

        // Calculate the difference in days between two arbitrary dates and output the result.
        System.out.println(today.compareTo(c)); // Kann nur Tage berechnen
        long daysBetween = ChronoUnit.DAYS.between(a, b);
        long daysBetweenDate = ChronoUnit.DAYS.between(b, c);
        System.out.println("Differenz Geburt: " + daysBetween);
        System.out.println("Differenz 1. Treffen: " + daysBetweenDate);

        // Berechnung der Jahre, Monate und Tage zwischen zwei Daten
        Period period = Period.between(b, c);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Wartezeit: " + years + " Jahre, " + months + " Monate, " + days + " Tage");


    }
}