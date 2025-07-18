import java.util.NavigableSet;
import java.util.TreeSet;

public class Theatre{
    public class Seat implements Comparable<Seat>{
        private String row;
        private int seatNumber;
        private boolean isReserved;

        public Seat(String row, int seatNumber){
            this.row = row;
            this.seatNumber = seatNumber;
            isReserved = false;
        }

        @Override
        public int compareTo(Theatre.Seat o) {
            int rowCompare = this.row.compareTo(o.row);
            if (rowCompare == 0) {
                return Integer.compare(this.seatNumber, o.seatNumber);
            }
            return rowCompare;
        }
    }

    private String name;
    private int seatsInEachRow;
    private NavigableSet<Seat> theSeats = new TreeSet<>();

    public Theatre(String name, int noOfRows, int totalSeats) {
        this.name = name;
        seatsInEachRow = totalSeats / noOfRows;
        char rowName = 'A';
        for (int i = 1; i <= totalSeats; i++) {
            theSeats.add(new Seat(Character.toString(rowName), (i % seatsInEachRow)+ 1));
            if(i % seatsInEachRow == 0) rowName++;
        }
    }

    public void printSeatMap(){
        System.out.printf("%35s%n%n","__________SCREEN__________");
        String currentRow = "A";
        for (Seat seat : theSeats) {
            if(!currentRow.equals(seat.row)) System.out.println();
            System.out.print((seat.isReserved ? " >" : "||") + seat.row + "%03d".formatted(seat.seatNumber) + (seat.isReserved ? "< " : "||"));
            currentRow = seat.row;
        }
        System.out.println();
    }
    public void bookSeat(String seatNumber){
        String row = Character.toString(seatNumber.charAt(0));
        int number = Integer.valueOf(seatNumber.substring(1));
        for (Seat seat : theSeats) {
            if(row.equals(seat.row) && number == seat.seatNumber) seat.isReserved = true;
        }
        printSeatMap();
    }
}
