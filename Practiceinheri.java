import com.inheritence.Apple;
import com.inheritence.Orange;
import java.util.*;
class Practiceinheri{
    public static void main(String[] args) {
        Apple apple =new Apple("red",200,2);
        Orange  orange = new Orange("orangecolour",250,3);
        orange.setColour("yellow");
        System.out.println(orange.getColour());
        System.out.println(apple.getColour());
    }
}