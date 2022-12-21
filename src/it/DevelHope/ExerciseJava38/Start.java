package it.DevelHope.ExerciseJava38;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Start {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        int dayNumberOfMonth = localDateTime.getDayOfMonth();
        Month fullMonthName = localDateTime.getMonth();
        int year = Year.now().getValue() % 100;
        int localDateTimeHour = localDateTime.getHour();
        int localDateTimeMinute = localDateTime.getMinute();


        System.out.println(" The current date and time are : " + dayNumberOfMonth + "-" + fullMonthName + "-" + year + " T" + localDateTimeHour + ":" + localDateTimeMinute);
        System.out.println("The current date and time in ISO are: " + zonedDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
    }
}
/* calculate and print:

    using LocaleDateTime, the current date and time in the following format: DayNumber FullMonthName Last2DigitsOfYearNumber HourTime MinuteTime
    using ZonedDateTime, the current date and time in ISO Zoned Date Time format
*/