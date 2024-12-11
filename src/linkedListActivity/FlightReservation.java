package linkedListActivity;

import java.util.LinkedList;

public class FlightReservation {

    private String passengerName;
    private String flightNumber;
    private String seatNumber;

    // LinkedList reservations

    private LinkedList<String> reservationHistory = new LinkedList<>();

    // constructor

    public FlightReservation(String passengerName, String flightNumber, String seatNumber) {

        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.reservationHistory = new LinkedList<>();
    }

    //methods

    public void addReservation(String reservationDetails){

        reservationHistory.add(reservationDetails);

    }

    public void removeReservation(){

        reservationHistory.removeFirst();

    }

    public String getReservationInfo(){
        return String.format("Passenger name: %s\nFlight number: %s\nSeat number: %s", passengerName, flightNumber, seatNumber);
    }

    public void displayReservationHistory(){
        for (String reservation : reservationHistory){
            System.out.println(reservation);
        }
    }
}


