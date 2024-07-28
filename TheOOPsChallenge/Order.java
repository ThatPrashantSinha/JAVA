package TheOOPsChallenge;

import java.util.Scanner;

public class Order extends Meal{
    private Burger orderBurger;
    private Drink orderDrink;
    private Sides orderSide;

    public Order(Burger orderBurger,Drink orderDrink,Sides orderSide){
        super(0);
        this.orderBurger=orderBurger;
        this.orderDrink=orderDrink;
        this.orderSide=orderSide;
    }
    public Burger getOrderBurger(){
        return orderBurger;
    }
    public Drink getOrderDrink(){
        return orderDrink;
    }
    public Sides getOrderSide(){
        return orderSide;
    }
}
