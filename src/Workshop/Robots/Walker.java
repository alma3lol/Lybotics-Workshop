package Workshop.Robots;

import Workshop.Robot;

public class Walker extends Robot {
    public Walker() {
        super(true, false, true, false, true);
    }

    @Override
    public String printMessage() {
        return "Hi, I'm a walker. I walk like a human.";
    }
}
