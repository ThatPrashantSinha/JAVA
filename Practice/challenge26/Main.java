public class Main {
    public static void main(String[] args) {
        Theatre testTheatre = new Theatre("Prash", 10, 50);
        testTheatre.printSeatMap();
        System.out.println("----------------------------");
        testTheatre.bookSeat("D003");
        testTheatre.bookSeat("A001"); 
        testTheatre.bookSeat("J003");
        testTheatre.bookSeat("J004");
        testTheatre.bookSeat("F005");
    }
}
