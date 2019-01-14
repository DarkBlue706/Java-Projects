package com.pratice;

public class Car {

     private String engine;
     private int cylinders;
     private String wheels;
     private String speed;

    public Car(String engine, int cylinders, String wheels, String speed) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.speed = speed;
    }

    public String getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getWheels() {
        return wheels;
    }

    public String getSpeed(){
        return speed;
    }

    public void startEngine(String engine){
        this.engine = engine;
        System.out.println("Car initiated with " + engine + ".");
    }

    public void accelerate(String speed){
        System.out.println("Acceleration at " + speed);
    }
    public void brake(){
        System.out.println("Initializing breaks");
    }
    public void soundOff(){
        System.out.println("Vroom");
    }
}

