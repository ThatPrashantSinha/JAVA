public class Drink {
    private String type;
    private String size;
    private double price;

    public Drink(){
        this("coke","small");
    }
    public Drink(String type, String size){
        this.type = type;
        this.size = size;
        if(type.toLowerCase().contains("coke")){
            price += 49;
        }else if(type.toLowerCase().contains("iced")){
            price += 69;
        }else if(type.toLowerCase().contains("cold")){
            price += 99;
        }else if(type.toLowerCase().contains("shake")){
            price += 129;
        }
        price += (size.toLowerCase().charAt(0) == 's') ? 0 : 
                 (size.toLowerCase().charAt(0) == 'm') ? 30 : 50;
        
    }

    public String getType() {
        return this.type;
    }

    public String getSize() {
        return this.size;
    }

    public double getPrice() {
        return this.price;
    }


}
