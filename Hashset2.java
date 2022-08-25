import java.util.*;
class Hashset2{
    public static void main(String[] args) {
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(23);
        numbers.add(34);
        numbers.add(67);
        numbers.add(30);
        numbers.add(22);
        numbers.add(10);
        numbers.add(90);
        System.out.println(numbers.size());
        System.out.println(numbers.contains(30));
        System.out.println(numbers.contains(11));
    }
}