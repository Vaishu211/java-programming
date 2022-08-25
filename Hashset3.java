import java.util.*;
class Hashset3{
    public static void main(String[] args) {
        HashSet<Integer>number=new HashSet<>();
        number.add(5);
        number.add(8);
        number.add(9);
        number.add(3);
        number.add(34);
        number.add(38);
        for(int i=1;i<=40;i++){
            if(number.contains(i)) {
                System.out.println(i +  " lucky numbers");
            }
            else{
                System.out.println(i +  " not my lucky numbers");
            }

        }
    }
}