package weekTen.abstractClasses;

public class Customer extends User {
    private String reservationDetails;

    public Customer(String name, String contactNumber, String email, String password, String reservationDetails) {
        super(name, contactNumber, email, password);
        this.reservationDetails = reservationDetails;
    }

    @Override
    public String getUserDetails() {
        return "Customer: " + name + ", Contact: " + contactNumber + ", Email: " + email + ", Reservation: " + reservationDetails;
    }
}
