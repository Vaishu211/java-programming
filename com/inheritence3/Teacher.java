package com.inheritence3;

public class Teacher {
    String name;
    String degree;
    String school;
    int age;
    public  Teacher(String _name, String _degree, String _school, int _age) {
        name = _name;
        degree = _degree;
        school = _school;
        age = _age;}

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getDegree () {
            return degree;
        }

        public void setDegree (String degree){
            this.degree = degree;
        }

        public String getSchool () {
            return school;
        }

        public void setSchool (String school){
            this.school = school;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }


    }
