package net.ukr.dreamsicle.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {

    public static void main(String[] args) {
        System.out.println(getMonthDate());
        System.out.println(getYearDate());
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
}
