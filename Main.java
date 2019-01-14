package com.pratice;

public class Main {

    


    public static void main(String[] args) {
        Honda honda = new Honda("Civic", 2);
        Car car = new Car("V6", 6 , "2", "250MPH" );
        Mercedes mercedes = new Mercedes("SLR", 2);
        mercedes.soundOff();
        honda.soundOff();
        car.soundOff();



    }
}




