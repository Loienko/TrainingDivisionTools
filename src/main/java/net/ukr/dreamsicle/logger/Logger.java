package net.ukr.dreamsicle.logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    //private final static java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Math.class.getName());

    private static int depth = 0;
    private static int lineNumber = 0;
    private static boolean isEnabled = false;
    private static boolean showLineNumbers = false;

    public synchronized static void log(String message) {
        if (isEnabled) {
            if (showLineNumbers) {
                String s = lineNumber++ + message;
                setWriteFile(s);
            } else {
                System.out.println(message);
            }
        }
    }

    public synchronized static void openStack() {
        if (isEnabled) {
            depth++;
        }
    }

    public synchronized static void openStack(String message) {
        if (isEnabled) {
            depth++;
            log(getTabs() + message);
        }
    }

    public synchronized static void closeStack(String message) {
        if (isEnabled) {
            log(getTabs() + message);
            depth--;
        }
    }

    public synchronized static void closeStack() {
        if (isEnabled) {
            depth--;
        }
    }

    public synchronized static void logIntoStack(String message) {
        if (isEnabled) {
            depth++;
            log(getTabs() + message);
            depth--;
        }
    }

    private static String getTabs() {
        String tabs = "";
        for (int i = 1; i <= depth; i++) {
            tabs += "\t";
        }
        return tabs;
    }

    public static void enable() {
        isEnabled = true;
    }

    public static void disable() {
        isEnabled = false;
    }

    public static void setShowLineNumbers(boolean newValue) {
        showLineNumbers = newValue;
    }

    public static void setWriteFile(String s) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C://Training_division_tools//Log//logger.txt")))) {
            writer.write(s);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



