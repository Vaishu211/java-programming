import java.util.*;
class Hashmap01{
    public static void main(String[] args) {
        HashMap<String,String> Fruits=new HashMap<>();
        Fruits.put("Apple","red");
        Fruits.put("Banana","yellow");
        Fruits.put("grapes","block");
        Fruits.put("dragonFruit","bing");
        System.out.println(Fruits);
        System.out.println(Fruits.get("grapes"));
        for(String i:Fruits.keySet())
        System.out.println(i);

    }
}