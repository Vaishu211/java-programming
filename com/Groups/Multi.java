package com.Groups;

public class Multi{
    public static void main(String[] args) {
        Apple a1 = new Apple("redApple", 200);
        Orange o1 = new Orange("kamalaOrage", 250);
        System.out.println(a1.getName());
        garden in1=new garden(a1,o1);
        System.out.println(in1.getAppleName());

    }
}
