package ArrayListDemo;

public class SystemTest {
    public static void main(String[] args) {

        SystemManagement sys = new SystemManagement();

        sys.addItems("Alice", "Jones", 23);
        sys.addItems("John", "Pork", 33);
        sys.addItems("Jane", "Parker",14);

        System.out.println("For Each loop:");
        sys.displayEach();
        System.out.println("Standard For loop:");
        sys.displayFor();

        sys.removeItems(2);
        System.out.println("Updated list size: " + sys.getSize());

        System.out.println(sys.getElement(3));

        sys.displayFor();
    }
}
