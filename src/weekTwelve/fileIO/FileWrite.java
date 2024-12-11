package weekTwelve.fileIO;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        // creating an instance
        File outputFile = new File("TestingFileWrite.txt");
        PrintWriter output = new PrintWriter(outputFile);
        Scanner scan = new Scanner(System.in);

        // header
        // %s --> String
        output.printf("%-20s %-20s %-17s %-20s %-20s","<User Name>", "<Password>", "<Score>", "<Player Character>", "<Winning Percentage>");


        // declare variables
        String name, password, playerCharacter;
        int score;
        double winningPercentage;

        // prompt the user
        for(int i = 0; i < 2; i++){
            //string

            name = JOptionPane.showInputDialog(String.format("Enter user %d's user name:", (i + 1)));
            password = JOptionPane.showInputDialog(String.format("Enter user %d's password:", (i + 1)));
            playerCharacter = JOptionPane.showInputDialog(String.format("Enter user %d's character:", (i + 1)));

            // integer
            score = Integer.parseInt(JOptionPane.showInputDialog(String.format("Enter user %d's score:", (i + 1))));

            // double
            winningPercentage = Double.parseDouble(JOptionPane.showInputDialog(String.format("Enter user %d's winning percentage:", (i + 1))));

            // write to file
            output.printf("%n %-20s %-20s %6d %23s %15.2f", name, password, score, playerCharacter, winningPercentage);
        }
        scan.close();
        output.close(); // close the PrintWriter
    }

}
