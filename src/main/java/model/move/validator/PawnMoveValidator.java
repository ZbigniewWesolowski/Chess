package model.move.validator;

import model.board.ChessBoard;
import model.move.Move;

/**
 * Created by 100-15 on 23.05.2019.
 */
public class PawnMoveValidator implements MoveValidator {
    public boolean isValid(Move move, ChessBoard chessBoard) {
        if (move.isHorizontal() || move.isDiagonal()) {
            return false;
        }
        if (move.verticalShift() > 2) {
            return false;
        }
        return true;
    }
}


