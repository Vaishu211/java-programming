import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
class Methods4 {
    public static void main(String[] args) {
        hello();
        names("vaishu", 23);
        names("vinitha", "priya", 52);
        int[] test = {2, 4, 5, 9};
        String[] value = {"dog", "lion", "cat"};
        names(value, test);
        String[] kids = {"ashmi", "prithi", "dharshan"};
        int[] dates = {3, 9, 1, 8};
        list("vaishali", 34, kids, dates);
    }
    public static void hello() {
        System.out.println("hiii");
    }

    public static void names(String username, double age) {
        System.out.println(username);
        System.out.println(age);
    }

    public static void names(String firstname, String secondname, int wait) {
        System.out.println(firstname);
        System.out.println(secondname);
        System.out.println(wait);
    }

    public static void list(String boths, double number, String[] kids, int[] dates) {
        System.out.println(boths);
        System.out.println(number);
        for (int i = 0; i < kids.length; i++) {
            System.out.println(kids[i]);
        }
        for (int j = 0; j < dates.length; j++) {
            System.out.println(dates[j]);
        }
    }
    public static void names(String[] test, int[] value) {
        for ( int k = 0; k <test.length; k++) {
            System.out.println(test[k]);
        }
        for ( int l = 0; l <value.length; l++) {
            System.out.println(value[l]);
        }
    }
}
