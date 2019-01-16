package com.pratice;

public class MeatLoversBurgers extends originalBurger {

    private double total = 0;

    public MeatLoversBurgers(double totalPrice, String breadRollType, String meat, int lettuce, int tomatoes, int pickles, int bacon, int cheese, int orderNumber, int extraToppingsAmount, double extraToppings, double burgerBasePrice, double price) {
        super(totalPrice, breadRollType, meat, lettuce, tomatoes, pickles, bacon, cheese, orderNumber, extraToppingsAmount, extraToppings, burgerBasePrice, price);
    }
    @Override
    public void burgerComesWith() {
        System.out.println("The Meat Lovers Burger comes on bacon glazed bread, 2 lbs of bacon!!!");
    }
    @Override
    public void orderTotal(double totalPrice) {
        super.orderTotal(total);
    }
    @Override
    public double amountOfToppings() {

        System.out.println("How many toppings would you like?");
        setExtraToppingsAmount(scanner.nextInt());
        System.out.println("You ordered " + super.getExtraToppingsAmount() + " toppings.");
        if(getExtraToppingsAmount() > 4){
            total = super.getBurgerBasePrice() + ((super.getExtraToppingsAmount() - 4) * .50);
            return total;
        }
        return total = super.getBurgerBasePrice();
    }
}

