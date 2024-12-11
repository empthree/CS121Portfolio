package weekTwelve.labEleven;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    private Pokedex pokedex;

    Scanner scan = new Scanner(System.in);

    public Menu() {
        this.pokedex = new Pokedex();
    }

    public void displayMenu() {

        while (true) {
            System.out.println("\n***** MENU *****");
            System.out.println("Please make a selection:" +
                    "\n1) Add a Pokemon" +
                    "\n2) Remove a Pokemon" +
                    "\n3) Display Pokemon info" +
                    "\n4) Display all Pokemon info" +
                    "\n5) Exit");
            int userInput = scan.nextInt();

            if (userInput == 1) {
                createPokemon();
            } else if (userInput == 2) {
                deletePokemon();
            } else if (userInput == 3) {
                displayPokemon();
            } else if (userInput == 4) {
                displayAllPokemon();
            } else if (userInput == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid entry. Please select a valid option.");
            }
        }
    }

    private void createPokemon() {
        // 1 is manual, 2 is file reading
        System.out.println("Would you like to 1: enter Pokemon details manually? \n2: select from file?");
        int choice = scan.nextInt();
        if (choice == 1) {
            System.out.println("Please enter your Pokemon's name: ");
            String name = scan.next();

            System.out.printf("Please enter %s's HP: ", name);
            int pokeHP = scan.nextInt();

            Pokemon pokemon = new Pokemon(name, pokeHP);
            addMovesToPokemon(pokemon);
            pokedex.addPokemon(pokemon);
            System.out.printf("%s added to Pokedex!\n\n", name);

        } else if (choice == 2) {
            FileRead fileReader = new FileRead();
            ArrayList<String[]> pokemonData;
            try {
                pokemonData = fileReader.readPokemonData("C:\\Users\\emmab\\IdeaProjects\\ec ca 0\\src\\weekTwelve\\labEleven\\CharacterStatsFile (1).txt");
                if (pokemonData.isEmpty()) {
                    System.out.println("No Pokemon data available in file.");
                    return;
                }
                for (int i = 0; i < pokemonData.size(); i++) {
                    System.out.printf("%d : %s", (i + 1), pokemonData.get(i)[0]);
                }
                int selectedIndex = scan.nextInt() - 1;
                if (selectedIndex >= 0 && selectedIndex < pokemonData.size()) {
                    String[] selectedPokemonData = pokemonData.get(selectedIndex);
                    String name = selectedPokemonData[0];
                    int pokeHP = Integer.parseInt(selectedPokemonData[1]);
                    String moveName = selectedPokemonData[2];
                    int movePower = Integer.parseInt(selectedPokemonData[3]);
                    int moveSpeed = Integer.parseInt(selectedPokemonData[4]);
                    Pokemon pokemon = new Pokemon(name, pokeHP);
                    Move move = new Move(moveName, movePower, moveSpeed);
                    pokemon.addMove(move);

                    pokedex.addPokemon(pokemon);
                    System.out.println("The pokemon has been added to the Pokedex from the file data.");
                } else {
                    System.err.println("Invalid selection!");
                }
            } catch (FileNotFoundException e) {
                System.err.println("ERROR: Pokemon data file not found!");
            }
        } else {
            System.err.println("Invalid input! Please select 1 or 2.");
        }
    }

    private void deletePokemon() {

        System.out.println("Enter the name of the Pokemon you wish to delete.");

        String name = scan.next();

        Pokemon deletePoke = pokedex.getPokemon(name);
        if (deletePoke != null) {
            pokedex.removePokemon(deletePoke);
            System.out.printf("\n%s has been removed from the Pokedex!\n\n", name);
        } else {
            System.out.println("Pokemon not found!");
        }
    }

    private void displayPokemon() {
        System.out.println("Enter the name of the Pokemon you wish to display: ");
        String name = scan.next();
        Pokemon pokemon = pokedex.getPokemon(name);
        if (pokemon == null) {
            System.out.println("Pokemon not found!");
        } else {
            System.out.println(pokemon);
        }
    }

    private void displayAllPokemon() {
        ArrayList<Pokemon> pokemonArrayList = pokedex.getAllPokemon();
        if (pokemonArrayList.isEmpty()) {
            System.out.println("No Pokemon in the Pokedex!");
            return;
        }
        System.out.println("All Pokemon in the Pokedex");
        for (Pokemon pokemon : pokemonArrayList) {
            System.out.printf("Name: %s", pokemon.getName());
            System.out.printf("HP: %d", pokemon.getHp());
            ArrayList<Move> movesArrayList = pokemon.getMoveArrayList();
            if (movesArrayList.isEmpty()) {
                System.out.println("No moves available for this Pokemon.");
            } else {
                System.out.println("Moves:");
                for (Move move : movesArrayList) {

                    System.out.printf("\t\t Move Name: %s", move.getMoveName());
                    System.out.printf("\t\t Move Power: %d", move.getMovePower());
                    System.out.printf("\t\t Move Speed: %d", move.getMoveSpeed());
                }
            }
            System.out.println();
        }






        System.out.println("\n***** Pokedex *****");
        for (Pokemon pokemon : pokedex.getAllPokemon()) {
            System.out.println();
            System.out.println(pokemon);
        }
    }
    private void addMovesToPokemon(Pokemon pokemon){
        while (true) {
            System.out.println("Please enter the name of a move, or 'q' if finished.");
            String moveName = scan.next();

            if (moveName.equalsIgnoreCase("q")) {
                break;

            } else {
                System.out.printf("Please enter %s's power: ", moveName);
                int power = scan.nextInt();

                System.out.printf("Please enter %s's speed: ", moveName);
                int speed = scan.nextInt();

                Move move = new Move(moveName, power, speed);
                pokemon.addMove(move);
            }
        }
    }
}
