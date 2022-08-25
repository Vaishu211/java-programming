
import java.util.*;
class Arraylist04{
    public static void main(String[] args) {
        ArrayList<Character> Grade= new ArrayList<>();
        Grade.add('B');
        Grade.add('E');
        Grade.add('A');
        Grade.add('C');
        System.out.println(Grade.get(3));
        System.out.println(Grade.size());
        Grade.clear();
        System.out.println(Grade);

    }
}