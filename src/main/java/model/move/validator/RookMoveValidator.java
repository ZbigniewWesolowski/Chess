package model.move.validator;

import model.board.ChessBoard;
import model.move.Move;

/**
 * Created by 100-15 on 23.05.2019.
 */
public class RookMoveValidator implements MoveValidator {
    public boolean isValid(Move move, ChessBoard chessBoard) {
        if (move.isDiagonal()) {
            return false;
        }
        if (move.isHorizontal() && move.isVertical()) {
            return false;
        }
    return true;}
}

//Wieża porusza się po liniach pionowych i poziomych, w dowolnym kierunku, o dowolną liczbę niezajętych pól. Wieża bije bierkę przeciwnika, zajmując jej pole. Uczestniczy również wraz z królem w specyficznym ruchu, zwanym roszadą. Na pustej szachownicy niezależnie od miejsca wieża atakuje zawsze 14 pól.
