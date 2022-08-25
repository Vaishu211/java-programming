package com.overriding;

public class Child extends Human{
    public Child(String _name,int _age){
        super(_name,_age);
    }
    public void StringName(){
        System.out.println("my name is " + this.name);
    }
    public static void main(String[] args){
        Child ob1 = new Child("Anitha",29);
        ob1.StringName();
    }
}