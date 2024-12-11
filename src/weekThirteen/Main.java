package weekThirteen;

public class Main {
    public static void main(String[] args) {
        DataStructure datStr = new DataStructure();

        //add

        //student
        datStr.addStudent("John");
        datStr.addStudent("Caitlyn");
        datStr.addStudent("Pete");
        //age
        datStr.addAge(30);
        datStr.addAge(14);
        datStr.addAge(94);
        //GPA
        datStr.addGPA("Joe",3.32);
        datStr.addGPA("Paul",2.63);
        datStr.addGPA("Francis",1.44);
        //nationality
        datStr.addNationality("White");
        datStr.addNationality("Black");
        datStr.addNationality("Latina");
        //pushStack
        datStr.pushStack("Richmond");
        datStr.pushStack("Lynn");
        datStr.pushStack("Fishers");
        //addQueue
        datStr.addQueue("Indianapolis");
        datStr.addQueue("Winchester");
        datStr.addQueue("Williamsburg");

        //display

        System.out.println("\n*** Information ***");
        datStr.printStudent();
        datStr.printAge();
        datStr.printGPA();
        datStr.printNationality();
        datStr.printStack();
        datStr.printQueue();

        //remove

        datStr.removeStudent("John");
        datStr.removeAge();
        datStr.removeGPA("Joe");
        datStr.removeNationality("White");
        datStr.popStack();
        datStr.removeQueue();

        //updated display

        System.out.println("\n*** Updated Information ***");
        datStr.printStudent();
        datStr.printAge();
        datStr.printGPA();
        datStr.printNationality();
        datStr.printStack();
        datStr.printQueue();
    }
}
