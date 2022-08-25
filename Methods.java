public class Methods {
    public static void main(String[] args) {
        name("seetha", "gr");
        world();
        world();
        name("pradeep", "king");
    }


    static void world(){
        System.out.println("Hello world");
    }

    static void name(String userName, String fatherName){
        System.out.println(userName);
        System.out.println(fatherName);
    }
}