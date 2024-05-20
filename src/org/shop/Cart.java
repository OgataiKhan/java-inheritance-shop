package org.shop;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        // Generate empty cart
        int cartSize;
        System.out.print("How many products would you like to add?");
        cartSize = Integer.parseInt(scanner.nextLine());
        Product[] cartContents = new Product[cartSize];

        // Add products
        String productType;
        int i = 1;

        while (i <= cartSize) {
            System.out.println("What kind of product are you adding?");
            System.out.println("Smartphone (s), TV (t), Headphones (h)");
            productType = scanner.nextLine();
            System.out.println("Please enter the necessary product details.");

            String name, description, price, vat;
            System.out.print("Product name: ");
            name = scanner.nextLine();
            System.out.print("Description: ");
            description = scanner.nextLine();
            System.out.print("Price (€): ");
            price = scanner.nextLine();
            System.out.print("VAT (decimal): ");
            vat = scanner.nextLine();

            switch (productType) {
                case "s":
                    String imei;
                    String storage;
                    System.out.print("IMEI: ");
                    imei = scanner.nextLine();
                    System.out.print("Storage: ");
                    storage = scanner.nextLine();
                    cartContents[i] = new Smartphone(name, description, price, vat, imei, storage);
                    i++;
                    break;
                case "t":
                    int size;
                    String smart;
                    System.out.print("Size (in): ");
                    size = Integer.parseInt(scanner.nextLine());
                    System.out.print("Is the TV smart? (y)/(n): ");
                    smart = scanner.nextLine();
                    boolean isSmart = smart.equalsIgnoreCase("y");
                    cartContents[i] = new Tv(name, description, price, vat, size, isSmart);
                    i++;
                    break;
                case "h":
                    String color, wireless;
                    System.out.print("Color: ");
                    color = scanner.nextLine();
                    System.out.print("Are the headphones wireless? (y)/(n): ");
                    wireless = scanner.nextLine();
                    boolean isWireless = wireless.equalsIgnoreCase("y");
                    cartContents[i] = new Headphones(name, description, price, vat, color, isWireless);
                    i++;
                    break;
                default:
                    System.out.println("Invalid input! Please try again.");

            }
        }

        // Close Scanner
        scanner.close();
    }
}
