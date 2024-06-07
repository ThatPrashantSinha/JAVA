package Practice;
public class challenge7 {
    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0 -> System.out.println("sunday");
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            default -> System.out.println("invalid day");
        }
    }
    public static void main(String[] args) {
        printDayOfWeek(0);
    }
}
