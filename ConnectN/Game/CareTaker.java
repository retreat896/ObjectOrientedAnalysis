package ConnectN.Game;

import ConnectN.Game.ConnectN;
import ConnectN.Game.ConnectN.GameState;
import java.util.ArrayList;
import java.util.List;


public class CareTaker {
    private List<GameState> gameStates;
    private ConnectN game;

    public CareTaker(ConnectN game){
        this.game = game;
        gameStates = new ArrayList<>();
    }

    public void save(){
        GameState curState = game.save();
        gameStates.add(curState);
    }

    public void restore(int index){
        GameState restoredState = gameStates.get(index);
        game.restore(restoredState);
    }
}

