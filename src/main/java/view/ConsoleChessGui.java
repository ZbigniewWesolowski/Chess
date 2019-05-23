package view;

import model.board.ChessBoard;
import model.move.Move;

import java.util.Scanner;

/**
 * Created by 100-15 on 23.05.2019.
 */
public class ConsoleChessGui {
    void displayBoard(ChessBoard board) {
        for (int i = 0; i < board.getBoard().length; i++) {
            System.out.println(board.getBoard().toString().charAt(i));
        }
    }
    public String promptForMove(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates in the following format: a5,b8 (No space between) ");
        String moveString = scanner.nextLine();
        return moveString;
    }

    public Move splitMoveString (String moveString) {
        String[] moveStrings = moveString.split(",");
        Move move = new Move(moveStrings[0], moveStrings[1]);
        return move;
    }



}
