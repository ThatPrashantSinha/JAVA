public class exercise2 {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour<0){
            return -1;
        }else{
            long calcMiles=(long) Math.round(kilometersPerHour*0.6214);
            return calcMiles;
        }
    }
    public static void main(String[] args) {
        System.out.print(toMilesPerHour(75.114));
    }
}
