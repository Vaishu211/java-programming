package com.Groups;

public class garden {
    public Apple apple;
    public Orange orange;

  public  garden(Apple _apple, Orange _orange) {
        this.apple = _apple;
        this.orange = _orange;

    }

    public String getAppleName() {
        return this.apple.getName();
    }

    public String getOrangeName()
    {
        return  this.orange.getName();
    }
    public int getApplePrice(){
        return this.apple.getPrice();
    }
    public int getOrangePrice(){
        return this.orange.getPrice();
    }
    public void ubdateApple(Apple apple){
        this.apple=apple;
    }
    public void ubdateOrange(Orange orange){
        this.orange =orange;
    }
}


