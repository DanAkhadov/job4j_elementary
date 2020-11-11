package ru.job4j.converter;

import java.util.Scanner;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return -1;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int dollar = Converter.rubleToDollar(140);

        // Код работает неверно
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}