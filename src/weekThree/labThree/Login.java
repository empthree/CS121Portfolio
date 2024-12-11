package weekThree.labThree;
import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        //joptionpane
        String userName = ("computer");
        String password = ("arachnid");
        String  name, pw;

        name = String.format(JOptionPane.showInputDialog("Enter user name plz"));
        pw = String.format(JOptionPane.showInputDialog("Plz enter password"));

        if (name.equals(userName)){
            if (pw.equals(password)){
                JOptionPane.showMessageDialog(null,"Welcome to CS 121!");
            }
            else JOptionPane.showMessageDialog(null, "Incorrect Password");
        }
        else if (password.equals(pw)){
            JOptionPane.showMessageDialog(null, "Incorrect user name");
        }
        else JOptionPane.showMessageDialog(null,"Both user name and password incorrect.");


    }
}
