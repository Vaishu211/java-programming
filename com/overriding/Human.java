package com.overriding;

public class Human {
    String name;
    int age;
    public  Human(String _name, int _age){
        name =_name;
        age = _age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



  public void StringName(){
      System.out.println(name);
  }
}


