package com.db1.plataforma.questao5;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class JavaDateExample {

    public static void main(String args[]) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter datetimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm");
        Locale brazilLocale = new Locale("pt", "BR");

        //Criação de objetos de datas e manipulação

        LocalDate conferenceDay = LocalDate.of(2020, 9, 20);
        LocalTime dailyAlarmTime = LocalTime.of(5, 30, 0);
        LocalDateTime nextMeetingDateTime = LocalDateTime.of(2020, Month.SEPTEMBER, 25, 8, 30, 0);
        MonthDay bithday = MonthDay.of(6, 27);
        LocalDate today = LocalDate.now();
        String todayFormatted = today.format(dateFormat);
        String yesterdayFormatted = today.plusDays(-1).format(dateFormat);
        String tomorrowFormatted = today.plusDays(1).format(dateFormat);
        LocalDate winterBegin = LocalDate.parse("2020-06-20");
        LocalDate winterEnd = LocalDate.parse("2020-09-22");
        Period winterPeriod = Period.between(winterBegin, winterEnd);

        System.out.println("A conferência será no dia " + conferenceDay.format(dateFormat));
        System.out.println("O horário do meu alarme é " + dailyAlarmTime);
        System.out.println("A próxima reunião será " + nextMeetingDateTime.format(datetimeFormat));
        System.out.println("Meu aniversário é no dia " + bithday.format(DateTimeFormatter.ofPattern("dd/MM")));
        System.out.println(String.format("Ontem foi %s, hoje são %s e amanhã será %s ",yesterdayFormatted, todayFormatted, tomorrowFormatted));
        System.out.println("O inverno dura " + winterPeriod.toTotalMonths() + " meses");
        System.out.println("O inverno dura " + ChronoUnit.DAYS.between(winterBegin, winterEnd) + " dias");


        //Extraindo partes de datas

        DayOfWeek nextMeetingWeekDay = nextMeetingDateTime.getDayOfWeek();
        YearMonth nextVacation = YearMonth.of(2020, 11);
        String nextVacationMonthName = nextVacation.getMonth().getDisplayName(TextStyle.FULL, brazilLocale);
        int conferenceDayOfMonth = conferenceDay.getDayOfMonth();
        int meetingHour = nextMeetingDateTime.getHour();
        int meetingMinutes = nextMeetingDateTime.getMinute();

        System.out.println("A próxima reunião será em uma " + nextMeetingWeekDay.getDisplayName(TextStyle.FULL, brazilLocale));
        System.out.println(String.format("\nMinhas próximas férias serão em %s de %s", nextVacationMonthName, nextVacation.getYear()));
        System.out.println("A conferência será no dia " + conferenceDayOfMonth);
        System.out.println(String.format("A reunião será às %d horas e %d minutos", meetingHour, meetingMinutes));


        //Realizando comparações entre datas

        LocalDate firstOctober = LocalDate.parse("2020-10-01");

        if (today.isBefore(firstOctober)) {
            System.out.println("\nA avaliação da banca ocorreu antes de primeiro de Outubro");
        }

        if (today.isAfter(firstOctober)) {
            System.out.println("\nA avaliação da banca ocorreu depois de primeiro de Outubro");
        }

        if (today.isEqual(firstOctober)) {
            System.out.println("\nA avaliação da banca ocorreu no dia primeiro de Outubro");
        }


        //Alterando datas

        LocalDateTime newMeetingDate = nextMeetingDateTime
                .withDayOfMonth(26)
                .withHour(9)
                .withMinute(15);
        Month nextMonth = today.plusMonths(1).getMonth();
        LocalDate sameDayNextMonth = today.withMonth(nextMonth.getValue());
        DayOfWeek sameDayNextMonthWeekDay = sameDayNextMonth.getDayOfWeek();
        String formattedWeekDay = sameDayNextMonthWeekDay.getDisplayName(TextStyle.FULL, brazilLocale);

        System.out.println("\nO novo dia da reunião será: " + newMeetingDate.format(datetimeFormat));
        System.out.println("Este mesmo dia no próximo mês será um dia de " + formattedWeekDay);


        //Conversão entre tipos de datas

        LocalDateTime conferenceDateTime = conferenceDay.atTime(8, 0);
        YearMonth conferenceYearMonth = YearMonth.from(conferenceDateTime);
        LocalDate meetingDate = LocalDate.from(nextMeetingDateTime);
        LocalTime meetingTime = LocalTime.from(nextMeetingDateTime);
        MonthDay meetingMonthDay = MonthDay.from(nextMeetingDateTime);

        System.out.println("\nA conferência começará às " + conferenceDateTime.format(timeFormat));
        System.out.println("Esta é a conferência do ano " + conferenceYearMonth.getYear());
        System.out.println("A reunião será no dia " + meetingDate.format(dateFormat));
        System.out.println("O horário da reunião será " + meetingTime.format(timeFormat));
        System.out.println("A reunião será no dia " + meetingMonthDay.getDayOfMonth());

    }

}
