package Practice.challenge16;

public class workerdash {
    public static void main(String[] args) {
        Worker joe =new Worker("joe", "2000", "2021");
        System.out.println(joe.getAge());
        SalariedEmployee prash =new SalariedEmployee("prash", "2006", "2023", 6969, "2019",250000, false);
        System.out.println(prash.collectPay());
        SalariedEmployee pra = new SalariedEmployee("pra", "2006", "2020", 202, "2015", 12000, false);
        System.out.println(pra.collectPay());
        System.out.println(joe.collectPay());
    }
}
