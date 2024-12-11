package weekTen.abstractClasses;

public class TestAbstractClasses {
    public static void main(String[] args) {
        User customer = new Customer("Alice", "123-456-7890", "alice@example.com", "pass123", "Table for 2 at 7 PM");
        User staff = new Staff("Bob", "098-765-4321", "bob@example.com", "pass456", "Manager");

        System.out.println(customer.getUserDetails());
        System.out.println(staff.getUserDetails());
    }
}
