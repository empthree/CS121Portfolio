package ArrayListDemo;
import java.util.ArrayList;

public class SystemManagement {

    private ArrayList<String> firstName = new ArrayList<>();
    private ArrayList<String> lastName = new ArrayList<>();
    private ArrayList<Integer> ageList = new ArrayList<>();

    public SystemManagement() {
    }

    // adding
    public void addItems(String first, String last, int age) {
        firstName.add(first);
        lastName.add(last);
        ageList.add(age);
    }

    // removing
    public void removeItems(int num) {
        if (num < firstName.size()) {
            firstName.remove(num);
            lastName.remove(num);
            ageList.remove(num);
        } else {
            System.out.println("Invalid option. Choose again.");
        }
    }

    public int getSize() {
        return firstName.size();
    }

    public String getElement(int index) {
        if (index >= 0 && index < firstName.size()) {
            return "First Name: " + firstName.get(index) + "\nLast Name: " + lastName.get(index) + "\nAge: " + ageList.get(index);
        } else {
            return "Index invalid.";
        }
    }

    public void displayEach() {

        for (String first : firstName) {
            System.out.println(first + " ");
        }
        System.out.println();
        for (String last : lastName) {
            System.out.println(last + " ");
        }
        System.out.println();
        for (int age : ageList) {
            System.out.println(age + " ");
        }
        System.out.println();
    }

    public void displayFor(){

        for (int i = 0; i < firstName.size(); i++){
            System.out.println("First Name: " + firstName.get(i) + "\nLast Name: " + lastName.get(i) + "\nAge: " + ageList.get(i));

        }
    }
}

