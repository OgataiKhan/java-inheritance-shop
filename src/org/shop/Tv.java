package org.shop;

public class Tv extends Product{

    // ATTRIBUTES

    private int size;
    private boolean smart;

    // CONSTRUCTORS

    public Tv(String name, String description, String price, String vat, int size, boolean smart) {
        super(name, description, price, vat);

        this.size = size;
        this.smart = smart;
    }

    // METHODS

    // Getters and Setters

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    // To String

    @Override
    public String toString() {
        return "Smartphone{" +
                "code=" + getCode() +
                ", size=" + size +
                ", smart='" + smart + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}
