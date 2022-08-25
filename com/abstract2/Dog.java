package com.abstract2;

public class Dog extends Animal {
     public Dog(String _name,int _age){
        super(_name,_age);
    }


    public void eat() {
        System.out.println("mutton");
    }


    public void Colour(){
        System.out.println( "block");
    }
}