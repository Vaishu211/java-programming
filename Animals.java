import com.inheritence2.Elephant;
import com.inheritence2.Lion;

class Animals{
    public static void main(String[] args) {
        Lion lio = new Lion ("sound","yellow with orange","nonveg","normal");
        Elephant ele =new Elephant("weight","block","veg","big");
        lio.setColour("red");
        System.out.println(lio.getColour());
        System.out.println(ele.getFood());
        ele.setColour("light block");
        System.out.println(ele.getColour());
    }
}