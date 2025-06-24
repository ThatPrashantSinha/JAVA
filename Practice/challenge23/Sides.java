package Practice.challenge23;

public class Sides {
    private String type;
    private double price;

    public Sides(){
        this("french");
    }
    public Sides(String type){
        this.type = type;
        if(type.toLowerCase().contains("french")){
            price += 99;
        }else if(type.toLowerCase().contains("cheesy")){
            price += 139;
        }else if(type.toLowerCase().contains("onion")){
            price += 119;
        }else if(type.toLowerCase().contains("sticks")){
            price += 159;
        }
    }

    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
}
