package org.shop;

public class Headphones extends Product{

    // ATTRIBUTES

    private String color;
    private boolean wireless;

    // CONSTRUCTORS

    public Headphones(String name, String description, String price, String vat, String color, boolean wireless) {
        super(name, description, price, vat);

        this.color = color;
        this.wireless = wireless;
    }

    // METHODS

    // Getters and Setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
