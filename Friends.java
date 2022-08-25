public class Friends{
    public static void main(String[] args){
        Forever f1 = new Forever("agathi","MSc","Thennamanadu","Teacher");
       f1.setname("akila");
        System.out.println(f1.Place);
        System.out.println(f1.name);
        f1.Place = "OND";
        System.out.println(f1.Place);
        f1.Place = "thanjavur";
        System.out.println(f1.Place);
        Forever f2 = new Forever ("priya","Mphil","kannai","professer");
        f1.Place ="Pthur";
        System.out.println(f2.Place);
        System.out.println(f1.Place);
    }
}
class Forever{
    String name;
    String Degree;
     static String Place;
     static  String work;
    Forever(String _name,String _Degree,String _place,String _work){
        name = _name;
        Degree = _Degree;
        Place = _place;
        work = _work;
    }
   public String getname(){
        return name;
    }
    public void setname(String name){
        this.name =name;
    }
static
{
    System.out.println("my world");
}
}
