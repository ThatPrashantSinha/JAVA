public class exercise2 {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour<0){
            return -1;
        }else{
            double calcMiles=kilometersPerHour/1.609;
            return (long)Math.round(calcMiles);
           
        }
        
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else{
            int milesPerHour= (int)Math.round(kilometersPerHour/1.609);
             System.out.println(kilometersPerHour+" km/h = "+ milesPerHour + " mi/h");
        }
    }
    public static void main(String[] args) {
        System.out.print(toMilesPerHour(95.75));
        printConversion(95.75);
      
    }
}
