import java.util.*;
import com.Arraylist.Fruits;
class Arraylist5 {
    public static void main(String[] args) {
        Fruits f1 = new Fruits();
        f1.setName("Apple");
        f1.setColour("red");
        f1.setPrice_of_kg(200);
        Fruits f2 = new Fruits();
        f2.setName("Orange");
        f2.setColour("orange");
        f2.setPrice_of_kg(100);
        Fruits f3= new Fruits();
        f3.setName("grapes");
        f3.setColour("block");
        f3.setPrice_of_kg(300);
        ArrayList<Fruits> ff = new ArrayList<Fruits>();
        ff.add(f1);
        ff.add(f2);
        ff.add(f3);
        for (Fruits i : ff) {
            System.out.println("name:" + i.getName());
            System.out.println("colour:" + i.getColour());
            System.out.println("price_of_kg:" + i.getPrice_of_kg());


        }

    }
}