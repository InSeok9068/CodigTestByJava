package 코딩인터뷰완전분석.Ch_07._Object_Oriented_Design.Q7_08_Othello;

public class Game {
    private final Player[] players;
    private static Game instance;
    private final Board board;
    private final int ROWS = 10;
    private final int COLUMNS = 10;

    private Game() {
        board = new Board(ROWS, COLUMNS);
        players = new Player[2];
        players[0] = new Player(Color.Black);
        players[1] = new Player(Color.White);
        Automator.getInstance().initialize(players); // used for testing
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public Board getBoard() {
        return board;
    }
}
