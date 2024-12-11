package weekEight.packageDemo;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String major;
    private String studentID;

    public Student(String firstName, String lastName, int age, String major, String studentID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
        this.studentID = studentID;
    }
    public String getStudentID(){
        return studentID;
    }
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }

}
