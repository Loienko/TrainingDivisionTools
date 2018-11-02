package net.ukr.dreamsicle;

import javax.swing.*;

public class App {
    /**
     * Офисная программа для университета Воздушных Сил "ХНУПС"
     * Данные курсантов и их успеваемость
     *
     * @author Loienko Yurii
     * @author https://www.linkedin.com/in/yurii-loienko-78705393/
     * @version 4.0
     */
    public static void main(String[] args) {
        /**
         * Точка входа в класс и приложения
         * @param args Массив строковых аргументов
         */
        SwingUtilities.invokeLater(Window::new);
    }
}

