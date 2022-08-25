import Collections.Teacher;

import java.util.ArrayList;
import java.util.List;
public class Arraylistteach {
    public static void main(String[] args) {
        Teacher obj1 = new Teacher("Anitha", "Msc", 23, "ond", 2);
        Teacher obj2 = new Teacher("priya", "Bsc", 22, "Thanjavur", 1);
        Teacher obj3 = new Teacher("Mugil", "BE", 25, "Thennamanadu", 6);
        Teacher obj4 = new Teacher("Abi", "ME", 28, "pudhur", 8);
        Teacher obj5 = new Teacher("Maha", "Msc", 29, "ond", 2);
        Teacher obj6 = new Teacher("Aniks", "Bed", 26, "nagai", 4);
        Teacher obj7 = new Teacher("deepa", "Bsc", 23, "Thennamanadu", 2);
        Teacher obj8 = new Teacher("Bharathi", "BE", 25, "pudhur", 6);
        Teacher obj9 = new Teacher("Akila", "Msc", 26, "Trichy", 8);
        Teacher obj10 = new Teacher("Abarna", "Bsc", 24, "nagai", 5);
        ArrayList<Teacher> Teach = new ArrayList<>();
        Teach.add(obj1);
        Teach.add(obj2);
        Teach.add(obj3);
        Teach.add(obj4);
        Teach.add(obj5);
        Teach.add(obj6);
        Teach.add(obj7);
        Teach.add(obj8);
        Teach.add(obj9);
        Teach.add(obj10);
        System.out.println(Teacher.method1(Teach,"nagai"));
        System.out.println(Teacher.method2(Teach,"ond",2));
        System.out.println(Teacher.method3(Teach,"pudhur"));
      //  System.out.println(Teacher.method3());


        //  method1(Teach);

    }


}
