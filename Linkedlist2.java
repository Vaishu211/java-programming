import java.util.LinkedList;
class Linkedlist2{
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(6);
        numbers.add(3);
        numbers.add(8);
        numbers.removeFirst();
        System.out.println(numbers);
        numbers.add(2);
        System.out.println(numbers);
    }
}