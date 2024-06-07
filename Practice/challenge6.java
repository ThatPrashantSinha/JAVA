package Practice;

public class challenge6 {
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
    public static void main(String[] args) {
        NATOalpha('B');
    }
}