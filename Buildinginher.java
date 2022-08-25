import com.inheritence6.Hotel;
import com.inheritence6.Mall;
class Buildinginher{
    public static void main(String[] args){
        Hotel ho = new Hotel(20,"white",5,"mani hotel");
        Mall ma = new Mall (23,"bing",10,"malar mall");
        System.out.println(ho.getPaintColour());
        ho.setName("green");
        System.out.println(ho.getName());
        System.out.println(ma.getFlours());
    }
}