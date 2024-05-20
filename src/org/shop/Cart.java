package org.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        // Open Scanner
        Scanner scanner = new Scanner(System.in);

        // Generate empty cart
        int cartSize;
        System.out.print("How many products would you like to add? ");
        cartSize = Integer.parseInt(scanner.nextLine());
        Product[] cartContents = new Product[cartSize];

        // Add products
        String productType;
        int i = 0;

        while (i < cartSize) {
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
                    int storage;
                    System.out.print("IMEI: ");
                    imei = scanner.nextLine();
                    System.out.print("Storage (GB): ");
                    storage = Integer.parseInt(scanner.nextLine());
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

        // Total price
        BigDecimal totalPrice = new BigDecimal(0);
        boolean hasCard = false;
        String userCardInput;
        System.out.print("Do you have a loyalty card? (y)/(n) ");
        userCardInput = scanner.nextLine();
        if (userCardInput.equals("y")){
            hasCard = true;
        }

        // Print cart
        System.out.println("****************");
        System.out.println("Here are the details you entered:");
        for (int j = 0; j < cartSize; j++) {
            System.out.println(cartContents[j]);
            if (hasCard){
                totalPrice = totalPrice.add(cartContents[j].getDiscountedPrice());
            } else {
                totalPrice = totalPrice.add(cartContents[j].getFullPrice());
            }
        }

        System.out.println("****************");
        System.out.println("The total price of your products is: " + totalPrice);


        // Close Scanner
        scanner.close();
    }
}
