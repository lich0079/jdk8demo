package jdk8demo.jdk8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class NewDateDemo {
    public static void main(String[] args) {
        LocalDate  now = LocalDate.now();
        System.out.println(now);
        System.out.println("date-------");
        ZoneId.getAvailableZoneIds().stream().limit(5).forEach(x -> System.out.println(x+ ":" +LocalDate.now(ZoneId.of(x))));
        
        System.out.println("time-------");
        ZoneId.getAvailableZoneIds().stream().limit(5).forEach(x -> System.out.println(x+ ":" +LocalTime.now(ZoneId.of(x))));
        
        System.out.println("Instant------");
        Instant ins = Instant.now();
        System.out.println(ins.toEpochMilli());
        
        
        
        System.out.println("Duration------");
        Duration thirtyDay = Duration.ofDays(30);
        System.out.println(thirtyDay);
        
        
        
        LocalDate lastDayOfYear = now.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Last date of this year= "+lastDayOfYear);
        
        Period period = now.until(lastDayOfYear);
        System.out.println("Period Format= "+period);
        System.out.println("Months remaining in the year= "+period);        
        
        System.out.println(now.until(lastDayOfYear,ChronoUnit.DAYS));
    }
}
