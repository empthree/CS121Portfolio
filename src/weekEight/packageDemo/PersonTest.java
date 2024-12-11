package weekEight.packageDemo;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person("Joe Brooks", "Green", 30, "Center", "Boots");

        System.out.println("Name: " + person.name);
        System.out.println("Favorite Color: " + person.favoriteColor);
        System.out.println("Age: " + person.getAge());
        System.out.println("Road Name: " + person.getRoad());
        System.out.println("Cat Name: " + person.getCatName());
    }
}
