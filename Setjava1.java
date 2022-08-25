public class Setjava1{
    public static void main(String[] args){
        Bicycle bicycle1 = new Bicycle(77);
        System.out.println(bicycle1.getGear());
        bicycle1.setGear(67);
        System.out.println(bicycle1.getGear());
        Bicycle bicycle2 = new Bicycle(2);
        bicycle2.setGear(67);
        System.out.println(bicycle2.getGear());
        bicycle2.setGear(44);
        System.out.println(bicycle2.getGear());

    }
}
class Bicycle{
    private int gear = 5;

    Bicycle(int _gear){

        gear = _gear;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
