package weekTwo;

import javax.swing.*;

public class BookClubPoints {
    public static void main(String[] args) {

        int bookNumber, points;

        bookNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of books you have purchased this month: "));
        if (bookNumber == 0){
            points = 0;
            JOptionPane.showMessageDialog(null, String.format("Your points: %d", points));
        }
        else if (bookNumber == 1){
            points = 5;
            JOptionPane.showMessageDialog(null, String.format("Your points: %d", points));
        }
        else if (bookNumber == 2){
            points = 15;
            JOptionPane.showMessageDialog(null, String.format("Your points: %d", points));
        }
        else if (bookNumber == 3){
            points = 30;
            JOptionPane.showMessageDialog(null, String.format("Your points: %d", points));
        }
        else if (bookNumber >= 4){
            points = 60;
            JOptionPane.showMessageDialog(null, String.format("Your points: %d", points));
        }







    }
}
