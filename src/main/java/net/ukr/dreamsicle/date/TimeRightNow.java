package net.ukr.dreamsicle.date;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeRightNow {

    @Test
    public static void main(String[] args) {
        System.out.println(getMonthDate());
        System.out.println(getYearDate());
        TimeRightNow timeRightNow = new TimeRightNow();
        String date = timeRightNow.getDate();
        System.out.println(date);
    }



    public static int getMonthDate() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int month = gregorianCalendar.get(Calendar.MONTH);

        return month + 1;
    }

    public static int getYearDate() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int year = gregorianCalendar.get(Calendar.YEAR);

        return year;
    }

    public String getDate() {
        Date date = new Date();
        return date.toString();
    }
}
