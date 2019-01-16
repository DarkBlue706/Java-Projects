package com.pratice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class originalBurger {
    private double price;
    private double totalPrice;
    private String breadRollType;
    private String meat;
    private int lettuce;
    private int tomatoes;
    private int pickles;
    private int bacon;
    private int cheese;
    private int orderNumber;
    private int extraToppingsAmount;
    private double extraToppings;
    private double burgerBasePrice;
    Scanner scanner = new Scanner(System.in);
    public DecimalFormat df = new DecimalFormat("0.00");



    public originalBurger(double totalPrice, String breadRollType, String meat, int lettuce, int tomatoes, int pickles, int bacon, int cheese, int orderNumber, int extraToppingsAmount, double extraToppings, double burgerBasePrice, double price) {
        this.totalPrice = totalPrice;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomatoes = tomatoes;
        this.pickles = pickles;
        this.bacon = bacon;
        this.cheese = cheese;
        this.orderNumber = orderNumber;
        this.extraToppingsAmount = extraToppingsAmount;
        this.extraToppings = extraToppings;
        this.burgerBasePrice = 1.50;
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
    public int getExtraToppingsAmount() {
        return extraToppingsAmount;
    }

    public double getExtraToppimgs() {
        return extraToppings;
    }

    public double getBurgerBasePrice() {
        return burgerBasePrice;
    }
    public double getPrice() {
        return price;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getTomatoes() {
        return tomatoes;
    }

    public int getPickles() {
        return pickles;
    }

    public int getBacon() {
        return bacon;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomatoes(int tomatoes) {
        this.tomatoes = tomatoes;
    }

    public void setPickles(int pickles) {
        this.pickles = pickles;
    }

    public void setBacon(int bacon) {
        this.bacon = bacon;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setExtraToppingsAmount(int extraToppingsAmount) {
        this.extraToppingsAmount = extraToppingsAmount;
    }

    public void setExtraToppings(double extraToppings) {
        this.extraToppings = extraToppings;
    }

    public void setBurgerBasePrice(double burgerBasePrice) {
        this.burgerBasePrice = burgerBasePrice;
    }

    public int getCheese() {
        return cheese;
    }

    public void burgerComesWith(){
        System.out.println("Original burger comes with patty, buns, and 4 additional toppings without additional charge.");
    }
    public void additionalToppingsAre(){
        System.out.println("The additional toppings are lettuce, tomatoes, pickles, bacon or cheese. An additional .50 per item if you go over 4 toppings.");
    }
    public double amountOfToppings(){
        System.out.println("How many toppings would you like?");
        this.extraToppingsAmount = scanner.nextInt();
        System.out.println("You ordered " + this.extraToppingsAmount + " toppings.");
        if(this.extraToppingsAmount > 4){
            this.totalPrice = burgerBasePrice + ((this.extraToppingsAmount - 4) * .50);
            return this.totalPrice;
        }
          return this.totalPrice + burgerBasePrice;
    }
    public void orderTotal(double totalPrice){
        System.out.println("The total for the order will be $" + df.format(totalPrice) + "." );
    }


}
