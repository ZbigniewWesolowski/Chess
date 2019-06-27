package model.move;

/**
 * Created by 100-15 on 23.05.2019.
 */
public class Move {
    private Position start;
    private Position end;

    public Move(String from, String to) {
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

    public int verticalShift() {
        return end.getY() - start.getY();
    }

    public int horizontalShift() {
        return end.getX() - start.getX();
    }

    public int diagonalShift() {
        int xDelta = Math.abs(end.getX() - start.getX());
        int yDelta = Math.abs(end.getY() - start.getY());
        return xDelta == yDelta ? xDelta : 0;
    }

    public boolean isHorizontal () {
        int absHorizontalShift = Math.abs(horizontalShift());
        int absVerticalShift = Math.abs(verticalShift());
        return absHorizontalShift > 0 && absVerticalShift == 0;
    }

    public boolean isVertical () {
        int absHorizontalShift = Math.abs(horizontalShift());
        int absVerticalShift = Math.abs(verticalShift());
        return absHorizontalShift == 0 && absVerticalShift > 0;
    }
}

