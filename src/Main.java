class Burger{
    private String roll;
    private String meat;
    private String name;
    private double price;
    private String add1 ="";
    private String add2 ="";
    private String add3 ="";
    private String add4 ="";

    public Burger(String roll, String meat, String name, double price){
        this.roll = roll;
        this.meat = meat;
        this.name = name;
        this.price = price;

    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public void setAdd3(String add3) {
        this.add3 = add3;
    }

    public void setAdd4(String add4) {
        this.add4 = add4;
    }

    public void caluculateTotal(){
        System.out.println("Burger " + this.name );
        System.out.println("Cena " + this.price);
        System.out.println("Wybrane dodatki: /n" +add1 + addPrice(add1)+add2 + addPrice(add2)
                +add3 + addPrice(add3)+add4 + addPrice(add4));
  }

  public double addPrice(String dodatek){
        switch(dodatek){
            case "salata":
                    return 2.5;
            case "pomidor":
                return 3.5;
            case "ogorek":
                return 1.5;
            case "marchewka":
                return 2.3;
                default:
                    return 0;
        }

  }



}







public class Main {
    public static void main(String[] args){

        Burger burger = new Burger("biala","wol","Klasik",3.5);

        burger.setAdd1("salata");
        burger.setAdd2("pomidor");

        burger.caluculateTotal();


    }
}
