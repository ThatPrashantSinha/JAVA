package Practice.challenge17;

public class SmartKitchen extends Appliances{
    private Refrigirator iceBox;
    private DishWasher DishWasher;
    private CoffieMaker brewMaster;
    
    public SmartKitchen(Refrigirator Refrigirator,DishWasher DishWasher,CoffieMaker CoffieMaker){
        this.iceBox=Refrigirator;
        this.DishWasher=DishWasher;
        this.brewMaster=CoffieMaker;
    }
    public CoffieMaker getBrewMaster(){
        return brewMaster;
    }
    public Refrigirator getIceBOx(){
        return iceBox;
    }
    public DishWasher getDishWasher(){
        return DishWasher;
    }
    public void addWater(){
        brewMaster.setHasWorkToDO(true);
        brewMaster.brewCoffie();
    }
    public void pourMilk(){
        iceBox.setHasWorkToDO(true);
        iceBox.orderFood();
    }
    public void loadDishWasher(){
        DishWasher.setHasWorkToDO(true);
        DishWasher.doDishes();
    }
    public void SetKitchenState(boolean i,boolean d,boolean c){
        brewMaster.setHasWorkToDO(c);
        brewMaster.brewCoffie();
        iceBox.setHasWorkToDO(i);
        iceBox.orderFood();
        DishWasher.setHasWorkToDO(d);
        DishWasher.doDishes();
    }

}
