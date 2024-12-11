package weekSix.labSix;

import java.util.Scanner;

public class Rectangle {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double length, width, area;

        length = getLength();
        width = getWidth();
        area = getArea(length, width);
        displayData(length, width, area);

        scan.close();
    }
    public static double getLength() {
        System.out.print("Please enter the rectangle's length: ");
        double length = scan.nextDouble();
        return length;
    }
    public static double getWidth() {
        System.out.print("Please enter the rectangle's width: ");
        double width = scan.nextDouble();
        return width;
    }
    public static double getArea(double width, double length) {
        double area = length * width;
        return area;
    }
    public static void displayData(double length, double width, double area) {
        System.out.println("Rectangle length: " + length + "\n" +
                "Rectangle width: " + width + "\n" +
                "Rectangle area: " + area + "\n");
    }
}
