package model;

import model.piece.PieceColor;

/**
 * Created by 100-15 on 23.05.2019.
 */
public class Player {
    String name;
    PieceColor color;

    public Player(String name, PieceColor color) {
        this.name = name;
        this.color = color;
    }
}
