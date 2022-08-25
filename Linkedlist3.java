import java.util.LinkedList;
class Linkedlist3{

    public static void main(String[] args) {
        LinkedList<String>names=new LinkedList<>();
        names.add("Akila");
        names.add("maha");
        names.add("priya");
        names.removeLast();
        System.out.println(names);
    }
}