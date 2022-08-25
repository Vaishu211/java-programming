package com.School;

public class Building {
    String name;
    int noOfwindows;
    int noOfrooms;
    String paintColour;
    int noOfflours;
   public Building(String _name, int _noOfwindows, String _paintColour, int _noOfflours){
        name = _name;
        noOfwindows = _noOfwindows;
        paintColour = _paintColour;
        noOfflours = _noOfflours;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfwindows() {
        return noOfwindows;
    }

    public void setNoOfWindows(int noOfwindows) {
        this.noOfwindows = noOfwindows;
    }

    public int getNoOfrooms() {
        return noOfrooms;
    }

    public void setNoOfrooms(int noOfrooms) {
        this.noOfrooms = noOfrooms;
    }

    public String getPaintColour() {
        return paintColour;
    }

    public void setPaintColour(String paintColour) {
        this.paintColour = paintColour;
    }

    public int getNoOfflours() {
        return noOfflours;
    }

    public void setNoOfflours(int noOfflours) {
        this.noOfflours = noOfflours;
    }



    }
