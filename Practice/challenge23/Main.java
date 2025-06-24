package Practice.challenge23;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
            ---BURGERS---
            Classic Cheeseburger            -> $199
            Double Trouble                  -> $269
            Spicy Mexican                   -> $229
            BBQ Ranch Burger                -> $239

            --EXTRA TOPPINGS---
            Extra Cheese                     -> $30
            Crispy Bacon                     -> $30
            Fried Egg                        -> $30
            Jalapeños                        -> $30
            Grilled Mushrooms                -> $30 
            Onion Rings                      -> $30
            Avocado Slices                   -> $30

            ---SIDES---
            French Fries                     -> $99
            Cheesy Fries                    -> $139
            Onion Rings                     -> $119
            Mozzarella Sticks               -> $159

            ---DRINKS---
            Soft Drinks (Coke, Sprite, etc.) -> $49
            Iced Tea (Lemon/Peach)           -> $69
            Cold Coffee                      -> $99
            Mango/Strawberry Shake          -> $129

                """);
        
        Hamburger bur = new Hamburger("Double trouble");
        bur.addToppings("Extra cheese", null, null);
        Sides sid = new Sides("Onion Rings");
        Drink dri = new Drink("Mango Shake","Medium");
        Meal maal = new Meal(bur,sid,dri);
        maal.printBill();
        Meal simpleMeal = new Meal();
        simpleMeal.printBill();
    }
}
