package com.inheritence2;

public class Animal {
    String power;
    String colour;
    String food;
    String size;
    public Animal(String _power, String _colour, String _food, String _size){
        power = _power;
        colour = _colour;
        food = _food;
        size = _size;}

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    }


