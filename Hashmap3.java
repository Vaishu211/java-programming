import java.util.*;
class Hashmap3{
    public static void main(String[] args) {
        HashMap<String,Integer> nameAge=new HashMap<>();
        nameAge.put("priya",24);
        nameAge.put("Abi",45);
        nameAge.put("Maha",25);
        nameAge.put("Mala",27);
        nameAge.put("Vaishu",29);
        nameAge.put("Akila",28);
        nameAge.put("Malar",30);
        nameAge.put("Dharshini",20);
        nameAge.put("Deepa",34);
        nameAge.put("Kayal",35);
        nameAge.put("Agathi",22);
       for(String i:nameAge.keySet()){
           System.out.println(i);
        }
       for(Integer i:nameAge.values()){
           System.out.println(i);
       }
        System.out.println(nameAge.size());
        System.out.println(nameAge.values());


    }
}