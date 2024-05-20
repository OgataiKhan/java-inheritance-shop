package org.shop;

public class Smartphone extends Product{

    // ATTRIBUTES

    private String imei;
    private String storage;

    // CONSTRUCTORS

    public Smartphone(String name, String description, String price, String vat, String imei, String storage) {
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
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}
