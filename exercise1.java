public class exercise1 {
    public static void checkNumber(int number) {
        System.out.println((number>0 ? "positive":(number<0 ?"negative":"zero")));
        
    }
    public static void main(String[] args) {
        checkNumber(-29489);
    }
}