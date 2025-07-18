package Practice.challenge25;

import java.util.ArrayList;
import java.util.Arrays;

public class Store {
    private ArrayList<ProductForSale> catalogue = new ArrayList<>();
    protected ArrayList<OrderItem> cart = new ArrayList<>();

    public void itemsForSale(){
        System.out.println("===== PRODUCT CATALOG =====");
        for (ProductForSale item : catalogue) {
            System.out.printf("Type: %s%nDecription: %s%nPrice: $%.2f%n%n", item.getType(), item.showDetails(), item.getPrice());
        }
    }
    public void addToCatalogue(ProductForSale newProduct){
        catalogue.add(newProduct);
    }
    public void addToCatalogue(ProductForSale... newProduct){
        catalogue.addAll(Arrays.asList(newProduct));
    }

    public void addItemsToCart(ProductForSale product, int quantity){
        cart.add(new OrderItem(product, quantity));
    }
    public void printOrderedItems(){
        double total = 0;
        System.out.println("===== Recipt =====");
        for (OrderItem orderItem : cart) {
            System.out.printf("%s x%d = $%.2f%n",orderItem.product().getType(), 
            orderItem.quantity(), 
            orderItem.product().getSalesPrice(orderItem.quantity()));
            total += orderItem.product().getSalesPrice(orderItem.quantity());
        }
        System.out.printf("\nTotal  = $%.2f",total);
    }
    public static void main(String[] args) {
        Book harryPotter = new Book("Fiction", "Book", 19.99);
        Book ironMan = new Book("Si-Fi", "Book", 9.99);
        Toy lego = new Toy("Building Blocks", "Toy", 24.99);
        Toy rcCar = new Toy("Remote Controled", "Toy", 14.99);


        Store myStore = new Store();
        myStore.addToCatalogue(harryPotter);
        myStore.addToCatalogue(ironMan,lego,rcCar);

        myStore.itemsForSale();

        myStore.addItemsToCart(harryPotter, 2);
        myStore.addItemsToCart(lego, 5);
        myStore.addItemsToCart(rcCar, 1);

        myStore.printOrderedItems();
    }
}
