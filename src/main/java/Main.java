import model.board.ChessBoard;
import model.move.Position;
import model.piece.Piece;
import view.ChessConsoleUtils;

/**
 * Created by 100-15 on 20.05.2019.
 */
public class Main {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        System.out.println(ChessConsoleUtils.boardToString(board));



    }
}
