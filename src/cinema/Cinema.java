package cinema;
import java.util.Scanner;
public class Cinema {
    public static Scanner myScanner = new Scanner(System.in);
    public static int numberOfRows;
    public static int numberOfSeats;
    public static char[][] myArray;
    public static char[][] myArray1;
    public static int quantity = 0;
    public static boolean save = true;
    public static int rowNumber;
    public static int seatNumber;
    public static int sales = 0;
    public static void main(String[] args) {
        start();
        myArray = new char[numberOfRows + 1][numberOfSeats + 1];
        myArray1 = new char[numberOfRows + 1][numberOfSeats + 1];
        while (true) {
            menu();
            yourChoice(myScanner.nextInt());
        }
    }

    public static void yourChoice(int number) {
        switch (number) {
            case 1:
                if (save) {
                    showTheSeats();
                    save = false;
                } else {
                    showTheSeat2();
                }
                break;
            case 2:
                buyTicket();
                break;
            case 3:
                statistics();
                break;
            case 0:
                System.exit(0);
            default:
                break;
        }
    }


    public static void menu() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }

    public static void showTheSeats() {
        System.out.println();
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= numberOfSeats; ++i) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= numberOfRows; ++i) {
            System.out.print(i);
            for (int j = 1; j <= numberOfSeats; ++j) {
                if (myArray1[i][j] != 'B') {
                    myArray[i][j] = 'S';
                }
                System.out.print(" " + myArray[i][j]);
            } System.out.println();
        }
        System.out.println();


    }

    public static void showTheSeat2() {
        System.out.println();
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= numberOfSeats; ++i) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= numberOfRows; ++i) {
            System.out.print(i);
            for (int j = 1; j <= numberOfSeats; ++j) {
                //myArray[rowNumber][seatNumber] = 'B';
                System.out.print(" " + myArray[i][j]);
            } System.out.println();
        }
        System.out.println();


    }

    public static void buyTicket() {
        while (true) {
            System.out.println();
            System.out.println("Enter a row number:");
            rowNumber = myScanner.nextInt();

            System.out.println("Enter a seat number in that row:");
            seatNumber = myScanner.nextInt();
            if (rowNumber >= myArray.length || seatNumber >= myArray.length) {
                System.out.println("Wrong input!");
            } else if (myArray[rowNumber][seatNumber] == 'B'){
                System.out.println("That ticket has already been purchased!");
            } else if (myArray[rowNumber][seatNumber] != 'B') {
                myArray[rowNumber][seatNumber] = 'B';
                myArray1[rowNumber][seatNumber] = 'B';
                break;
            }
        }
        System.out.print("Ticket price: ");
        if (numberOfRows * numberOfSeats <= 60) {
            System.out.println("$" + 10);
            sales += 10;
        } else {
            if (rowNumber <= numberOfRows / 2) {
                System.out.println("$" + 10);
                sales += 10;
            } else {
                System.out.println("$" + 8);
                sales += 8;
            }
        }
        System.out.println();
        quantity++;
    }

    public static void start(){
        System.out.println("Enter the number of rows:");
        numberOfRows = myScanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        numberOfSeats = myScanner.nextInt();

        System.out.println();
    }
    public static double formulaOfPercentage() {
        return ((double)quantity / (numberOfSeats * numberOfRows) * 100);
    }
    public static void statistics() {
        System.out.println();
        System.out.printf("Number of purchased tickets: %d", quantity);
        System.out.println();
        System.out.printf("Percentage:% .2f%%", formulaOfPercentage());
        System.out.println();
        System.out.printf("Current income: $%d", sales);
        System.out.println();
        income();
        System.out.println();
    }
    public static void income() {
        if (numberOfRows * numberOfSeats <= 60) {
            System.out.print("Total income: ");
            System.out.println("$" + numberOfRows * numberOfSeats * 10);
        } else {
            if (numberOfRows % 2 != 0) {
                int number = numberOfRows / 2;
                int number1 = numberOfRows / 2 + 1;
                int result = number * numberOfSeats * 10 + number1 * numberOfSeats * 8;
                System.out.print("Total income: ");
                System.out.println("$" + result);
            } else {
                int number = numberOfRows / 2;
                int result = number * numberOfSeats * 18;
                System.out.print("Total income: ");
                System.out.println("$" + result);
            }
        }
    }
}


