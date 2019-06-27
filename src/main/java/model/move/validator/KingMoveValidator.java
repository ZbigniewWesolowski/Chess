package model.move.validator;

import model.board.ChessBoard;
import model.move.Move;

/**
 * Created by 100-15 on 23.05.2019.
 */
public class KingMoveValidator implements MoveValidatorFactory {

    public boolean isValid(Move move, ChessBoard chessBoard) {
        if (Math.abs(move.verticalShift()) == 1 && move.horizontalShift() == 0) {
            return true;
        }
        if (Math.abs(move.horizontalShift()) == 1 && move.verticalShift() == 0) {
            return true;
        }
        if (Math.abs(move.diagonalShift()) == 1 && !move.isVertical() && !move.isHorizontal()) {
            return true;
        }
        return false;
    }
}


