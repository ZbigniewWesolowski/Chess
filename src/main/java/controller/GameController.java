package controller;

import model.Player;
import model.board.ChessBoard;
import model.move.Move;
import model.move.Position;
import model.move.validator.MoveValidatorFactory;
import model.piece.Piece;
import model.piece.PieceColor;
import view.ChessConsoleUtils;
import view.ConsoleChessGui;

import java.awt.*;

import static model.piece.PieceColor.BLACK;
import static model.piece.PieceColor.WHITE;

/**
 * Created by 100-15 on 23.05.2019.
 */
public class GameController {
    private ConsoleChessGui gui;
    ChessBoard board = new ChessBoard();

    public void run() {
        System.out.println(ChessConsoleUtils.boardToString(board));
        Player player1 = new Player("First", WHITE);
        Player player2 = new Player("Second", BLACK);
        int counter = 0;
        PieceColor currentColor = WHITE;
        while (true) {
            String moveString = gui.promptForMove();
            Move move = gui.splitMoveString(moveString);
            Position position = move.getStart();
            if ((board.getPiece(position).getColor().equals(currentColor))) {
                System.out.println("This is not your pawn!");
            }
            if (MoveValidatorFactory.getValidator(board.getPiece(position)).isValid(move, board)) {
                board.makeMove(move);
                currentColor = currentColor == BLACK ? WHITE : BLACK;
                System.out.println(currentColor);
            } else System.out.println("This move is not correct!");



        System.out.println(ChessConsoleUtils.boardToString(board));
    }

}

    Piece[][] tab = new Piece[8][8];


    public GameController(ConsoleChessGui gui) {
        this.gui = gui;
    }
}



