import com.inheritence4.Teacher;
import com.inheritence4.Student;

class Schoolsinher{
    public static void main(String[] args) {
        Student s1 = new Student("Anitha", 14, 23 / 8 / 2009, "SRV higher school", "Thennamanadu");
        Teacher T1 = new Teacher("priya", 28, 23 / 2 / 1994, "Sri srinivasha ", "OND", "Msc");
        System.out.println(T1.getName());
        s1.setAge(15);
        System.out.println(s1.getAge());
        System.out.println(T1.getSchool());

    }

}