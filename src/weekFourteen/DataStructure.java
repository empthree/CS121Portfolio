
/* 1. What is the purpose of generics in Java?
Generics allow for a class or method to be customized to whatever type the programmer is using.

    2. How can generics be used in Java programming?
Generic methods can be used to simplify your code. Instead of overloading methods, you could write a generic method that handles multiple different types.

    3. What are the pros and cons of using generics?
Generics allow for your code to be more concise and efficient. However, generics have limited support for primitive types (boxing, unboxing). */

package weekFourteen;

import java.util.*;
public class DataStructure <T> {
    // array generalized to T
    final private int SIZES = 3;
    private ArrayList<T> studentList = new ArrayList<>();
    private T[] ageList = (T[]) new Object[SIZES];


    private HashMap<T, T> majorGpaMap = new HashMap<>();
    private LinkedList<T> nationalityList = new LinkedList<>();
    private Stack<T> hometownStack = new Stack<>();
    private Queue<T> homeStateQueue = new LinkedList<>();

    // student

    public void addStudent(T name) {
        studentList.add(name);
    }
    public void removeStudent(T name) {
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

    public void addAge(T age) {
        if (ageIndex < ageList.length) {
            ageList[ageIndex++] = age;
        }
    }
    public void removeAge() {
        if (ageIndex > 0) {
            ageList[--ageIndex] = null;
        }
    }
    public void printAge() {
        System.out.println("\nAges: ");
        for (Object age : ageList){
            System.out.println(age);
        }
        System.out.println();
    }

    // GPA

    public void addGPA(T name, T GPA) {
        majorGpaMap.put(name, GPA);
    }
    public void removeGPA(T GPAName) {
        if (majorGpaMap.containsKey(GPAName)){
            majorGpaMap.remove(GPAName);
        }
    }
    public void printGPA() {
        System.out.println("\nGPAs:");
        System.out.println(majorGpaMap);
    }

    // nationality

    public void addNationality(T nationality) {
        nationalityList.add(nationality);
    }
    public void removeNationality(T nationality) {
        if (nationalityList.contains(nationality)) {
            nationalityList.remove(nationality);
        } else System.err.println("Error! The nationality you entered does not exist.");
    }
    public void printNationality(){
        System.out.println("\nNationalities:");
        System.out.println(nationalityList);
    }

    // homestack
    public void pushStack(T hometown){
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

    public void addQueue(T townhome){
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
