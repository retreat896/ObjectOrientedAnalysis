package Memento.Game;

import java.util.ArrayList;
import java.util.List;

import Memento.Game.Game;
import Memento.Game.Game.GameState;

public class Caretaker {

    private List<Game.GameState> gameStates;

    private Game game;

    public Caretaker(Game game){
        this.game = game;
        gameStates = new ArrayList<>();
    }
    public void save(){

        Game.GameState curState = game.save();

        gameStates.add(curState);
    }

    public void restore(int index){
        Game.GameState restoredState = gameStates.get(index);
        game.restore(restoredState);
    }
}
