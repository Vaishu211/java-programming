package com.inheritence;

public class Fruites {
    String colour;
    int  price;
    int  kg;
    Fruites(String _colour,int _price,int _kg){
        colour = _colour;
        price = _price;
        kg = _kg;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getKg() {
        return kg;
    }

    public void setKg( int kg) {
        this.kg = kg;
    }
}
