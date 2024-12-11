package projectOne;
import java.util.Scanner;
import java.util.Random;
public class CharacterBattle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int rounds;

        // determine rounds

        System.out.println("\n--- The game begins! A roll-off will determine who chooses the length of the game. ---\n");

        while (true) {
            int p1Roll = random.nextInt(6) + 1;
            int p2Roll = random.nextInt(6) + 1;

            System.out.println("Player 1 rolled: " + p1Roll);
            System.out.println("Player 2 rolled: " + p2Roll);

            if (p1Roll > p2Roll) {
                System.out.println("\nPlayer 1 wins the roll-off!");
                System.out.println("Player 1, choose an ODD number of rounds:\n");
                rounds = scan.nextInt();
                break;
            } else if (p1Roll < p2Roll) {
                System.out.println("\nPlayer 2 wins the roll-off!");
                System.out.println("Player 2, choose an ODD number of rounds:\n");
                rounds = scan.nextInt();
                break;
            } else
                System.out.println("\n--- A tie! Roll again! ---\n");
        }


        // battle loop

        int p1Win = 0;
        int p2Win = 0;

        for (int round = 1; round <= rounds; round++) {

            // player 1

            System.out.println("\n--- Player 1 Character Creation ---");
            System.out.println("Player 1, enter your character name: ");
            String p1Name = scan.next();
            System.out.println("Enter " + p1Name + "'s HP: ");
            int p1HP = scan.nextInt();
            System.out.println("Enter the name of " + p1Name + "'s ability: ");
            String p1Ability = scan.next();
            System.out.println("Enter " + p1Ability + "'s damage: ");
            int p1AP = scan.nextInt();
            System.out.println("Enter " + p1Name + "'s attack speed: ");
            int p1Speed = scan.nextInt();

            // player 2

            System.out.println("\n--- Player 2 Character Creation ---");

            System.out.println("Player 2, enter your character name: ");
            String p2Name = scan.next();
            System.out.println("Enter " + p2Name + "'s HP: ");
            int p2HP = scan.nextInt();
            System.out.println("Enter the name of " + p2Name + "'s ability: ");
            String p2Ability = scan.next();
            System.out.println("Enter " + p2Ability + "'s damage: ");
            int p2AP = scan.nextInt();
            System.out.println("Enter " + p2Name + "'s attack speed: ");
            int p2Speed = scan.nextInt();
            System.out.println("\n--- Round " + round + " ---\n");

            int p1HPCUR = p1HP;
            int p2HPCUR = p2HP;

            while (p1HPCUR > 0 && p2HPCUR > 0) {

                if (p1Speed > p2Speed) {
                    System.out.println("Player 1 has higher speed, so they will attack first.");
                    System.out.println(p1Name + " used " + p1Ability + "! It deals " + p1AP + " damage to " + p2Name + ".");
                    p2HPCUR -= p1AP;

                    if (p2HPCUR <= 0) {
                        System.out.println("Player 1 and " + p1Name + " win the round!");
                        p1Win++;
                        break;
                    }
                    System.out.println(p2Name + " used " + p2Ability + "! It deals " + p2AP + " damage to " + p1Name + ".");
                    p1HPCUR -= p2AP;

                    if (p1HPCUR <= 0) {
                        System.out.println("Player 2 and " + p2Name + " win the round!");
                        p2Win++;
                        break;
                    }
                } else {

                    System.out.println(p2Name + " used " + p2Ability + "! It deals " + p2AP + " damage to " + p1Name + ".");
                    p1HPCUR -= p2AP;

                    if (p1HPCUR <= 0) {
                        System.out.println("Player 2 and " + p2Name + " win the round!");
                        p2Win++;
                        break;
                    }
                    System.out.println(p1Name + " used " + p1Ability + "! It deals " + p1AP + " damage to " + p2Name + ".");
                    p2HPCUR -= p1AP;

                    if (p2HPCUR <= 0) {
                        System.out.println("Player 1 and " + p1Name + " win the round!");
                        p1Win++;
                        break;
                    }
                }

                if (p1Speed == p2Speed) {
                    System.out.println("The attack speed is the same for both " + p1Name + " and " + p2Name + ".");
                    System.out.println("A coin toss will determine who attacks first. Player 1 is heads, Player 2 is tails.");
                    int flip = random.nextInt(2);
                    if (flip == 0) {
                        System.out.println("The coin shows heads. Player 1 wins the coin flip!");
                        p2HPCUR -= p1AP;
                        System.out.println(p1Name + " used " + p1Ability + "! It deals " + p1AP + " damage to " + p2Name + ".");
                        if (p2HPCUR <= 0) {
                            System.out.println("Player 1 and " + p1Name + " win the round!");
                            p1Win++;
                            break;
                        } else
                            System.out.println("The coin shows tails. Player 2 wins the coin flip!");
                        p1HPCUR -= p2AP;
                        System.out.println(p2Name + " used " + p2Ability + "! It deals " + p2AP + " damage to " + p1Name + ".");
                        if (p1HPCUR <= 0) {
                            System.out.println("Player 2 and " + p2Name + " win the round!");
                            p2Win++;
                            break;
                        }
                    }

                }
                //HP check
                System.out.println(p1Name + "'s HP: " + p1HPCUR);
                System.out.println(p2Name + "'s HP: " + p2HPCUR);
            }
        }
        System.out.println("\n--- Score ---\n");
        System.out.println("Player 1 wins: " + p1Win);
        System.out.println("Player 2 wins: " + p2Win);

        System.out.println("\n--- Winner! ---\n");
        if (p1Win > p2Win) {
            System.out.println("Player 1 wins! Points: " + p1Win);
        } else {
            System.out.println("Player 2 wins! Points: " + p2Win);

        }
    }
}






