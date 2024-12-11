package weekFourteen;

public class Main {
    public static void main(String[] args) {
        weekFourteen.DataStructure generic = new DataStructure();

        //add

        //student
        generic.addStudent("John");
        generic.addStudent("Caitlyn");
        generic.addStudent("Pete");
        //age
        generic.addAge(30);
        generic.addAge(33);
        generic.addAge(94);
        //GPA
        generic.addGPA("Joe",3.32);
        generic.addGPA("Paul",2.63);
        generic.addGPA("Francis",1.44);
        //nationality
        generic.addNationality("White");
        generic.addNationality("Black");
        generic.addNationality("Latina");
        //pushStack
        generic.pushStack("Richmond");
        generic.pushStack("Lynn");
        generic.pushStack("Fishers");
        //addQueue
        generic.addQueue("Indianapolis");
        generic.addQueue("Winchester");
        generic.addQueue("Williamsburg");

        //display

        System.out.println("\n*** Information ***");
        generic.printStudent();
        generic.printAge();
        generic.printGPA();
        generic.printNationality();
        generic.printStack();
        generic.printQueue();

        //remove

        generic.removeStudent("John");
        generic.removeAge();
        generic.removeGPA("Joe");
        generic.removeNationality("White");
        generic.popStack();
        generic.removeQueue();

        //updated display

        System.out.println("\n*** Updated Information ***");
        generic.printStudent();
        generic.printAge();
        generic.printGPA();
        generic.printNationality();
        generic.printStack();
        generic.printQueue();
    }
}
