package ConnectN.Client;

import ConnectN.Game.ConnectN;
import ConnectN.Game.CareTaker;

public class Client {
    public static void main(String[] args) {
        // Clear console
        System.out.print("\033[H\033[2J");

        // Create game
        ConnectN game = new ConnectN(6, 7, 4);// Originator

        // Create Caretaker
        CareTaker caretaker = new CareTaker(game); // Caretaker

        




    }
}
