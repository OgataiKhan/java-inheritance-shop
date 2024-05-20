package org.shop;

public class Smartphone extends Product{

    // ATTRIBUTES

    private int imei;
    private String storage;

    // CONSTRUCTORS

    public Smartphone(String name, String description, String price, String vat, int imei, String storage) {
        super(name, description, price, vat);

        this.imei = imei;
        this.storage = storage;
    }

    // METHODS

    // Getters and Setters

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }
}
