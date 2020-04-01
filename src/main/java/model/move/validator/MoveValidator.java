package model.move.validator;

import model.board.ChessBoard;
import model.move.Move;

public interface MoveValidator {
    boolean isValid(Move move, ChessBoard chessBoard);

}
