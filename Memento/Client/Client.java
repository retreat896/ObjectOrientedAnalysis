package Memento.Client;
import java.util.*;

import Memento.Game.Game;
import Memento.Game.Caretaker;

public class Client {

    public static void printState(Game game){
        System.out.println("Game Score: " + game.score);
        System.out.println("Options: ");
        for(String option : game.getOptions()) {
            System.out.println(option);
        }
    }
    public static void main(String[] args) {
        // Clear console
        System.out.print("\033[H\033[2J");

        // Create game
        Game game = new Game();// Originator

        // Add options
        game.addOption("Level 1");
        // Increase score
        game.increaseScore();
        game.increaseScore();
        game.increaseScore();

        // Create Caretaker
        Caretaker caretaker = new Caretaker(game); // Caretaker

        // Save game state and print
        System.out.println("Saving game state using Caretaker to index 0");
        caretaker.save();

        // change game options and score and print
        game.addOption("Level 2");
        for(int i = 0; i < 3; i++){
            game.increaseScore();
        }
        printState(game);
        System.out.println("");

        // Save another game state and print
        System.out.println("Saving game state using Caretaker to index 1");
        System.out.println("");
        caretaker.save();
        // Restore game state and print
        System.out.println("Restoring game state using Caretaker to index 0,");
        caretaker.restore(0);
        printState(game);
        System.out.println("");

        // Restore game state and print
        System.out.println("Restoring game state using Caretaker to index 1");
        caretaker.restore(1);
        printState(game);
    }
}
