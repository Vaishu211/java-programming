import com.inheritence5.Redmi;
import com.inheritence5.Oppo;
class Mobileinher {
    public static void main(String[] args) {
        Redmi real1 = new Redmi("Redmi9", 10000, 5, "black");
        Redmi real2 = new Redmi("Redmi7", 8000, 4, "red");
        Oppo op = new Oppo("oppoA9", 17000, 5, "blue");
        System.out.println(real1.getPrice());
        real2.setColour("yellow");
        System.out.println(real2.getColour());
        System.out.println(op.getPrice());
        op.setModel("oppoA12");
        System.out.println(op.getModel());
    }
}