package weekTwelve.fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        // create a file instance
        File fileOutput = new File("TestingFileWrite.txt");
        // syntax:
        // try{}catch(){}
        try {
            // create a scanner object
            Scanner console = new Scanner(fileOutput);
            String header = console.nextLine();
            System.out.printf("%s", header); // displays header
            while (console.hasNextLine()) {
                String name = console.next();
                String password = console.next();
                String playerCharacter = console.next();
                int score = Integer.parseInt(console.next());
                double winningPercentage = Double.parseDouble(console.next());

                System.out.printf("%n %-20s %-20s %6d %23s %15.2f", name, password, score, playerCharacter, winningPercentage);
            }
            console.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
