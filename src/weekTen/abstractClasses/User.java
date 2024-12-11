package weekTen.abstractClasses;

public abstract class User {
    protected String name;
    protected String contactNumber;
    protected String email;
    protected String password;

    public User(String name, String contactNumber, String email, String password) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.password = password;
    }

    public abstract String getUserDetails();
}
