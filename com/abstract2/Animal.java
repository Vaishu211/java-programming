package com.abstract2;

 abstract class Animal {
    String name;
    int wait;
    Animal(String _name,int _wait){
        name=_name;
        wait=_wait;
    }
    public abstract void eat();
    public abstract void Colour();
    public void age(){
        System.out.println(23);
    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;
    }
    public int getWait(){
        return wait;
    }
    public void setWait(int wait){
        this.wait =wait;
    }

}
