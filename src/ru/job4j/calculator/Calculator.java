package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
        String myString = "Hi, how are you, man?";
    }
    public static void plus(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
}

