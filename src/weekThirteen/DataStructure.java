package weekThirteen;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class DataStructure {
    private ArrayList<String> studentList = new ArrayList<>();
    private int[] ageList = new int[3];
    private HashMap<String, Double> majorGpaMap = new HashMap<>();
    private LinkedList<String> nationalityList = new LinkedList<>();
    private Stack<String> hometownStack = new Stack<>();
    private Queue<String> homeStateQueue = new LinkedList<>();

    // student
    public void addStudent(String name) {
        studentList.add(name);
    }
    public void removeStudent(String name) {
        if (studentList.contains(name)) {
            studentList.remove(name);
        } else System.err.println("Error! The student name you entered does not exist.");
    }
    public void printStudent() {
        System.out.println("\nStudents:");
        for (int i = 0; i < studentList.size(); i++) ;
        System.out.println(studentList);
    }

    // age
    int ageIndex = 0;

    public void addAge(int age) {
        if (ageIndex < ageList.length) {
            ageList[ageIndex++] = age;
        }
    }
    public void removeAge() {
        if (ageIndex > 0) {
            ageList[--ageIndex] = 0;
        }
    }
    public void printAge() {
        System.out.println("\nAges: ");
        for (int i = 0; i < ageList.length; i++) {
            System.out.print(ageList[i] + "  ");
        }
        System.out.println();
    }

    // GPA

    public void addGPA(String name, double GPA) {
        majorGpaMap.put(name, GPA);
    }
    public void removeGPA(String GPAName) {
        if (majorGpaMap.containsKey(GPAName)){
            majorGpaMap.remove(GPAName);
        }
    }
    public void printGPA() {
        System.out.println("\nGPAs:");
        System.out.println(majorGpaMap);
    }

    // nationality

    public void addNationality(String nationality) {
        nationalityList.add(nationality);
    }
    public void removeNationality(String nationality) {
        if (nationalityList.contains(nationality)) {
            nationalityList.remove(nationality);
        } else System.err.println("Error! The nationality you entered does not exist.");
    }
    public void printNationality(){
        System.out.println("\nNationalities:");
        System.out.println(nationalityList);
    }

    // homestack
    public void pushStack(String hometown){
        hometownStack.push(hometown);
    }
    public void popStack(){
        hometownStack.pop();
    }
    public void printStack(){
        System.out.println("\nHometown Stacks:");
        System.out.println(hometownStack);
    }

    // homequeue

    public void addQueue(String townhome){
        homeStateQueue.offer(townhome);
    }
    public void removeQueue(){
        homeStateQueue.remove();
    }
    public void printQueue(){
        System.out.println("\nHometown Queues:");
        System.out.println(homeStateQueue);
    }
}
