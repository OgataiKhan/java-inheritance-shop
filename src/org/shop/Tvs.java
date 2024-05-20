package org.shop;

public class Tvs extends Product{

    // ATTRIBUTES

    private int size;
    private boolean smart;

    // CONSTRUCTORS

    public Tvs(String name, String description, String price, String vat, int size, boolean smart) {
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
}
