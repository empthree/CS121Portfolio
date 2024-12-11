package weekTen.interfaces;

public class CustomerInteractable implements Interactable {
    @Override
    public void interact() {
        System.out.println("Customer is reserving a table and placing an order.");
    }
}
