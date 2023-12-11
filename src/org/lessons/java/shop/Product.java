package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    //ATTRIBUTI

    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;


    // COSTRUTTORI

    public Product(int code, String name, String description, BigDecimal price, BigDecimal vat) throws IllegalArgumentException {
        validateName(name);
        validatePrice(price);
        validateVat(vat);
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;

    }


    // GETTER E SETTER

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
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

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public BigDecimal getVat() {
        return vat;
    }

    public void setIva(BigDecimal vat) {
        this.vat = vat;
    }



    // METODI

    // metodo che calcola il prezzo con iva
    // 1) livello di accesso, 2) tipo di dato di ritorno, 3) nome del metodo 4) parametri
    public BigDecimal getFullPrice(){
        // double fullPrice = price + price*vat;
        BigDecimal vatOnPrice = price.multiply(vat);
        return price.add(vatOnPrice).setScale(2, RoundingMode.HALF_EVEN);
    }

    // metodi di validazione
    private void validateName(String name) throws IllegalArgumentException{
        if(name == null || name.isEmpty()){
            // name non è valido
            throw new IllegalArgumentException("name empty");
        }
    }

    private void validatePrice(BigDecimal price) throws IllegalArgumentException{
        if(price == null || price.compareTo(new BigDecimal(0)) < 0){
            // prezzo negativo
            throw new IllegalArgumentException("price negative " + price);
        }
    }

    private void validateVat(BigDecimal vat) throws IllegalArgumentException{
        if(vat == null || vat.compareTo(new BigDecimal(0))< 0){
            throw new IllegalArgumentException("vat negative " + vat);
        }
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", name='" + name + '\'' + ", description='" + description + '\'' + ", price=" + price + ", iva=" + vat + '}';
    }



}



