package model.board;

import model.move.Position;
import model.piece.Piece;

import static model.piece.PieceColor.*;
import static model.piece.PieceType.*;

/**
 * Created by 100-15 on 20.05.2019.
 */
public class ChessBoard {
    private Piece[][] board = defaultPieceComposition();

    public Piece[][] getBoard() {
        return board;
    }

    public ChessBoard() {
        this.board = board;
    }

    public void setPiece(Position position, Piece piece) {
        board[position.getY()][position.getX()] = piece;
    }


    public Piece getPiece(Position position) {
        return board[position.getY()][position.getX()];
    }

    public static ChessBoard withDefaultPieceSetup() {
        ChessBoard board = new ChessBoard();
        board.board = defaultPieceComposition();
        return board;

    }

    private static Piece[][] defaultPieceComposition() {
        Piece[] blacksFirstLine = new Piece[]{new Piece(ROOK, BLACK), new Piece(KNIGTH, BLACK), new Piece(BISHOP, BLACK), new Piece(KING, BLACK), new Piece(QUEEN, BLACK), new Piece(BISHOP, BLACK), new Piece(KNIGTH, BLACK), new Piece(ROOK, BLACK)};
        Piece[] blacksSecondLine = {new Piece(PAWN, BLACK), new Piece(PAWN, BLACK), new Piece(PAWN, BLACK), new Piece(PAWN, BLACK), new Piece(PAWN, BLACK), new Piece(PAWN, BLACK), new Piece(PAWN, BLACK), new Piece(PAWN, BLACK)};
        Piece[] whitesFirstLine = {new Piece(ROOK, WHITE), new Piece(KNIGTH, WHITE), new Piece(BISHOP, WHITE), new Piece(KING, WHITE), new Piece(QUEEN, WHITE), new Piece(BISHOP, WHITE), new Piece(KNIGTH, WHITE), new Piece(ROOK, WHITE)};
        Piece[] whitesSecondLine = {new Piece(PAWN, WHITE), new Piece(PAWN, WHITE), new Piece(PAWN, WHITE), new Piece(PAWN, WHITE), new Piece(PAWN, WHITE), new Piece(PAWN, WHITE), new Piece(PAWN, WHITE), new Piece(PAWN, WHITE)};

        Piece[][] board = new Piece[8][8];
        board[0] = blacksFirstLine;
        board[1] = blacksSecondLine;
        board[6] = whitesSecondLine;
        board[7] = whitesFirstLine;
        return board;
    }
}
