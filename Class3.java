 public class Class3{
    public static void main(String[] args){
        Biscuits bisc1=new Biscuits("good day",10,"green","good",58);
        Biscuits bisc2= new Biscuits("oreo",10,"blue","not bad",50);
        Biscuits bisc3= new Biscuits("marie gold",10,"yellow with orange","good",83);
        Biscuits bisc4 = new Biscuits("hide seek",30,"bubble","good taste",120);
        System.out.println(bisc2.name);
        System.out.println(bisc4.covercolour);
        System.out.println(bisc3.gm);
        System.out.println(bisc3.name);
        System.out.println(bisc1.rs);
        System.out.println(bisc2.taste);
    }
}
class Biscuits{
    String name;
    int rs;
    String  covercolour;
    String taste;
    int gm;
   public Biscuits(String _name,int _rs,String _covercolour,String _taste,int _gm){
        name = _name;
        rs = _rs;
        covercolour= _covercolour;
        taste = _taste;
        gm = _gm;
    }

}