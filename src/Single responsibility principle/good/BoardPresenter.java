package good;

public class BoardPresenter {
    good.Board board;

    public BoardPresenter(good.Board board) {
        this.board = board;
    }

    public void displayBoard() {
        String formattedBoard = "";
        for (int i = 0; i < this.board.size*this.board.size; i++) {
            String borderOrNewline = "";
            if ((i+1) % board.size == 0) {
                borderOrNewline += "\n";
            }
            else {
                borderOrNewline += "|";
            }
            formattedBoard += board.spots.get(i);
            formattedBoard += borderOrNewline;
        }
        System.out.print(formattedBoard);
    }
}