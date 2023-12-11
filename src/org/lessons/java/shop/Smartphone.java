package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product {
    // ATTRIBUTI
    private int codeImei;
    private int memory;

    // COSTRUTTORI

    public Smartphone(int code, String name, String description, BigDecimal price, BigDecimal vat, int memory) throws IllegalArgumentException {
        super(code, name, description, price, vat);
        validateMemory(memory);
        this.codeImei = generateCode();
        this.memory = memory;
    }


    // GETTER E SETTER


    public int getCodeImei() {
        return codeImei;
    }

    public void setCodeImei(int codeImei) {
        this.codeImei = codeImei;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }


    // METODI
    // METODO CHE GENERA UN NUMERO RANDOM DA ASSEGNARE AL CODICE
    private int generateCode() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(0, 10000);
    }

    private void validateMemory(int memory){
        if (memory<=0){
            throw new IllegalArgumentException("memory negative or zero");
        }

    }

    @Override
    public String toString() {
        return super.toString() + "Smartphone" + "IMEI='" + codeImei + '\'' + ", memorySize=" + memory;
    }



}




