package com.School;

public class Ground {
    String name;
    int length;
    int noOfplayers;
    int  wide;
    String shape;
   public Ground(String _name, int _length, int _noOfplayers, int _wide, String _shape){
        name = _name;
        length = _length;
        wide = _wide;
        noOfplayers = _noOfplayers;
        shape = _shape;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNoOfplayers() {
        return noOfplayers;
    }

    public void setNoOfplayers(int noOfplayers) {
        this.noOfplayers = noOfplayers;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }



}
