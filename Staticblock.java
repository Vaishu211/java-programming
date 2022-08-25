 public class Staticblock{
    public static void main(String[] args){
        Dccc obj1 = new Dccc(23);
        System.out.println(obj1.number);



    }
}
class Dccc{
    int number ;
    Dccc(int _number){
        number = _number;
    }
    static void myName(){
        System.out.println("hiiii");
    }
    static{
        System.out.println("my world");
    }
}