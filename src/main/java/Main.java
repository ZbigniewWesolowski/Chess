import controller.GameController;
import model.board.ChessBoard;
import model.move.Position;
import model.piece.Piece;
import view.ChessConsoleUtils;
import view.ConsoleChessGui;

/**
 * Created by 100-15 on 20.05.2019.
 */
public class Main {
    public static void main(String[] args) {
        ChessBoard board = ChessBoard.withDefaultPieceSetup();
        System.out.println(ChessConsoleUtils.boardToString(board));

        ConsoleChessGui gui = new ConsoleChessGui();
        GameController gameController = new GameController(gui);
        gameController.run();




    }
}
