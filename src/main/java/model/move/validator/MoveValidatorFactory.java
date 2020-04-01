package model.move.validator;

import model.piece.Piece;

/**
 * Created by 100-15 on 23.05.2019.
 */
public class MoveValidatorFactory {
public static MoveValidator getValidator (Piece piece) {
    switch (piece.getType()){
        case PAWN:
            return new PawnMoveValidator();
        case KING:
            return new KingMoveValidator();
        case ROOK:
            return new RookMoveValidator();
        case QUEEN:
            return new QueenMoveValidator();
        case BISHOP:
            return new BishopMoveValidator();
        case KNIGTH:
            return new KnightMoveValidator();
    }
    return null;

}
}
