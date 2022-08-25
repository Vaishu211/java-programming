import java.util.ArrayList;
class Arraylist2{
    public static void main(String[] args){
        ArrayList<String> animals=new ArrayList<>();
        animals.add("dog");
        animals. add("lion");
        animals. add("cat");
        System.out.println("listoutanimlas:" +animals);
        System.out.println(animals.get(1));
        System.out.println(animals.remove(2));
        animals.set(2,"tiger");
        System.out.println(animals);
        System.out.println(animals.contains("tiger"));
    }

}