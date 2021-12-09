package Workshop.Robots;

import Workshop.Robot;

public class TableMover extends Robot {
    public TableMover() {
        super(true, false, true, false, true);
    }

    @Override
    public String printMessage() {
        return "Hi, I'm a mover. I move tables from A to B.";
    }
}
