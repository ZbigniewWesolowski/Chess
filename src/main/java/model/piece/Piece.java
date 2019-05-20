package model.piece;

/**
 * Created by 100-15 on 20.05.2019.
 */
public class Piece {
    private PieceType type;
    private PieceColor color;

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }

    public PieceColor getColor() {
        return color;
    }

    public void setColor(PieceColor color) {
        this.color = color;
    }

    public Piece(PieceType type, PieceColor color) {

        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "type=" + type +
                ", color=" + color +
                '}';
    }
}
