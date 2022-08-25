import java.util.ArrayList;
class Arraylist3{
    public static void main(String[] args){
        ArrayList<Integer> obj= new ArrayList<>();
        obj.add(2);
        obj.add(4);
        obj.add(7);
        obj.add(89);
        System.out.println(obj);
        obj.add(8);
        System.out.println(obj);
        obj.add(2,9);
        System.out.println(obj);
        obj.remove(0);
        System.out.println(obj);
        System.out.println(obj.get(2));
        obj.set(3,67);
        System.out.println(obj);
        int b= obj.size();
        System.out.println(b);
        obj.clear();
        System.out.println(obj);
    }
}