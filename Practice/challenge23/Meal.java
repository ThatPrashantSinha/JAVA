package Practice.challenge23;

public class Meal {
    private Hamburger burger;
    private Sides sides;
    private Drink drink;
    
    public Meal(){
        this.burger = new Hamburger();
        this.sides = new Sides();
        this.drink = new Drink();
    }
    public Meal(Hamburger burger, Sides sides, Drink drink){
        this.burger = burger;
        this.sides = sides;
        this.drink = drink;
    }

    public void printBill(){
        double bill = burger.getBasePrice();
        System.out.print("\n\n----BILL----\n" + 
                         burger.getType() +".......... $"+ burger.getBasePrice() + "\n"
                         );
        if(burger.getTopping1() != null){
            System.out.print(burger.getTopping1() + ".......... $30\n");
            bill += 30;
        }
        if(burger.getTopping2() != null){
            System.out.print(burger.getTopping2() + ".......... $30\n");
            bill += 30;
        }
        if(burger.getTopping3() != null){
            System.out.print(burger.getTopping3() + ".......... $30\n");
            bill += 30;
        }
        System.out.print(sides.getType() + ".......... $" + sides.getPrice() + "\n");
        bill += sides.getPrice();
        System.out.print(drink.getSize() + drink.getType() + ".......... $" + drink.getPrice() + "\n");
        bill += drink.getPrice();
        System.out.print("Total.......... $" + bill);

    }
}
