package history;
import java.util.Scanner;
public class History {
    public static int quantity = 0;
    public static int waterBasic = 400;
    public static int milkBasic = 540;
    public static int beansBasic = 120;
    public static int cups = 9;
    public static int money = 550;
    public static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String yourChoiceForFunction = myScanner.next();
            choice(yourChoiceForFunction);
        }
    }

    public static void showTheInformation() {
        System.out.println();
        System.out.printf("The coffee machine has:\n");
        System.out.printf("%d of water\n",waterBasic);
        System.out.printf("%d of milk\n", milkBasic);
        System.out.printf("%d of coffee beans\n", beansBasic);
        System.out.printf("%d of disposable cups\n", cups);
        System.out.printf("$%d of money", money);
        System.out.println();
        System.out.println();
    }

    public static void choice(String yourChoice) {
        switch (yourChoice) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "exit":
                System.exit(0);
                break;
            case "remaining":
                showTheInformation();
                break;
            default:
                break;
        }
    }

    public static void buy() {
        System.out.println();
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String yourChoice = myScanner.next();
        switch (yourChoice) {
            case "1":

                if (waterBasic >= 250 && beansBasic >= 16 && cups >= 1) {
                    waterBasic -= 250;
                    beansBasic -= 16;
                    money += 4;
                    cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                } else if (waterBasic < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (beansBasic < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups");
                }
                break;
            case "2":

                if (waterBasic >= 350 && beansBasic >= 20 && cups >= 1 && milkBasic >= 75) {
                    waterBasic -= 350;
                    milkBasic -= 75;
                    beansBasic -= 20;
                    money += 7  ;
                    cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                } else if (waterBasic < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (beansBasic < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups");
                } else if (milkBasic < 75) {
                    System.out.println("Sorry, not enough milk");
                }
                break;
            case "3":

                if (waterBasic >= 200 && beansBasic >= 12 && cups >= 1 && milkBasic >= 100) {
                    waterBasic -= 200;
                    milkBasic -= 100;
                    beansBasic -= 12;
                    money += 6;
                    cups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                } else if (waterBasic < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (beansBasic < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups");
                } else if (milkBasic < 100) {
                    System.out.println("Sorry, not enough milk");
                }
            case "back":
                while (true) {
                    System.out.println("Write action (buy, fill, take, remaining, exit): ");
                    String yourChoiceForFunction = myScanner.next();
                    choice(yourChoiceForFunction);
                }
            default:
                break;
        }
    }
    public static void fill() {
        System.out.println("Write how many ml of water do you want to add: ");
        int addWater = myScanner.nextInt();
        waterBasic += addWater;
        System.out.println("Write how many ml of milk do you want to add: ");
        int addMilk = myScanner.nextInt();
        milkBasic += addMilk;
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int addBeans = myScanner.nextInt();
        beansBasic += addBeans;
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int addCups = myScanner.nextInt();
        cups += addCups;
    }

    public static void take(){
        System.out.printf("I gave you $%d", money);
        System.out.println();
        money = 0;
    }
}
