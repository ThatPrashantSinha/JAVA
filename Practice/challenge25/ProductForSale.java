public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price) {
        this.type = type;
        this.price = price;
        description = "This is a " + type;
    }

    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
    public String getDecription(){
        return description;
    }

    public double getSalesPrice(int quantity){
        return quantity * price;
    }

    public void printPricedItem(int quantity){
        System.out.println(type + "x" + quantity + " = $" + getSalesPrice(quantity));
    }
    public abstract String showDetails();
    
}
