package com.Overridings3;

public class Fruites {
    String colour;
    int Rs;
    String taste;
    Fruites(String _colour, int _Rs, String _taste){
        colour=_colour;
        Rs = _Rs;
        taste = _taste;

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getRs() {
        return Rs;
    }

    public void setRs(int rs) {
        Rs = rs;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
public void Tasteis(){
    System.out.println(taste);
}

}
