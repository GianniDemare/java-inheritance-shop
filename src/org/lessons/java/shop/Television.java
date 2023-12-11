package org.lessons.java.shop;

import java.math.BigDecimal;

public class Television extends Product{
    // ATTRIBUTI
     private int dimension;
     private Boolean isSmart;

    // COSTRUTTORI

    public Television(int code, String name, String description, BigDecimal price, BigDecimal vat, int dimension, Boolean property) throws IllegalArgumentException {
        super(code, name, description, price, vat);
        validateDimension(dimension);
        this.dimension = dimension;
        this.isSmart = property;
    }


    // GETTER E SETTER

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public Boolean getProperty() {
        return isSmart;
    }

    public void setSmart(Boolean smart) {
        isSmart = smart;
    }

    // METODI
    private void validateDimension(int inches){
        if (inches<=10){
            throw new IllegalArgumentException("not enough inches for a tv, or negative inches");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Tv" + "dimension=" + dimension + ", isSmart=" + isSmart;
    }
}
