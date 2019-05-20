package view;

/**
 * Created by 100-15 on 20.05.2019.
 */
public class ChessConsoleUtils {
public static String boardToString (Chessboard board) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 8; i++) {
        sb.append(8 - i).append(" ");
        for (int j = 0; j < 8; j++) {
            int backgroundBlockInt = j + i;
            String backgroundBlock = backgroundBlockInt % 2 == 0 ? "\u2592" : "\u2591";
            Piece currentPiece = board.getPiece(new Position(j, i));
            String pieceString = currentPiece == null ? backgroundBlock : pieceToUnicodeSymbol(currentPiece);
            sb.append(pieceString).append("|");

        }

        sb.append("\n");

    }
    sb.append("  a  b  c  d  e  f  g  h");
    return sb.toString();
}
    private static String pieceToUnicodeSymbol(Piece piece) {
        if (piece == null) return " ";
        switch (piece.getType()) {
            case KING:
                return piece.getColor().equals(PieceColor.BLACK) ? "\u265a" : "\u2654";
            case QUEEN:
                return piece.getColor().equals(PieceColor.BLACK) ? "\u265b" : "\u2655";
            case ROOK:
                return piece.getColor().equals(PieceColor.BLACK) ? "\u265c" : "\u2656";
            case BISHOP:
                return piece.getColor().equals(PieceColor.BLACK) ? "\u265d" : "\u2657";
            case KNIGTH:
                return piece.getColor().equals(PieceColor.BLACK) ? "\u265e" : "\u2658";
            case PAWN:
                return piece.getColor().equals(PieceColor.BLACK) ? "\u265f" : "\u2659";
            default:
                return "";
        }
    }


}
    }
}
}
