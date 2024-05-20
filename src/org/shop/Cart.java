package org.shop;

public class Cart {
    public static void main(String[] args) {

        Product hurdyGurdy = new Product("Hurdy Gurdy", "This is a musical instrument", "499.99", "0.22");
        Product gatto = new Product("Cat", "This is a Cat", "7", "0.22");
        Product cane = new Product("Dog", "This is a Dog", "8", "0.22");

        System.out.println(hurdyGurdy);
        System.out.println(gatto);
        System.out.println(cane);
    }
}
