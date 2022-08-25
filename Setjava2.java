class Setjava2{
    public static void main(String[] args){
        Student s1=new Student("priya",2345,"fifth",10);
        Student s2=new Student("Agathi",2348,"fourth",9);
        Student s3=new Student("sri",2456,"sixth",12);
        s1.setrollNo(2222);
        System.out.println(s1.getrollNo());
        System.out.println(s3.getstandard());
        s2.setname("mathu");
        System.out.println(s2.getname());
        s3.setstandard("nineth");

    }
}
class Student {
    private String name ;
    private int rollNo ;
    private String standard ;
    private int age ;
    Student(String _name,int _rollNo,String _standard,int _age){
        name = _name;
        rollNo = _rollNo;
        standard = _standard;
        age= _age;
    }
    public String getname(){

        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getrollNo(){
        return rollNo;
    }
    public void setrollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public String getstandard(){
        return standard;

    }
    public void setstandard(String standard){
        this.standard=standard;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
}

