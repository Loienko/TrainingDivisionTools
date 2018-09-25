package net.ukr.dreamsicle.logger;

import net.ukr.dreamsicle.date.TimeRightNow;
import net.ukr.dreamsicle.read_write_copy_file.WriteFile;

import java.util.Arrays;

public class Logger {

    public synchronized static void log(Exception message, String string) {
        TimeRightNow timeRightNow = new TimeRightNow();
        String date = timeRightNow.getDate();
        System.out.println("Exception!!!");

        StackTraceElement[] trace = message.getStackTrace();
        String s = "->\t" + string + "\t -- \t" + date + "\t---\t" + Arrays.toString(trace);
        new WriteFile("C:\\Training_division_tools\\Log\\logger.txt", s);
    }
}



