public class challenge1 {

    public static void main(String[] args) {
        double firstDvar= 20.00;
        double secondDvar= 80.00;
        double calc= ((firstDvar + secondDvar)*100.00)%40.00;
        boolean finalBoolean= (calc== 0.00) ? true : false;
        System.out.print(finalBoolean);
        if (finalBoolean!=true){
            System.out.print("got some remainder!!");
        }


    }
}