import java.util.ArrayList;
import java.util.Iterator;
class Iterator2{
    public static void main(String[] args){
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(45);
        numbers.add(5);
        Iterator<Integer> nu =numbers.iterator();
        while (nu.hasNext()){
            Integer i= nu.next();
            if(i<10){
                nu.remove();
            }
        }
        System.out.println(numbers);
    }
}