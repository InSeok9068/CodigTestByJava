package 코딩인터뷰완전분석.Ch_07._Object_Oriented_Design.Q7_10_Minesweeper;

public class Question {
    public static void main(String[] args) {
        Game game = new Game(7, 7, 3);
        game.initialize();
        game.start();
    }

}
