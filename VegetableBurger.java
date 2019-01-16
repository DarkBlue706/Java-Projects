package com.pratice;

public class VegetableBurger extends originalBurger {

    private int tofu;
    private int carrots;
    private int sliceBeets;
    private int vegetarianCheese;
    private double total = 0;



    public int getTofu() {
        return tofu;
    }

    public int getCarrots() {
        return carrots;
    }

    public int getSliceBeets() {
        return sliceBeets;
    }

    public int getVegetarianCheese() {
        return vegetarianCheese;
    }

    public VegetableBurger(double totalPrice, String breadRollType, String meat, int lettuce, int tomatoes, int pickles, int bacon, int cheese, int orderNumber, int extraToppingsAmount, double extraToppings, double burgerBasePrice, double price, int tofu, int carrots, int sliceBeets, int vegetarianCheese) {
        super(totalPrice, breadRollType, meat, lettuce, tomatoes, pickles, bacon, cheese, orderNumber, extraToppingsAmount, extraToppings, burgerBasePrice, price);
        this.tofu = tofu;
        this.carrots = carrots;
        this.sliceBeets = sliceBeets;
        this.vegetarianCheese = vegetarianCheese;
    }

    @Override
    public void burgerComesWith() {
        System.out.println("The Vegetable Burger comes on rye bread with 6 items at no additional charge. Any toppings after is $0.50");

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
        if(getExtraToppingsAmount() > 6){
            total = super.getBurgerBasePrice() + ((super.getExtraToppingsAmount() - 6) * .50);
            return total;
        }
        return total = super.getBurgerBasePrice();
    }

    @Override
    public void additionalToppingsAre() {
        System.out.println("The additional toppings are lettuce, tomatoes, pickles, tofu, carrots, sliced beets, or vegetarian cheese. An additional .50 per item if you go over 6 toppings.");
    }
}
