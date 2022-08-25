class Setjava3{
    public static void main(String[] args){
        Foods f1= new Foods("lemon",25,"yellow","onecup");
        Foods f2= new Foods("gurdrice",30,"white","onecup");
        System.out.println(f1.getquantiti());
        System.out.println(f1.foodname);
        f1.setfoodColour("orange");
        f1.setfoodColour("red");
        System.out.println(f1.getfoodColour());
        System.out.println(f2.rs);
f2.setfoodname("vegrice");
        System.out.println(f2.getfoodname());


    }
}
class Foods {
    String foodname;
    int rs;
    private String foodColour;
    private String quantiti;

    Foods(String _foodname, int _rs, String _foodColour, String _quantiti) {
        foodname = _foodname;
        rs = _rs;
        foodColour = _foodColour;
        quantiti = _quantiti;
    }

    public String getfoodColour() {
        return foodColour;
    }

    public void setfoodColour(String foodColour) {
        this.foodColour = foodColour;
    }

    public String getquantiti() {
        return quantiti;
    }

    public void setquantiti(String quantiti) {
        this.quantiti = quantiti;
    }
    public String getfoodname(){
        return foodname;
    }
    public void setfoodname(String foodname){
        this.foodname =foodname;
    }
}