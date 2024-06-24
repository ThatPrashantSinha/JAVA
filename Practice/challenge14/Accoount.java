package Practice.challenge14;

public class Accoount {
    private int acNumber = 123456789;
    private String name ="john";
    private double balance =0.0;
    private String email = "john_homelander@gmail.com";
    public void withdraw(double amount) {
        if(balance-amount<0){
            System.out.println("you have insuficent funds...");
        }else{
            System.out.println("your withdrawl is done, remaining balance: "+(balance-amount));
        }
    }
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("your balance: "+balance);
    }
}
