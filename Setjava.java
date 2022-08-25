public class Setjava{
    public static void main(String[] args){
        School school1=new School("Srv higher",45,14,16 );
        School school2 = new School("sri srinivash ",34,23,25);
        System.out.println( school1.getTotalVans());
        school1.setTotalVans(34);
        System.out.println( school1.getTotalVans());
        System.out.println(school2.getTotalVans());
        school2.setTotalVans(36);
    }
}
class School{
    String name;
    int classrooms;
    int   totalVans;
    int   noOfTeachers;
     School(String a1, int a2, int a3, int a4) {
         name = a1;
         classrooms = a2;
         totalVans = a3;
         noOfTeachers = a4;
     }
        public int getTotalVans(){
            return totalVans ;
        }
        public  void setTotalVans(int totalVans){
            this.totalVans = totalVans;
        }
    }
    }