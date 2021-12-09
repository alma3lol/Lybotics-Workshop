package Workshop.Robots;

import Workshop.Robot;

public class IronMan extends Robot {
    public IronMan() {
        super(true, false, true, true, true);

    }

    @Override
    public String printMessage() {
        return "Hi, I'm Tony Stark. You can call me Iron Man. This is Mark IV.";
    }
}
