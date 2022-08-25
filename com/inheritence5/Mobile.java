package com.inheritence5;

public class Mobile {
    String  model;
    int price;
    int ram;
    String colour;
    public Mobile(String _model, int _price, int _ram, String _colour){
        model=_model;
        price =_price;
        ram =_ram;
        colour =_colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    }


