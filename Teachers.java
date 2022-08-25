import com.inheritence3.Mathsteacher;
import com.inheritence3.Englishteacher;
class Teachers{
    public static void main(String[] args) {
        Mathsteacher math = new Mathsteacher("priya","Msc","SRV higher secondary school",25);
        Englishteacher english= new Englishteacher("vaishu","Msc Bed","Sri srinivash higher school",26);
        System.out.println(math.getName());
        english.setDegree("Mphil");
        System.out.println(english.getDegree());
        math.setAge(27);
        System.out.println(math.getAge());
        System.out.println(english.getSchool());
    }
}