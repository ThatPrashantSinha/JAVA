public class Book extends ProductForSale{
    private String bookName;

    public Book(String bookName, String type, double price){
        super(type, price);
        this.bookName = bookName;
    }

    public String showDetails(){
        return String.format("%s ,of %s genre... Priced =$%f", description, bookName, price);
    }
}
