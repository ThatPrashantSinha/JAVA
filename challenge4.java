public class challenge4 {
    public static double connvertToCentimeters(int inches) {
        return (double)(inches*2.54);
    }
    public static double connvertToCentimeters(int height, int inches) {
        return connvertToCentimeters(((height*12)+inches));
    }
    public static void main(String[] args) {
        System.out.println(connvertToCentimeters(5,9));
    }
}
