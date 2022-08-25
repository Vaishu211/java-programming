package com.inheritence4;

public class Teacher extends School1{
    String degree;
  public   Teacher(String _name,int _age,int _dob,String _School, String _place,String _degree){
        super(_name,_age,_dob,_School,_place);
        degree = _degree;
    }
}
