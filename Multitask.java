import java.lang.constant.Constable;

class Multitask{
    public static void main(String[] args){
        Teacher ob1 = new Teacher("Malar","Msc","fifth","MMA  higher secondary school");
        Teacher ob2 = new Teacher("Abi","Mphil","nineth","srv high school");
        Teacher ob3 = new Teacher("priya","Msc","fourth","Sri srinivasha higher school");
        Teacher ob4 = new Teacher ("anitha","Bsc","second","SRV school");
        ob1.setschool("london school");
        System.out.println(ob1.getschool());
        System.out.println(ob1.getname());
        ob1.setDegree("Bsc");
        System.out.println(ob1.getDegree());
        System.out.println(ob3.getDegree());
        ob3.setname("agathi");
        System.out.println(ob3.getname());
        System.out.println(ob2.getname());
        System.out.println(ob4.getname());
        ob4 .setDegree("Mphil");
        System.out.println(ob4.getDegree());
        System.out.println(ob3.getDegree());
        ob4.setclass("ninth");
        System.out.println(ob4.getclass());
        System.out.println(ob3.getclass());
    }
}
class Teacher {
    public String name;
  public   String degree;
    private static String Class;
    private static String school;
     Teacher(String _name, String _degree, String _Class, String _school) {
         name = _name;
         degree = _degree;
         Class = _Class;
         school = _school;
     }

        public   String getname() {
            return name;

        }
        public void setname(String name){
            this.name = name;
        }
        public  String getDegree(){
            return degree;
        }
        public   void setDegree (String degree){
            this.degree = degree;
         }
         public  String getschool(){
            return school;
         }
         public  void  setschool(String school){
            this.school= school;
         }
         public   String getclass(){
            return Class;
         }
         public void setclass(String Class){
            this.Class = Class;
         }


}
