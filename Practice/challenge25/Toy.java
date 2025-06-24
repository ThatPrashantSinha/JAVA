public class Toy extends ProductForSale{
    private String toyName;

    public Toy(String toyName, String type, double price){
        super(type, price);
        this.toyName = toyName;
    }

    

    public String showDetails(){
        return String.format("%s ,of %s genre... Priced =$%f", description, toyName, price);
    }
}
