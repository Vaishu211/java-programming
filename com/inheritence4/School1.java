package com.inheritence4;

public class School1 {
    String name;
    int age;
    int  dob;
    String School;
    String place;

    public School1(String _name, int _age, int _dob, String _school, String _place) {
        name = _name;
        age = _age;
        dob = _dob;
        School = _school;
        place = _place;

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

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }



    }


