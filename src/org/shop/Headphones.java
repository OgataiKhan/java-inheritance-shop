package org.shop;

import java.math.BigDecimal;

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

    // To String

    @Override
    public String toString() {
        return "Smartphone{" +
                "code=" + getCode() +
                ", color=" + color +
                ", wireless='" + wireless + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", base price=" + price +
                ", vat=" + vat +
                '}';
    }

    // Other methods

    @Override
    public BigDecimal getDiscountedPrice(){
        if(!wireless){
            return getFullPrice().multiply(new BigDecimal("0.93"));
        }
        return getFullPrice().multiply(new BigDecimal("0.98"));
    }
}
