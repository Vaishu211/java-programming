import java.util.*;
class Hashset1{
    public static void main(String[] args) {
        HashSet<String> Animals=new HashSet<>();
        Animals.add("lion");
        Animals.add("Tiger");
        Animals.add("dog");
        Animals.add("elephant");
        System.out.println(Animals);
        Animals.remove("dog");
        System.out.println(Animals);
        Animals.add("monkey");
        System.out.println(Animals);
    }
}