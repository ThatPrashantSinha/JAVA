package Practice.challenge17;

public class Appliencedash {
    public static void main(String[] args) {
        Refrigirator prasRefrigirator = new Refrigirator();
        DishWasher prasDishWasher = new DishWasher();
        CoffieMaker prashCoffieMaker = new CoffieMaker();
        SmartKitchen prashKitchen=new SmartKitchen(prasRefrigirator, prasDishWasher, prashCoffieMaker);
        prashKitchen.SetKitchenState(true, true, true);
        prasDishWasher.doDishes();
        prashKitchen.getBrewMaster().setHasWorkToDO(false);
        prashKitchen.getBrewMaster().brewCoffie();
        prashKitchen.SetKitchenState(false, false, false);
    }
}
