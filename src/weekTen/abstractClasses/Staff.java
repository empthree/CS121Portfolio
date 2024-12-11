package weekTen.abstractClasses;

public class Staff extends User {
    private String role;

    public Staff(String name, String contactNumber, String email, String password, String role) {
        super(name, contactNumber, email, password);
        this.role = role;
    }

    @Override
    public String getUserDetails() {
        return "Staff: " + name + ", Contact: " + contactNumber + ", Email: " + email + ", Role: " + role;
    }
}

