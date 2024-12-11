package projectTwo;

import java.util.Random;
import java.util.Scanner;

public class TestScores {

    public static void main(String[] args) {

        // variables

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        final int SIZE = random.nextInt(4, 10);

        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        // scores

        System.out.printf("\nPlease enter your %d test scores.\n", SIZE);
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter the score for test " + (i + 1) + ": ");
            testScores[i] = scanner.nextInt();
        }

        // scores to letters

        for (int i = 0; i < SIZE; i ++){
            letterGrades[i] = getLetterGrade(testScores[i]);
        }

        // calls

        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);

    }

    // getLetterGrade

    private static char getLetterGrade(int score){

        if (score >= 90){
            return 'A';
        }
        else if (score >= 80) {
            return 'B';
        }
        else if (score >= 70) {
            return 'C';
        }
        else if (score >= 60) {
            return 'D';
        }
        else {
            return 'F';
        }
    }

    // printGrades

    private static void printGrades(int[] testScores, char[] letterGrades){

        System.out.printf("\n%-15s %-15s%n\n", "-Score-", "-Grade-");
        for (int i = 0; i < testScores.length; i++) {
            System.out.printf("%-15d %-15c%n", testScores[i], letterGrades[i]);
        }
    }

    // printHighestScore

    private static void printHighestScore(int[] testScores){
        int highestScore = testScores[0];
        for (int score : testScores){
            if (score > highestScore){
                highestScore = score;
            }
        }
        System.out.printf("\nThe highest score is %d", highestScore);
    }

    // printLowestScore

    private static void printLowestScore(int[] testScores){
        int lowestScore = testScores[0];
        for (int score : testScores){
            if (score < lowestScore){
                lowestScore = score;
            }
        }
        System.out.printf("\nThe lowest score is %d", lowestScore);
    }

    // printAverageScore

    private static void printAverageScore(int [] testScores){
        int scoresSum = 0;
        for (int score : testScores){
            scoresSum += score;
        }
        double average = (double) scoresSum /testScores.length;
        System.out.printf("\nAverage: %.1f", average);
    }
}
