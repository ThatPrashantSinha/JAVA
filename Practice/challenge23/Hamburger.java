package Practice.challenge23;

public class Hamburger {
    private String type;
    private String topping1;
    private String topping2;
    private String topping3;
    private double basePrice;
    
    public Hamburger(){
        this("classic");
    }
    public Hamburger(String type){
        this.type = type;
        if(type.toLowerCase().contains("classic")){
            basePrice += 199;
        }else if(type.toLowerCase().contains("double")){
            basePrice += 269;
        }else if(type.toLowerCase().contains("mexican")){
            basePrice += 229;
        }else if(type.toLowerCase().contains("bbq")){
            basePrice += 239;
        }
    }

    public String getType() {
        return this.type;
    }
    public Double getBasePrice(){
        return basePrice;
    }
    public String getTopping1(){
        return topping1;
    }
    public String getTopping2(){
        return topping2;
    }
    public String getTopping3(){
        return topping3;
    }

    public void addToppings(String topping1, String topping2, String topping3){
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
    }
}