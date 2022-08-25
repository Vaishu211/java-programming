package Animals22;
import java.util.HashSet;
public class Hashsetss{
    public static void main(String[] args) {
        Animals222 obj1=new Animals222("lion",4,"nonveg");
        Animals222 obj2=new Animals222("Tiger",4,"nonveg");
        Animals222 obj3=new Animals222("elephant",4,"veg");
        HashSet<Animals222> Ani=new HashSet<>();
        Ani.add(obj1);
        Ani.add(obj2);
        Ani.add(obj1);
        Ani.add(obj3);
        System.out.println(Ani.size());

    }
}