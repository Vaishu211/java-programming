 public class Class2{
    public static void main(String[] args){
        Hotel hotel1= new Hotel("parvathi","nadaraja nagar,south ,thanjavur",45,"thanjavur","india",624645);
        Hotel hotel2 = new Hotel("shakthi","old busstand near,thanjavur",10,"thanjavur","india",678690);
        Hotel hotel3 = new Hotel("selva","new bustand near ,thanjavur",14,"thanjavur","india",645678);
        System.out.println(hotel1.country);
        System.out.println(hotel2.pincode);
        System.out.println(hotel3.city);
        System.out.println(hotel2.rooms);
        System.out.println(hotel3.name);

    }
}
class Hotel{
    String name;
    String address;
    int rooms;
    String city;
    String country;
    int pincode;
   public Hotel(String _name,String _address,int _rooms,String _city,String _country,int _pincode){
        name = _name;
        address = _address;
        rooms = _rooms;
        city = _city;
        country = _country;
        pincode = _pincode;

    }
}