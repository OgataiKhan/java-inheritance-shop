package org.shop;

import java.math.BigDecimal;

public class Smartphone extends Product{

    // ATTRIBUTES

    private String imei;
    private int storage;

    // CONSTRUCTORS

    public Smartphone(String name, String description, String price, String vat, String imei, int storage) {
        super(name, description, price, vat);

        this.imei = imei;
        this.storage = storage;
    }

    // METHODS

    // Getters and Setters

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    // To String

    @Override
    public String toString() {
        return "Smartphone{" +
                "code=" + getCode() +
                ", imei=" + imei +
                ", storage='" + storage + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", base price=" + price +
                ", vat=" + vat +
                '}';
    }

    // Other methods

    @Override
    public BigDecimal getDiscountedPrice(){
        if(storage < 32){
            return getFullPrice().multiply(new BigDecimal("0.95"));
        }
        return getFullPrice().multiply(new BigDecimal("0.98"));
    }
}
