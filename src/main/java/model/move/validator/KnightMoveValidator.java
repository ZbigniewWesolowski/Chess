package model.move.validator;

import model.board.ChessBoard;
import model.move.Move;

/**
 * Created by 100-15 on 27.06.2019.
 */
public class KnightMoveValidator implements MoveValidatorFactory {
    public boolean isValid (Move move, ChessBoard chessBoard) {
        if (!((Math.abs(move.horizontalShift()) == 2 ) && (Math.abs(move.verticalShift())) == 1)
        || ((Math.abs(move.horizontalShift()) == 1) && (Math.abs((move.verticalShift())) == 2))) {
            return false;
        }
        return true;
    }
}
