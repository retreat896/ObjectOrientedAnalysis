package Memento.Game;
import java.util.List;
import java.util.ArrayList;

//the originator, the class has some states.
public class Game {
    public int score;

    private List<String> options;

    public Game(){
        options = new ArrayList<>();
    }

    public void increaseScore(){
        score++;
    }
    
    public void addOption(String option){
        options.add(option);
    }

    public List<String> getOptions(){
        return options;
    }

    protected GameState save(){
        List<String> copyList = new ArrayList<>();
        for(String option : options){
            copyList.add(option);
        }
        return new GameState(score, copyList);
    }

    public static class GameState{
        private int score;
        private List<String> options;

        public GameState(int score, List<String> options){
            this.score = score;
            this.options = new ArrayList<>(options);
        }
    }

    protected void restore(GameState state){
        score = state.score;
        options = new ArrayList<>();

        for(String option : state.options){
            options.add(option);
        }
    }
}
