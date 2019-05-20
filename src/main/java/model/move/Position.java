package model.move;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 100-15 on 21.05.2019.
 */
public class Position {
    private int x, y;
    private static List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(8,7,6,5,4,3,2,1));
    private static List<Character> chars = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h'));

    public Position() {
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static Position valueOf (String positionString){
        Position position1 = new Position();
        int letterIndex = chars.indexOf(positionString.charAt(0));
        position1.setX(letterIndex);
        position1.setY(8-Integer.valueOf(positionString.substring(1,2))); // "A2"
        return position1;
    }
}
