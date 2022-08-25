package com.School;

public class Teacher {
    String name;
    String degree;
    int salary;
    int age;
    String subject;
    Teacher(String _name,String _degree,int _salary,int _age,String _subject){
        name = _name;
        degree = _degree;
        salary = _salary;
        age = _age;
        subject = _subject;
    }
    public String getName(){
        return name;
    }
    public  void setName(String name){
        this.name = name;
    }
    public String getDegree(){
        return degree;
    }
    public void setDegree(String degree){
        this.degree = degree;

    }
    public int getSalary(){
        return salary;

    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getSubject(){
        return subject
    }
    public void setSubject(String subject){
        this.subject= subject;
    }
}
