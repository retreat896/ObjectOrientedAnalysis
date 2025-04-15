package ConnectN.Game;

import java.util.Arrays;

/**
 * Class to hold the state of the game and operations on the game state
 * @author Doug
 */
public class ConnectN
{

    /**
     * The default number of rows
     * Set this to 6
     */
    private static final int DEFAULT_ROWS = 6;

    /**
     * The default number of columns
     * Set this to 7
     */
    private static final int DEFAULT_COLUMNS = 7;


    /**
     * The default number of chips in a row to win the game
     * Set this to 4
     */
    private static final int DEFAULT_WINNING_NUMBER = 4;

    /**
     * The number of rows in the game "board"
     */
    private int numberOfRows;

    /**
     * The number of columns in the game "board"
     */
    private int numberOfColumns;

    /**
     * The number of chips in a row needed to win the game
     */
    private int winningNumber;

    /**
     * The current player's turn
     */
    private int playerTurn = 1;

    /**
     * Two-dimensional array to represent the state of the game <br>
     * The rows start at index 0 at the top of the board <br>
     * The columns start at index 0 at the left of the board <br>
     * Cells contain values {0 = empty, 1 = player 1, 2 = player 2}
     */
    private int[][] gameState;


    public ConnectN()
    {
        numberOfRows = DEFAULT_ROWS;
        numberOfColumns = DEFAULT_COLUMNS;
        winningNumber = DEFAULT_WINNING_NUMBER;

        // implicitly initializes all elements to 0 values
        gameState = new int[numberOfRows][numberOfColumns];

    }

    public ConnectN(int numberOfRows, int numberOfColumns, int winningNumber)
    {
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
        this.winningNumber = winningNumber;

        // implicitly initializes all elements to 0 values
        gameState = new int[numberOfRows][numberOfColumns];

    }

    public int getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }

    public static class GameState{

        private int playerTurn;
        private int[][] gameState;

        public GameState(int playerTurn, int[][] gameState){
            this.playerTurn = playerTurn;
            this.gameState = gameState;
        }

    }

    protected GameState save(){
        int copyPlayerTurn = this.playerTurn;
        int [][] copyGameState = new int[numberOfRows][numberOfColumns];

        for(int i = 0; i < numberOfRows; i++){
            copyGameState[i] = Arrays.copyOf(gameState[i], numberOfColumns);
        }

        return new GameState(copyPlayerTurn, copyGameState);
    }

    protected void restore(GameState state){
        this.playerTurn = state.playerTurn;
        
        for(int i = 0; i < numberOfRows; i++){
            gameState[i] = Arrays.copyOf(state.gameState[i], numberOfColumns);
        }
    }

}
