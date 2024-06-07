public class flowcontrol {
    public static void NATOalpha(char alpha) {
        switch (alpha) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("The leter "+alpha+" was not found");
                break;
        }
    }
    public static void printNumberInWord(int number) {
        switch (number) {
            case 0-> System.out.println("ZERO");
            case 1-> System.out.println("ONE");
            case 2-> System.out.println("TWO");
            case 3-> System.out.println("THREE");
            case 4-> System.out.println("FOUR");
            case 5-> System.out.println("FIVE");
            case 6-> System.out.println("SIX");
            case 7-> System.out.println("SEVEN");
            case 8-> System.out.println("EIGHT");
            case 9-> System.out.println("NINE");
            default -> System.out.println("OTHER");
        }
    }
    public static void main(String[] args) {
        NATOalpha('B');
        printNumberInWord(1);
    }

}
