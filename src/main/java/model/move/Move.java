package model.move;

/**
 * Created by 100-15 on 23.05.2019.
 */
public class Move {
    private Position start;
    private Position end;

    public Move (String from, String to) {
        start = Position.valueOf(from);
        end = Position.valueOf(to);
    }

    public Position getStart() {
        return start;
    }

    public void setStart(Position start) {
        this.start = start;
    }

    public Position getEnd() {
        return end;
    }

    public void setEnd(Position end) {
        this.end = end;
    }


}
