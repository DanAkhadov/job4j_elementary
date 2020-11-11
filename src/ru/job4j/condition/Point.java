package ru.job4j.condition;
import java.lang.Math;
public class Point {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double firstResult = Point.distance(-1, -1, 1, 1);
        double secondResult = Point.distance(-2, -1, 3, 25);
        System.out.println("result (0, 0) to (2, 0): " + result);
        System.out.println("result (-1, -1) to (1, 1): " + firstResult);
        System.out.println("result (-2, -1) to (3, 25): " + secondResult);

    }
}
