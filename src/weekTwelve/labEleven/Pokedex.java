package weekTwelve.labEleven;

import java.util.ArrayList;

public class Pokedex {

    private ArrayList<Pokemon> pokemonArrayList = new ArrayList<>();

    // default constructor: public Pokedex() {} --don't need to write

    public void addPokemon(Pokemon pokemon) {
        pokemonArrayList.add(pokemon);
    }

    public void removePokemon(Pokemon pokemon) {
        pokemonArrayList.remove(pokemon);
    }

    public ArrayList<Pokemon> getAllPokemon() {
        return pokemonArrayList;
    }

    public Pokemon getPokemon(String pokemonName) {
        Pokemon foundPokemon = null;
        for (Pokemon pokemon : pokemonArrayList) {
            if (pokemon.getName().equals(pokemonName)) {
                foundPokemon = pokemon;
                break;
            }
        }
        return foundPokemon;
    }
}