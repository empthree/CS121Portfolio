package weekTwelve.labEleven;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        // syntax: try{}catch(){}
        try{
            // create instances
            FileWriter fileWriter = new FileWriter("TestingFileWrite.txt",true);
            PrintWriter output = new PrintWriter(fileWriter);

            // declare variables
            String name = JOptionPane.showInputDialog("Enter the user's name:");
            String password = JOptionPane.showInputDialog("Enter the user's password:");
            String playerCharacter = JOptionPane.showInputDialog("Enter the user's character:");
            int score = Integer.parseInt(JOptionPane.showInputDialog("Enter the user's score:"));
            double winningPercentage = Double.parseDouble(JOptionPane.showInputDialog("Enter the user's winning percentage:"));

            // write to the file
            output.printf("%n %-20s %-20s %6d %23s %15.2f", name, password, score, playerCharacter, winningPercentage);

            // close
            fileWriter.close();
            output.close();

        }catch(FileNotFoundException e){
            System.err.println("Your file wasn't found. L");
        }
    }
}
