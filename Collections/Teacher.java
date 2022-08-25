package Collections;

import java.util.List;


public class Teacher {
    String name;
    String degree;
    int age;
    String location;
    int standard;

    public Teacher(String _name, String _degree, int _age, String _location, int _standard) {
        name = _name;
        degree = _degree;
        age = _age;
        location = _location;
        standard = _standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public static int method1(List<Teacher> techList, String location) {
        int count = 0;
        for (Teacher i : techList) {
            if (i.getLocation() == location) {
                count++;
            }
        }

        return count;


    }

    public static int method2(List<Teacher> techList, String location, int standard) {
        int count = 0;
        for (Teacher i : techList) {
            if (i.getLocation() == location && i.getStandard() == standard) {
                count++;
            }
        }
        return count;
    }

    public static int method3(List<Teacher> techList, String location,int age) {
        int count = 0;
        int total = 0;
        for (Teacher i : techList){
            if (i.getLocation() == location){
                count++;
            total = total + i.getAge();}
        }return count;
    }

}

