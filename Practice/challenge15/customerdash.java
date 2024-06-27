package Practice.challenge15;

public class customerdash {
    public static void main(String[] args) {
        Customer prashdash = new Customer();
        System.out.println(prashdash.getCreditLimit());
        Customer timsdas = new Customer("tim","tim@gmail.com");
        System.out.println(timsdas.getCreditLimit());
        System.out.println(timsdas.getEmail());
    }
}
