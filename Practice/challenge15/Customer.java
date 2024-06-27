package Practice.challenge15;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public String getName(){
        return name;
    }
    double getCreditLimit(){
        return creditLimit;
    }
    public String getEmail(){
        return email;
    }
    public Customer(String name,double creditLimit,String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }
    public Customer(){
        this("prash",100000.0,"prashantsinha9717@gamil.com");
    }
    public Customer(String name, String email){
        this(name,10000,email);
    }
}