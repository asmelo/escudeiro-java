package com.db1.plataforma.questao5;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class JavaDateExample {

    public static void main(String args[]) {
        LocalDate conferenceDay = LocalDate.of(2020, 9, 20);
        LocalTime dailyAlarmTime = LocalTime.of(5, 30, 0);
        LocalDateTime nextMeetingDate = LocalDateTime.of(2020, Month.SEPTEMBER, 25, 8, 30, 0);
        MonthDay bithday = MonthDay.of(6, 27);
        YearMonth nextVacation = YearMonth.of(2020, 11);
        Period winterPeriod = Period.between(LocalDate.parse("2020-06-20"), LocalDate.parse("2020-09-22"));

        System.out.println("A conferência será no dia " + conferenceDay);
        System.out.println("O horário do meu alarme é " + dailyAlarmTime);
        System.out.println("A próxima reunião será " + nextMeetingDate);
        System.out.println("Meu aniversário é em " + bithday);
        System.out.println("Minhas próximas férias serão em " + nextVacation);
        System.out.println("O inverno possui " + winterPeriod.get(ChronoUnit.DAYS) + " dias");

        LocalDate initialDate = LocalDate.parse("2007-05-10");
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        int five = Period.between(initialDate, finalDate).getDays();
        long fiveLong = ChronoUnit.DAYS.between(initialDate, finalDate);

    }

}
