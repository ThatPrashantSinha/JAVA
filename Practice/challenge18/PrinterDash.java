package Practice.challenge18;

public class PrinterDash {
    public static void main(String[] args) {
        Printer printer =new Printer(20, true);
        System.out.println(printer.printPages(30));
        Printer printer2= new Printer(90, false);
        System.out.println(printer2.printPages(91));
        printer2.addToner(20);
        printer2.printPages(30);
    }
}
