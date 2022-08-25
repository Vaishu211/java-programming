import java.util.HashSet;
class Hashset01{
    public static void main(String[] args) {
        Students s1=new Students();
        s1.setName("priya");
        s1.setAge(13);
        s1.setPlace("TND");
        s1.setSchool("SRV");
        Students s2= new Students();
        s2.setName("abi");
        s2.setAge(14);
        s2.setSchool("Sri srinivasha higher secondaary school");
        s2.setPlace("orathanadu");
        HashSet<Students>stu=new HashSet<>();
        stu.add(s1);
        stu.add(s2);
        for(Students i:stu){
            System.out.println("name:" + i.getName());
            System.out.println("age:"+ i.getAge());
            System.out.println("School:"+ i.getSchool());
            System.out.println("place:"+ i.getPlace());
        }

    }
}





class Students{
    String name;
    int age;
    String place;

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getPlace()
    {
        return place;
    }

    public void setPlace(String place)
    {
        this.place = place;
    }

    public String getSchool()
    {
        return School;
    }

    public void setSchool(String school)
    {
        School = school;
    }

    String School;
}