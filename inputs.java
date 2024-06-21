import java.util.Scanner;
public class inputs {
    public static void main(String[] args) {
        String name =System.console().readLine("What is your name saurrr...?");
        System.out.println("ooh my goddo its "+name);

        Scanner sc = new Scanner(System.in);
        boolean validage=false;
        do{
            System.out.println("when were you born "+name);
            String age = sc.nextLine();
            int currentage= 2024 - Integer.parseInt(age);
            System.out.println("ooh so you are "+currentage+" years old");
    
        }while(validage==false);

    }
    public static void checkage(String age) {
        boolean validage=false;
        if(Integer.parseInt(age)>2024||Integer.parseInt(age)<(2024-150)){
            System.out.println("please saurr enter a valid age...");
        }else{
            validage = true;
        }
    }

}
