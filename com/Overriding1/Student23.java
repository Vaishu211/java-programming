package com.Overriding1;

public class Student23 extends School11  {
   public Student23(String _Name,int _age,String _class){
        super(_Name,_age,_class);
    }
    public void printhis(){
        System.out.println("Student Name is " + Name);
    }
    public void printin(){
        System.out.println("Student Age is" + age);
    }
}
