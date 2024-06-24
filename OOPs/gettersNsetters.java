package OOPs;

public class gettersNsetters {
    public static void main(String[] args) {
        main laptop = new main();
        System.out.println(laptop.getBrand()+
        laptop.getSize()+
        laptop.getColor()+
        laptop.getIsAvailable());
        laptop.setBrand("asus");
        laptop.discribe();
        
    }
    
}
