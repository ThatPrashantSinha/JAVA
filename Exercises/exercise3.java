package Exercises;
public class exercise3 {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int mB=0;
        int kB=0;
        if(kiloBytes<0){
            System.out.println( "Invalid Value");
        }else{
            mB=kiloBytes/1024;
            kB=kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+mB+" MB and "+kB+" KB");
        }
        
        
    }
    public static void main(String[] args) {
        
        printMegaBytesAndKiloBytes(2500);
    }
}
