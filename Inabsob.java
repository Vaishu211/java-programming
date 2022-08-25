import com.Groups.Apple;
import com.Groups.Orange;
import com.Groups.garden;

public class Inabsob{
    public static void main(String[] args) {
        Apple a1 = new Apple("redApple", 200);
        Orange o1 = new Orange("kamalaOrage", 250);
        System.out.println(a1.getName());
        garden in1=new garden(a1,o1);
        System.out.println(in1.getAppleName());
        Apple a2 = new Apple("whiteApple",250);
        garden in2 = new garden(a2,o1);
        System.out.println(in2.getAppleName());
        System.out.println(in1.getOrangeName());

    }
}
