public class methods {
    public static void main(String[] args) {

        calculateSavings();
    }
    public static void calculateSavings(){
        int salary = 100000;
        int rent = 10000;
        int expenses = 20000;
        int daru = 5000;
        int savings =(salary-(rent+expenses+daru));
        System.out.println(savings);
        calculateSavingsFaster(10000,3000,5000,3000);
    }
    // or
    public static void calculateSavingsFaster(int salary,int rent,int expenses,int daru){
         System.out.println(salary-(rent+expenses+daru));
    }
    //method overloading...(creating multiple methods with same name...which accept diff parameters)
    


}
