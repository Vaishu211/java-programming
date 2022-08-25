package com.Groups;

public class Fruites extends Fruitesabs implements Fruitesinter{
    String Name;
    int price;
    Fruites(String _name, int _price){
        Name = _name;
        price = _price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    @Override
    public void Hello() {
        System.out.println("hii");
    }

    @Override
    public void like() {
        System.out.println("likeit");
    }

    @Override
    public void shop() {
        System.out.println("ond");
    }
}
