import java.util.*;
class Arraylist003{
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();
        number.add(23);
        number.add(45);
        number.add(32);
        number.add(34);
        number.add(23);
        number.add(11);
        for(int i=0;i<number.size();i++){
            System.out.println(number.get(i));
        }
        Collections.sort(number);
        for(Integer i:number){
            System.out.println(i);
        }
    }
}