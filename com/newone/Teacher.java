package com.newone;

 abstract class Teacher {
    String place;
     int weight;
     Teacher(String _place, int _weight){
         place=_place;
         weight =_weight;
     }

     public String getPlace() {
         return place;
     }

     public void setPlace(String place) {
         this.place = place;
     }

     public int getWeight() {
         return weight;
     }

     public void setWeight(int weight) {
         this.weight = weight;
     }




         public abstract void name();
         public abstract void degree();


}