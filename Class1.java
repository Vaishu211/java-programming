import java.sql.SQLOutput;

 public class Class1{
    public static void main(String[] args){
        Student student1=new Student("vinitha","selva","anitha","fourth",2013,"sri rama villas higher secondary school","1157/2,south street,Thennamanadu,Thanjavur");
        Student student2=new Student("priya","govindh","malar","sixth",2010,"sri rama villas higher secondary school", "1564,north street,thennamanadu,thanjavur");
        Student student3= new Student("abi","kumar","selvi","tenth", 2007,"sri rama villas higher secondary school", "1122,west street,thennamanadu,thanjavur");
        System.out.println(student1.Address);
        System.out.println(student3.Address);
        System.out.println(student1.standard);
        System.out.println(student3.dob);
        System.out.println(student2.fathername);}}
        class Student {
            String studentname;
            String fathername;
            String mothername;
            String standard;
            int dob;
            String schoolname;
            String Address;

           public Student(String _studentname, String _fathername , String _mothername ,String _standard,int _dob, String _schoolname, String _Address){
                studentname = _studentname;
                fathername = _fathername;
                mothername = _mothername;
                standard = _standard;
                dob = _dob;
                schoolname = _schoolname;
                Address = _Address;
            }

        }
