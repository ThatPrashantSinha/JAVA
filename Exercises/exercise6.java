package Exercises;
public class exercise6 {
    public static boolean areEqualByThreeDecimalPlaces(double numOne,double numTwo) {
        int lnumOne=(int)(numOne*1000);
        int lnumTwo=(int)(numTwo*1000);
        if(lnumOne==lnumTwo){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1112, 3.1113));
    }
}
