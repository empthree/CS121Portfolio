package weekEight.packageDemo;

public class Person {

    // instance variables

    public String name;
    public String favoriteColor;
    private int age;
    private String road;
    private String catName;

    // constructor

    public Person(String name, String favoriteColor, int age, String road, String catName){

        this.name = name;
        this.favoriteColor = favoriteColor;
        this.age = age;
        this.road = road;
        this.catName = catName;

    }

    public void displayInfo(){
        System.out.println("Name: " + name + "Favorite Color: " + favoriteColor);
    }

    private void displayAge(){
        System.out.println("Age: " + age);
    }

    protected void displayRoad(){
        System.out.println("Road Name: " + road);
    }

    void displayCat(){
        System.out.println("Cat Name: " + catName);
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getRoad(){
        return road;
    }

    public void setRoad(String road){
        this.road = road;
    }

    public String getCatName(){
        return catName;
    }

    public void setCatName(String catName){
        this.catName = catName;
    }
}
