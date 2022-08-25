package com.inheritence6;

public class Building {
    int flours;
    String paintColour;
    int totalLifts;
    String name;
    public Building(int _flours, String _paintColour, int _totallifts, String _name){
        flours = _flours;
        paintColour =_paintColour;
        totalLifts = _totallifts;
        name = _name;
    }


    public int getFlours() {
        return flours;
    }

    public void setFlours(int flours) {
        this.flours = flours;
    }

    public String getPaintColour() {
        return paintColour;
    }

    public void setPaintColour(String paintColour) {
        this.paintColour = paintColour;
    }

    public int getTotalLifts() {
        return totalLifts;
    }

    public void setTotalLifts(int totalLifts) {
        this.totalLifts = totalLifts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    }



