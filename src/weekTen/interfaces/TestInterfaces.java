package weekTen.interfaces;

public class TestInterfaces {
    public static void main(String[] args) {
        Interactable customer = new CustomerInteractable();
        Interactable staff = new StaffInteractable();

        customer.interact();
        staff.interact();
    }
}
