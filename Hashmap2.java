import java.util.*;
class Hashmap2 {
    public static void main(String[] args) {
        HashMap<Character, Integer> Members = new HashMap<>();
        Members.put('A', 20);
        Members.put('C', 24);
        Members.put('D', 20);
        Members.put('B', 40);
        Members.put('E', 80);
        Members.put('H', 76);
        Members.put('L', 90);
        Members.put('R', 10);
        System.out.println(Members.size());
        System.out.println(Members);
        System.out.println(Members.get('A'));
        System.out.println(Members.keySet());
        System.out.println(Members.remove('E'));
        System.out.println(Members.size());
        Members.put('W', 77);
        System.out.println(Members.size());
        for (Map.Entry i : Members.entrySet()) {
            System.out.println(i.getKey() + "  " + i.getValue());
        }
    }
}