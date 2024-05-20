package org.shop;

import java.math.BigDecimal;

public class Product {

    // ATTRIBUTES

    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;

    static int counter;

    // CONSTRUCTORS

    public Product(String name, String description, String price, String vat) {
        counter++;

        this.code = counter;
        this.name = name;
        this.description = description;
        this.price = new BigDecimal(price);
        this.vat = new BigDecimal(vat);
    }

    // METHODS

    // Getters and Setters
    public String getCode() {
        return String.format("%06d", code);
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return getCode() + "-" + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getVatPrice() {
        return price.multiply(vat).add(price);
    }

    public void setPrice(String price) {
        this.price = new BigDecimal(price);
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = new BigDecimal(vat);
    }

    // To String
    @Override
    public String toString() {
        return "Product{" +
                "code=" + getCode() +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                "€, vat=" + vat +
                '}';
    }
}
