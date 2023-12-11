package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Trolley {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

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

        System.out.println("Type of product: (Smartphone/Television/Headphones");
        String typeOfProducts = scanner.nextLine();
        switch (typeOfProducts) {
            case "Smartphone":
                System.out.println("Name: ");
                String nameSmartphone = scanner.nextLine();
                System.out.println("Description: ");
                String descriptionSmartphone = scanner.nextLine();
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
