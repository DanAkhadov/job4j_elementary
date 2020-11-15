package com.max;
import  java.util.Scanner;
public class Car {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int m = myScanner.nextInt();
        int[][] myArray = new int[n][m];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                myArray[i][j] = myScanner.nextInt();
            }
        }
        // int j = n - 1; 0 <= j; --j

        // int i = 0; i < m; ++i
        for (int i = 0; i < m; ++i) {
            for (int j = n - 1; 0 <= j; --j) {
                System.out.print(myArray[j][i] + " ");
            }
            System.out.println();
        }
    }
}

