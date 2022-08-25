import java.util.*;

public class Iterator1{
    public static void main(String[] args) {


        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Meesho");
        l1.add("Facebook");
        l1.add("Amazon");
        l1.add("Youtube");

        Iterator<String> iterator1 = l1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

    }
}