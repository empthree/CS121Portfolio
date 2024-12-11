package weekTwo;

import javax.swing.*;

public class TestScores {
    public static void main(String[] args) {

        int scoreOne, scoreTwo, scoreThree, average;

        scoreOne = Integer.parseInt(JOptionPane.showInputDialog("Please enter the first score: "));
        scoreTwo = Integer.parseInt(JOptionPane.showInputDialog("Please enter the second score: "));
        scoreThree = Integer.parseInt(JOptionPane.showInputDialog("Please enter the third score: "));

        average = (scoreOne + scoreTwo + scoreThree) / 3;

        if (average >= 90 && average <= 100){
            JOptionPane.showMessageDialog(null, String.format("Score average: %d\nLetter grade: %s", average, "A"));
        }
        else if (average >= 80 && average <= 89){
            JOptionPane.showMessageDialog(null, String.format("Score average: %d\nLetter grade: %s", average, "B"));
        }
        else if (average >= 70 && average <= 79){
            JOptionPane.showMessageDialog(null, String.format("Score average: %d\nLetter grade: %s", average, "C"));
        }
        else if (average >= 60 && average <= 69){
            JOptionPane.showMessageDialog(null, String.format("Score average: %d\nLetter grade: %s", average, "D"));
        }
        else if (average < 60){
            JOptionPane.showMessageDialog(null, String.format("Score average: %d\nLetter grade: %s", average, "F"));
        }
    }
}
