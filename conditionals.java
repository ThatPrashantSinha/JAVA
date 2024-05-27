public class conditionals {
    public static void main(String[] args) {
        int noOfApples= 50;
        if (noOfApples>10) // without "{}" executes only one statement
            System.out.print("Thats a lot of Apples");
        if (noOfApples>=50){
            System.out.print("i have more than 40 apples"+ "\n");
            System.out.print("i need more apples"+ "\n");
        }
        // and operator &&
        if (noOfApples==50 && noOfApples<100){
            System.out.print("not enough apples"+ "\n");
        }
        // or operator ||
        if (noOfApples==20 || noOfApples<100){
            System.out.print("not enough apples"+ "\n");
        }
        // ternry operator ?:
        boolean isAlive=true;
        boolean mortalityStatus = (isAlive!=false)? true:false;
        System.out.print(mortalityStatus);
     }
    
}
