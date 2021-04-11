package ru.netology;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите год в формате \"yyyy\" (>= 1000):");

        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int year = Integer.parseInt(value);

        if (isInputValid(year)) {

            if (isYearLeap(year))
                System.out.println("Этот год - високосный. В нем 366 дней.");
            else
                System.out.println("Этот год - обычный. В нем 365 дней.");

        } else {
            System.out.println("Входные данные не соовтетствуют шаблону.");
        }

        scanner.close();
    }

    public static boolean isYearLeap(int year) {
        boolean result = false;

        if (year % 400 == 0) {
            result = true;
        } else if (year % 100 == 0) {
            result = false;
        } else if (year % 4 == 0) {
            result = true;
        }

        return result;
    }

    public static boolean isInputValid(int year) {
        return year >= 1000;
    }
}
