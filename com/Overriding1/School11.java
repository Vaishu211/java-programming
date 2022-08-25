package com.Overriding1;

public class School11 {
    String Name;
    int age;
    String Class;
   public School11(String _Name,int _age,String _class){
        Name = _Name;
        age = _age;
        Class = _class;

    }
    public String  getName() {
        return Name;
    }

public void  setName(String Name){
   this.Name= Name;
   }
   public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age = age;
   }

   public String getclass(){
       return Class;
   }

    public void setclass(String Class){
       this.Class = Class;
   }
   public void printhis(){
       System.out.println(Name);

   }
   public void printin(){
       System.out.println(age);
   }

}