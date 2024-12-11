package weekFour;

public class CFTable {
    public static void main(String[] args) {

        int startTemp = 0;
        int endTemp = 20;

        System.out.printf("%-10s %-12s%n", "Celsius", "Fahrenheit");
        for (int c = startTemp; c <= endTemp; c++){
            double f = (c * 9.0/5.0) + 32;
            System.out.printf("%-10d %-12.1f%n", c, f);
        }
    }
}
