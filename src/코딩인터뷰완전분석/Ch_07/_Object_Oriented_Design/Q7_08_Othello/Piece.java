package 코딩인터뷰완전분석.Ch_07._Object_Oriented_Design.Q7_08_Othello;

public class Piece {
    private Color color;

    public Piece(Color c) {
        color = c;
    }

    public void flip() {
        if (color == Color.Black) {
            color = Color.White;
        } else {
            color = Color.Black;
        }
    }

    public Color getColor() {
        return color;
    }
}
