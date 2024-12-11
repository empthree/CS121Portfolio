package weekTwo;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class WordGame {
    public static void main(String[] args) {
        // variables
        String name = showInputDialog("Please enter your name: ");
        String city = showInputDialog("Please enter your hometown: ");
        String college = showInputDialog("Please enter the name of your university: ");
        String major = showInputDialog("Please enter the name of your major: ");
        String band = showInputDialog("Please enter your favorite band's name: ");
        String hobby = showInputDialog("Please enter your favorite hobby: ");

        String message = String.format("There once was a student named %s. They are from %s and attend %s to study %s. They like to listen to %s and they enjoy %s.", name, city, college, major, band, hobby);
        // display
        JOptionPane.showMessageDialog(null, message);

    }
}
