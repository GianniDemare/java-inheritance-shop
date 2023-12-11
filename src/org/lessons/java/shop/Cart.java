package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.print("Name: ");
        String nameInput = scanner.nextLine();
        System.out.print("Description: ");
        String descriptionInput = scanner.nextLine();

        BigDecimal price = null;
        while (price == null) {
            System.out.print("Price: ");
            String priceInput = scanner.nextLine();
            try {
                price = new BigDecimal(priceInput);
            } catch (Exception e) {
                System.out.println("Invalid number");
            }
        }

        BigDecimal vat = null;
        while (vat == null){
            System.out.print("Vat: ");
            String vatInput = scanner.nextLine();
            try{
                vat = new BigDecimal(vatInput);
            } catch(NumberFormatException e){
                System.out.println("Invalid number");
            }
        }*/
        ArrayList<String> cart = new ArrayList<>();

        boolean match = false;
        while (!match) {
            System.out.println("You want to add a product to your cart? y/n ");
            String product = scanner.nextLine();
            switch (product) {
                case "y":
                    System.out.println("Type of product: (Smartphone/Television/Headphones");
                    String typeOfProducts = scanner.nextLine();
                if (typeOfProducts.equals("Smartphone")) {
                    System.out.println("Enter the name of the product: ");
                    String nameSmartphone = scanner.nextLine();
                    System.out.println("Enter the product description: ");
                    String descriptionSmartphone = scanner.nextLine();
                    System.out.println("Enter the price of the product:");
                    BigDecimal priceSmartphone = scanner.nextBigDecimal();
                    System.out.println("Enter the VAT of the product:");
                    BigDecimal vatSmartphone = scanner.nextBigDecimal();
                    System.out.println("Enter the product's memory:");
                    int memorySmartphone = Integer.parseInt(scanner.next());
                    Smartphone smartphone = new Smartphone(1,nameSmartphone, descriptionSmartphone, priceSmartphone, vatSmartphone, memorySmartphone);
                    cart.add(String.valueOf(smartphone));
                    break;
                } else if (typeOfProducts.equals("Television")) {
                    System.out.println("Enter the name of the product: ");
                    String nameTelevision = scanner.nextLine();
                    System.out.println("Enter the product description: ");
                    String descriptionTelevision = scanner.nextLine();
                    System.out.println("Enter the price of the product:");
                    BigDecimal priceTelevision = scanner.nextBigDecimal();
                    System.out.println("Enter the VAT of the product:");
                    BigDecimal vatTelevision = scanner.nextBigDecimal();
                    System.out.println("Enter the dimensions of the TV in inches:");
                    int dimensionTelevison = Integer.parseInt(scanner.next());
                    System.out.println("It's a smart TV?(true/false)");
                    Boolean isSmart = scanner.nextBoolean();
                    if (isSmart == true){
                        System.out.println("It's smart");
                    }else {
                        System.out.println("It's not smart");
                    }
                    Television television = new Television(1,nameTelevision, descriptionTelevision, priceTelevision, vatTelevision, dimensionTelevison, isSmart);
                    System.out.println(television);
                    cart.add(String.valueOf(television));
                    break;
                } else if (typeOfProducts.equals("Headphones")) {
                    System.out.println("Enter the name of the product: ");
                    String nameHeadphones = scanner.nextLine();
                    System.out.println("Enter the product description: ");
                    String descriptionHeadphones = scanner.nextLine();
                    System.out.println("Enter the price of the product:");
                    BigDecimal priceHeadphones = scanner.nextBigDecimal();
                    System.out.println("Enter the VAT of the product:");
                    BigDecimal vatHeadphones = scanner.nextBigDecimal();
                    System.out.println("Enter the color of the headphones:");
                    String colorHeadphones = scanner.nextLine();
                    System.out.println("Headphones are wireless? true/false");
                    Boolean  wired = scanner.nextBoolean();
                    if (wired == true){
                        System.out.println("It's wireless");
                    }else {
                        System.out.println("It's not wireless");
                    }
                    Headphones headphones = new Headphones(1,nameHeadphones,descriptionHeadphones,priceHeadphones,vatHeadphones, "red", wired);
                    cart.add(String.valueOf(headphones));
                    break;
                }else {
                    System.out.println("Invalid answer");
                }
                    break;

                case "n":
                    System.out.println("Your product list:");
                    System.out.println(cart.toString());
                    match = true;
                    break;
            }

        }



         /*
        try {
            Product product = new Product(nameInput, descriptionInput,price, vat);
            System.out.println(product);
        } catch(NumberFormatException numberFormatException){
            System.out.println("The price or vat is not a number");
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Sorry invalid parameters: " + illegalArgumentException.getMessage());
        }

         */


        scanner.close();
    }
}
