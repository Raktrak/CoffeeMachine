package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int cups = 9;
    public static int money = 550;

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        menu();
    }

    public static void machinePrint() {
        String coffeeMachine = """
                                
                The coffee machine has:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                %d disposable cups
                $%d of money"""
                .formatted(water, milk, beans, cups, money);
        System.out.println(coffeeMachine);
    }

    public static void menu() {
        boolean exit = true;
        while (exit) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            String option = scanner.next();
            switch (option) {
                case "buy" -> buy();
                case "fill" -> fill();
                case "take" -> take();
                case "remaining" -> machinePrint();
                case "exit" -> exit = false;
            }
        }
    }

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back:");
        String option = scanner.next();
        switch (option) {
            case "1" -> espresso();
            case "2" -> latte();
            case "3" -> cappuccino();
            case "back" -> {
            }
        }
    }

    public static void fill() {
        System.out.println("\nWrite how many ml of water you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add");
        cups += scanner.nextInt();

    }

    public static void take() {
        System.out.printf("\nI give you $%d\n", money);
        money -= money;
    }

    public static void espresso() {
        if (water >= 250 && beans >= 16 && cups >= 1) {
            water -= 250;
            beans -= 16;
            cups -= 1;
            money += 4;
        } else {
            if (water < 250) {
                System.out.println("Sorry, not enough water!");
            }
            if (beans < 16) {
                System.out.println("Sorry ,not enough beans!");
            }
            if (cups < 1) {
                System.out.println("Sorry, not enough cups!");
            }
        }
    }

    public static void latte() {
        if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
            water -= 350;
            milk -= 75;
            beans -= 20;
            cups -= 1;
            money += 7;
        } else {
            if (water < 350) {
                System.out.println("Sorry, not enough water!");
            }
            if (milk < 75) {
                System.out.println("Sorry, not enough milk");
            }
            if (beans < 20) {
                System.out.println("Sorry ,not enough beans!");
            }
            if (cups < 1) {
                System.out.println("Sorry, not enough cups!");
            }
        }
    }

    public static void cappuccino() {
        if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
            water -= 200;
            milk -= 100;
            beans -= 12;
            cups -= 1;
            money += 6;
        } else {
            if (water < 200) {
                System.out.println("Sorry, not enough water!");
            }
            if (milk < 100) {
                System.out.println("Sorry, not enough milk");
            }
            if (beans < 12) {
                System.out.println("Sorry ,not enough beans!");
            }
            if (cups < 1) {
                System.out.println("Sorry, not enough cups!");
            }
        }
    }
}






