package linkedListActivity;

public class Main {
    public static void main(String[] args) {

        FlightReservation res1 = new FlightReservation("Alan White", "ABC123", "12S");
        FlightReservation res2 = new FlightReservation("Joe Cox", "FFC102", "3D" );

        res1.addReservation("Flight ABC123, Seat 12S");
        res1.addReservation("Flight BCS040, Seat 19F");
        res1.addReservation("Flight FEF333, Seat 9P");

        res2.addReservation("Flight AKD305, Seat 23F");
        res2.addReservation("Flight FFC102, Seat 3D");
        res2.addReservation("Flight BLS930, Seat 26V");

        System.out.println(res1.getReservationInfo());
        res1.displayReservationHistory();

        System.out.println();
        System.out.println(res2.getReservationInfo());
        res2.displayReservationHistory();

        res1.removeReservation();
        res2.removeReservation();

        System.out.println("\nNew Reservations:");
        res1.displayReservationHistory();
        System.out.println();
        res2.displayReservationHistory();

    }
}
