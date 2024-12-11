package weekThree;

import javax.swing.*;

public class RestaurantSelector {
    public static void main(String[] args) {

        String vegetarian, vegan, glutenFree;

        vegetarian = String.format(JOptionPane.showInputDialog("Is anyone in your party a vegetarian?"));
        vegan = String.format(JOptionPane.showInputDialog("Is anyone in your party a vegan?"));
        glutenFree = String.format(JOptionPane.showInputDialog("Is anyone in your party gluten-free?"));

        if ((vegetarian.equals("yes")) && (vegan.equals("yes")) && (glutenFree.equals("yes"))) {
            JOptionPane.showMessageDialog(null, "Here are your options: \nCorner Cafe\n The Chef's Kitchen");
        }
        else if ((vegetarian.equals("no")) && (vegan.equals("no")) && (glutenFree.equals("no"))) {
            JOptionPane.showMessageDialog(null, "Here are your options: Joe's Gourmet Burgers");
        }
        else if ((vegetarian.equals("yes")) && (vegan.equals("no")) && (glutenFree.equals("yes"))) {
            JOptionPane.showMessageDialog(null, "Here are your options: Main Street Pizza Company");
        }
        else if ((vegetarian.equals("yes")) && (vegan.equals("no")) && (glutenFree.equals("no"))) {
            JOptionPane.showMessageDialog(null, "Here are your options: Mama's Fine Italian");
        }
        else JOptionPane.showMessageDialog(null, "No options available.");
    }
}
