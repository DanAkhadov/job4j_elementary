package com.max;
import  java.util.Scanner;
public class Car {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int yourNumber = myScanner.nextInt();
        int i = 0;
        int j = 0;
        boolean myBool = true;
        while (true) {
            int temp = myScanner.nextInt();

            // Для окончания работы программыж
            if (temp == 0) {
                break;
            }

            // Последовательность от меньшего к большему
            if (yourNumber <= temp && j != 1) {
                yourNumber = temp;
                i = 1;
            } else if (j != 1 && i == 1) {
                myBool = false;
            }

            // Последовательность от большего к меньшему
            if (yourNumber >= temp && i != 1) {
                yourNumber = temp;
                j = 1;
            } else if (i != 1 && j == 1) {
                myBool = false;
            }
        }
        System.out.println(myBool);
    }
}
