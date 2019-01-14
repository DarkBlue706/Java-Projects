package com.pratice;

public class Mercedes extends Car {

    private String name;
    private int windows;

    public Mercedes( String name, int windows) {
        super("V6", 6, "Alloy", "200MPH");
        this.name = name;
        this.windows = windows;
    }

    public String getName() {
        return name;
    }

    public int getWindows() {
        return windows;
    }

    @Override
    public void soundOff() {
        System.out.println("VROOOOOOOOOM MERCEDES!");
    }
}
