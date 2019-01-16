package com.pratice;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        originalBurger burger = new originalBurger(0, "White Bread", "meat patty", 0,0,0,0,0, 0, 0, 0, 1.50, 0);
        VegetableBurger vegetableBurger = new VegetableBurger(0, "Brown Rye", "meat patty", 0,0,0,0,0, 0, 0, 0, 1.50, 0,0,0,0,0);
        MeatLoversBurgers meatLoversBurgers = new MeatLoversBurgers(0, "White Bread", "meat patty", 0,0,0,0,0, 0, 0, 0, 1.50, 0);

        System.out.println("Welcome to Bob's burgers, what would you like?");
        System.out.println("We have the Original Bob's burger, Bob's veggie burger" +
                "or the super bacony meat lovers burgers?");
        System.out.println("Press 1 for bob's burger, 2 for the veggie burger and 3 for the meat lovers burger");
        int answer = scanner.nextInt();
        boolean isTrue = true;
        while(isTrue) {
            switch (answer) {
                case 1:
                    isTrue = false;
                    burger.burgerComesWith();
                    burger.additionalToppingsAre();
                    total = burger.amountOfToppings();
                    burger.orderTotal(total);
                    break;
                case 2:
                    isTrue = false;
                    vegetableBurger.burgerComesWith();
                    vegetableBurger.additionalToppingsAre();
                    total = vegetableBurger.amountOfToppings();
                    vegetableBurger.orderTotal(total);
                    break;

                case 3:
                    isTrue = false;
                    meatLoversBurgers.burgerComesWith();
                    meatLoversBurgers.additionalToppingsAre();
                    total = meatLoversBurgers.amountOfToppings();
                    meatLoversBurgers.orderTotal(total);
                    break;
                default:
                    System.out.println("Invalid item please try again");
            }
        }


    }

}
