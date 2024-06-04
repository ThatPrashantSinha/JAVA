public class exercise8 {
    public static boolean hasTeen(int numOne,int numTwo,int numThree) {
        if((numOne>=13&&numOne<=19)||(numTwo>=13&&numTwo<=19)||(numThree>=13&&numThree<=19)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isTeen(int numbOne) {
        if(numbOne>=13&&numbOne<=19){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 02, 15));
        System.out.println(isTeen(9));
    }

}
