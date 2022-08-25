import java.util.*;
class Arraylist03{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("priya");
        names.add("akila");
        names.add("maha");
        names.add("priya");
        System.out.println(names);
        System.out.println(names.set(0,"sudha"));
        System.out.println(names.get(2));
        System.out.println(names.remove(3));
        System.out.println(names.size());
        Collections.sort(names);
        System.out.println(names);
        for(String i:names){
            System.out.println(i);

        }

    }

    }
