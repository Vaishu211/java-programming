import com.School.*;
 public class School{
    public static void main(String[] args) {
        Teacher tech1 = new Teacher ("Anitha","Msc","fourth","SRV higher secondary school");
        Teacher tech2 = new Teacher ("priya","Msc Bed","tenth","Sri srinivasha higher secondary school");
        Teacher tech3 = new Teacher ("Ahalya","Msc","seventh","Londan higher secondary school");
        Teacher tech4 = new Teacher ("Anushiya","Bsc Bed","fifth","govt girls higher secondary school");
        Teacher tech5 = new Teacher ("Ragavi","Msc Bed","nineth","Little rose");
        System.out.println(tech2.degree);
        System.out.println(tech5.getschool());
        tech4.setname("vinitha");
        System.out.println(tech4.getname());
        System.out.println(tech3.getclass());
        Student23  s1 = new Student23 ("viki","nineth",14,"SRV higher secondary school",32);
        Student23 s2 = new Student23 ("priya","seventh",13,"Sri srinivasha higher secondary school",30);
        Student23 s3 = new Student23 ("Akila","tenth",15,"Londan higher secondary school",37);
        Student23 s4 = new  Student23("Amudha","fifth",10,"govt girls higher secondary school",25);
        Student23 s5 = new Student23 ("Aniks","seventh",13,"Little rose",31);
        System.out.println(s3.getName());
        s4.setName("Abi");
        System.out.println(s4.getName());
        System.out.println(s5.getStandard());
        Vechile v1 = new Vechile ("van A","yellow",34,40,"Karthi");
        Vechile V2 = new Vechile ("van B","orange",29,45,"Kalai");
        Vechile V3 = new Vechile ("Van C","yellow",32,42,"mani");
        Vechile V4 = new  Vechile("Van D","blue",24,35,"muthu");
        Vechile v5 = new  Vechile ("Van E","yellow",26,28,"kalai");
        System.out.println(V3.getName());
        V2.setColour("green");
        System.out.println(V2.getColour());
        Building b1 = new Building("block A",34,"blue",2);
        Building b2= new Building("block B",23,"white",4);
        Building b3 = new Building("block c",17,"lightyellow",3);
        Building b4 = new Building("block D",27,"blue",4);
        Building b5 = new Building("block E",22,"green",5);
        System.out.println(b4.getNoOfwindows());
        System.out.println(b3.getName());
        b3.setName("block F");
        System.out.println(b3.getName());
        Ground g1= new Ground("kabadiground",20,11,30,"rectangle");
        Ground g2= new Ground("tennise",13,2,10,"squre");
        Ground g3= new Ground("woolyball",34,12,23,"rectangle");
        Ground g4= new Ground("basketball",20,13,20,"circle");
        Ground g5= new Ground("criket",20,12,30,"rectangle");
        System.out.println(g3.getName());
        System.out.println(g1.getLength());
        g5.setWide(23);
        System.out.println(g5.getWide());

    }
}