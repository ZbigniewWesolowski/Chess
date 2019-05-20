package model.board;

import model.piece.Piece;

/**
 * Created by 100-15 on 20.05.2019.
 */
public class ChessBoard {
    private Piece[] [] board = defaultPieceComposition();
    public Piece[][] getBoard() {
        return board;
    }
    public ChessBoard() {
        this.board = board;
    }

}
