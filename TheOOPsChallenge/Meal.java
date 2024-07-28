package TheOOPsChallenge;

public class Meal {
    protected static double bill;
    public Meal(double amount){
        bill+=amount;
    }
}

class Burger extends Meal{
    protected String burgerType;
    private double burgerPrice;
    private String toping1;
    private String toping2;
    private String toping3;

    public Burger(){
        this("Regular burger",8.99, "no topping","no topping","no topping");
    }

    public Burger(String burgerType,double burgerPrice,String toping1,String toping2, String toping3){
        super(burgerPrice);
        this.burgerType=burgerType;
        this.toping1=toping1;
        this.toping2=toping2;
        this.toping3=toping3;
    }
}

class Drink extends Meal{
    protected String drinkname;
    protected String drinkSize;
    private double drinkPrice;

    public Drink(){
        this("Coke","small",2.49);
    }

    public Drink(String drinkName,String drinkSize,double drinkPrice){
        super(drinkPrice);
        this.drinkname=drinkName;
        this.drinkSize=drinkSize;
    }
}
class Sides extends Meal{
    protected String sideName;
    private double sidePrice;

    public Sides(){
        this("Fries",2.99);
    }
    public Sides(String sideName,double sidePrice){
        super(sidePrice);
        this.sideName=sideName;
    }
}

