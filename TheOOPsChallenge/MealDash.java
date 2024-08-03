package TheOOPsChallenge;

import java.util.Scanner;

public class MealDash {
    private static String burgerType;
    private static double burgerPrice;
    private static String toping1;
    private static String toping2;
    private static String toping3;
    private static String drinkname;
    private static String drinkSize;
    private static double drinkPrice;
    private static String sideName;
    private static double sidePrice;
    private static int exception;
    
    public static boolean isToping(String toping1){
        if(toping1.charAt(0)=='c'||toping1.charAt(0)=='C'){
            burgerPrice+=1;  
            return true;
        }else if(toping1.charAt(0)=='s'||toping1.charAt(0)=='S'){
            burgerPrice+=1;
            return true;
        }else if(toping1.charAt(0)=='l'||toping1.charAt(0)=='L'){
            burgerPrice+=0.5;
            return true;
        }else if(toping1.charAt(0)=='t'||toping1.charAt(0)=='T'){
            burgerPrice+=0.5;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        exception=0;
        Scanner scanner = new Scanner(System.in);
        while (exception<1) {
            System.out.println("1. Classic Cheeseburger - $8.99\n" + //
                            "2. Bacon BBQ Burger - $10.99\n" + //
                            "3. Mushroom Swiss Burger - $9.99\n" + //
                            "4. Spicy Jalapeño Burger - $9.99\n" + //
                            "5. Veggie Delight Burger - $8.49\n" + //
                            "6. Double Trouble Burger - $12.99");
            System.out.println("What kind of burger do you want?");
            burgerType=scanner.nextLine();
            if(burgerType.charAt(0)=='c'||burgerType.charAt(0)=='C') {
                burgerPrice+=8.99;
                exception++;
            }else if(burgerType.charAt(0)=='b'||burgerType.charAt(0)=='B') {
                burgerPrice+=10.99;
                exception++;
            }else if(burgerType.charAt(0)=='m'||burgerType.charAt(0)=='M') {
                burgerPrice+=9.99;
                exception++;
            }else if(burgerType.charAt(0)=='s'||burgerType.charAt(0)=='S') {
                burgerPrice+=9.99;
                exception++;
            }else if(burgerType.charAt(0)=='v'||burgerType.charAt(0)=='V') {
                burgerPrice+=8.49;
                exception++;
            }else if((burgerType.charAt(0)=='d'||burgerType.charAt(0)=='B')&&
            (burgerType.charAt(7)=='d'||burgerType.charAt(7)=='B')) {
                burgerPrice+=12.99;
                exception++;
            }else if((burgerType.charAt(0)=='r'||burgerType.charAt(0)=='R')||
            ((burgerType.charAt(0)=='d'||burgerType.charAt(0)=='D')&&
            (burgerType.charAt(7)=='t'||burgerType.charAt(7)=='T'))){
                    burgerPrice+=8.49;
                    burgerPrice+=2.99;
                    burgerPrice+=2.49;
                    exception++;
            }else{
                System.out.println("***invalid input***");
                System.out.println("------------------------------------------------------------------------------------------------------");
            }
        }
        while (exception<5) {
            System.out.println("---------------------------------------------------------------------------------------------------------\n" + //
                            "1. Cheeses\n" + //
                            "\n" + //
                            "Cheddar - $1.00\n" + //
                            "Swiss - $1.00\n" + //
                            "2. Vegetables\n" + //
                            "\n" + //
                            "Lettuce - $0.50\n" + //
                            "Tomato - $0.50");
            System.out.println("Do you want topings?");
            toping1=scanner.nextLine();
            if(toping1.charAt(0)=='n'||toping1.charAt(0)=='N'){
                toping2="no topings";
                toping3="no topings";
                exception+=3;
                break;
            }else if(isToping(toping1)){
                exception++;
                System.out.println("---------------------------------------------------------------------------------------------------------\n" + //
                            "1. Cheeses\n" + //
                            "\n" + //
                            "Cheddar - $1.00\n" + //
                            "Swiss - $1.00\n" + //
                            "2. Vegetables\n" + //
                            "\n" + //
                            "Lettuce - $0.50\n" + //
                            "Tomato - $0.50");
                System.out.println("Do you want more topings?");
                toping2=scanner.nextLine();
                if(toping2.charAt(0)=='n'||toping2.charAt(0)=='N'){
                    toping3="no toping";
                    exception+=2;
                    break;
                }else if(isToping(toping2)){
                    exception++;
                    System.out.println("---------------------------------------------------------------------------------------------------------\n" + //
                            "1. Cheeses\n" + //
                            "\n" + //
                            "Cheddar - $1.00\n" + //
                            "Swiss - $1.00\n" + //
                            "2. Vegetables\n" + //
                            "\n" + //
                            "Lettuce - $0.50\n" + //
                            "Tomato - $0.50");
                    System.out.println("Do you want more topings?");
                    toping3=scanner.nextLine();
                    if(isToping(toping3)){
                        exception++;
                        break;
                    }else if(toping3.charAt(0)=='n'||toping3.charAt(0)=='N'){
                        exception++;
                        break;
                    }else{
                        System.out.println("invalid input");
                    }
                }else{
                    System.out.print("invalid input");
                }
            }else{
                System.out.println("invalid input");
            }
        }
        Burger prahmeal= new Burger(burgerType,burgerPrice,toping1,toping2,toping3);
        while (exception<6) {
            System.out.println("---------------------------------------------------------------------------------------------------------\n");
            System.out.println("Soft Drinks\n" + //
            "\n" + //
                "Small - $1.99\n" + //
                "Medium - $2.49\n" + //
                "Large - $2.99\n" + //
                "Fresh Lemonade\n" + //
                "\n" + //
                "Small - $2.49\n" + //
                "Medium - $2.99\n" + //
                "Large - $3.49\n");
            System.out.println("what drink do you want?");
            drinkname=scanner.nextLine();
            if(drinkname.charAt(0)=='s'||drinkname.charAt(0)=='S') {
                drinkPrice+=1.99;
                exception++;
                System.out.println("what about the size?");
                drinkSize=scanner.nextLine();
                if(drinkSize.charAt(0)=='s'||drinkSize.charAt(0)=='S') {
                    exception++;
                }else if(drinkSize.charAt(0)=='m'||drinkSize.charAt(0)=='M') {
                    drinkPrice+=0.50;
                    exception++;
                }else if(drinkSize.charAt(0)=='l'||drinkSize.charAt(0)=='L') {
                    drinkPrice+=1;
                    exception++;
                }
            }else if(drinkname.charAt(0)=='F'||drinkname.charAt(0)=='f') {
                drinkPrice+=2.49;
                exception++;
                System.out.println("what about the size?");
                drinkSize=scanner.nextLine();
                if(drinkSize.charAt(0)=='s'||drinkSize.charAt(0)=='S') {
                    exception++;
                }else if(drinkSize.charAt(0)=='m'||drinkSize.charAt(0)=='M') {
                    drinkPrice+=0.50;
                    exception++;
                }else if(drinkSize.charAt(0)=='l'||drinkSize.charAt(0)=='L') {
                    drinkPrice+=1;
                    exception++;
                }
            }else{
                System.out.println("invalid input");
            }
        }
        Drink prahDrink = new Drink(drinkname,drinkSize,drinkPrice);
        while (exception<7) {
            System.out.println("---------------------------------------------------------------------------------------------------------\n");
            System.out.println("1. French Fries - $2.99\n" + //
            "2.Sweet Potato Fries - $3.49\n" + //
            "3.Onion Rings - $3.99\n" + //
            "4.Side Salad - $3.99\n" + //
            "5.Coleslaw - $2.49");
            System.out.println("What do you want on the side?");
            sideName=scanner.nextLine();
            if(sideName.charAt(0)=='f'||sideName.charAt(0)=='F') {
            burgerPrice+=2.99;
            exception++;
            }else if(sideName.charAt(0)=='s'||sideName.charAt(0)=='S') {
            burgerPrice+=3.49;
            exception++;
            }else if(sideName.charAt(0)=='o'||sideName.charAt(0)=='O') {
            burgerPrice+=3.99;
            exception++;
            }else if(sideName.charAt(0)=='s'||sideName.charAt(0)=='S') {
            burgerPrice+=3.99;
            exception++;
            }else if(sideName.charAt(0)=='C'||sideName.charAt(0)=='c') {
            burgerPrice+=2.49;
            exception++;
            }else{
                System.out.println("invalid input");
            }
        }
        Sides prahSides = new Sides(sideName,sidePrice);
        Order prashOrder = new Order(prahmeal, prahDrink, prahSides);
        System.out.println("your order:\n"+"Burger: "+prashOrder.getOrderBurger().burgerType+"\n");
        System.out.println("Drink: "+prashOrder.getOrderDrink().drinkname+prashOrder.getOrderDrink().drinkSize+'\n');
        System.out.println("Side: "+prashOrder.getOrderSide().sideName+"\n");
        System.out.println("Your total bill is: $"+Meal.bill);

    }

}

