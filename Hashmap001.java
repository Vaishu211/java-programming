import java.util.HashMap;
import com.Arraylist.Fruits;
class Hashmap001{
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setName("Lion");
        a1.setFood("nonveg");
        a1.setNo_of_legs(4);
        Animal a2= new Animal();
        a2.setName("deer");
        a2.setFood("veg");
        a2.setNo_of_legs(4);
        Animal a3=new Animal();
        a3.setName("Tiger");
        a3.setFood("nonveg");
        a3.setNo_of_legs(4);
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
        HashMap<Animal,Fruits>ob=new HashMap<>();
        ob.put(a1,f1);
        ob.put(a2,f2);
        ob.put(a3,f2);
        for(Animal i: ob.keySet()){
            System.out.println("name:"+ i .getName());
            System.out.println("Food" + i.getFood());
            System.out.println("no_of_legs"+ i.getNo_of_legs());
        }
        for(Fruits i: ob.values()){
            System.out.println("name:" + i.getName());
            System.out.println("colour: "+ i.getColour());
            System.out.println("price:"+ i.getPrice_of_kg());
        }



    }
}
class Animal{
    String name;
    int no_of_legs;
    String food;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo_of_legs() {
        return no_of_legs;
    }

    public void setNo_of_legs(int no_of_legs) {
        this.no_of_legs = no_of_legs;
    }

    public String getFood()
    {
        return food;
    }

    public void setFood(String food)
    {
        this.food = food;
    }
}
