class Burger{
    public String roll;
    public String meat;
    public String name;
    public double price;
    public String add1 ="";
    public String add2 ="";
    public String add3 ="";
    public String add4 ="";

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
        System.out.println("Wybrane dodatki: \n" +add1 + addPrice(add1)+add2 + addPrice(add2)
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


class healthyBurger extends Burger{

    String zdrowyDodatek1 = "";
    String zdrowyDodatek2 = "";

    public healthyBurger( String meat, String name, double price) {
        super("brown", meat, name, price);
    }

    public void setZdrowyDodatek1(String zdrowyDodatek1){
        this.zdrowyDodatek1 = zdrowyDodatek1;
    }

    public void setZdrowyDodatek2(String zdrowyDodatek2){
        this.zdrowyDodatek1 = zdrowyDodatek2;
    }

    @Override
    public void caluculateTotal() {
        System.out.println("Burger " + super.name );
        System.out.println("Cena " + super.price);
        System.out.println("Wybrane dodatki: \n" +add1 + addPrice(add1)+add2 + addPrice(add2)
                +add3 + addPrice(add3)+add4 + addPrice(add4) + zdrowyDodatek1 +addPrice(zdrowyDodatek1) + zdrowyDodatek2 + addPrice(zdrowyDodatek2));
    }
}




public class Main {
    public static void main(String[] args){

        Burger burger = new Burger("biala","wol","Klasik",3.5);

        burger.setAdd1("salata");
        burger.setAdd2("pomidor");

        burger.caluculateTotal();

        healthyBurger zdrowyburger = new healthyBurger("kurczak","slowdeath",12.67);

        zdrowyburger.setZdrowyDodatek1("pomidor");
        zdrowyburger.setZdrowyDodatek2("salata");

        zdrowyburger.caluculateTotal();
    }
}
