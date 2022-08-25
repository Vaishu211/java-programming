package com.School;

public class Vechile {
    String name;
    String colour;
    int noOfstudents;
    int noOfSheets;
    String incharge;

    public Vechile(String _name, String _colour, int _noOfstudents, int _noOfSheets, String _incharge) {
        name = _name;
        colour = _colour;
        noOfstudents = _noOfstudents;
        noOfSheets = _noOfSheets;
        incharge = _incharge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNoOfstudents() {
        return noOfstudents;
    }

    public void setNoOfstudents(int noOfstudents) {
        this.noOfstudents = noOfstudents;
    }

    public int getNoOfSheets() {
        return noOfSheets;
    }

    public void setNoOfSheets(int noOfSheets) {
        this.noOfSheets = noOfSheets;
    }

    public String getIncharge() {
        return incharge;
    }

    public void setIncharge(String incharge) {
        this.incharge = incharge;
    }
}