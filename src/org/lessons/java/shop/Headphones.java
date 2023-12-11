package org.lessons.java.shop;

import java.math.BigDecimal;

public class Headphones extends Product {
    // ATTRIBUTI
     private String color;
     private Boolean wired;

    // COSTRUTTORI

    public Headphones(int code, String name, String description, BigDecimal price, BigDecimal vat, String color, Boolean wired) throws IllegalArgumentException {
        super(code, name, description, price, vat);
        validateColor(color);
        this.color = color;
        this.wired = wired;
    }


    // GETTER E SETTER

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getWireless() {
        return wired;
    }

    public void setWireless(Boolean wireless) {
        this.wired = wireless;
    }


    // METODI
    private void validateColor(String color){
        if (color.isBlank()){
            throw new IllegalArgumentException("you didn't type a color");
        }

    }

    @Override
    public String toString() {
        return super.toString() + "Headphones" + "color='" + color + '\'' + ", areWired=" + wired;
    }
}

