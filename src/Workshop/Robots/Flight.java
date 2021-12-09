package Workshop.Robots;

import Workshop.Robot;

public class Flight extends Robot {
    public Flight() {
        super(true, false, false, true, false);
    }

    @Override
    public String printMessage() {
        return "Hi, I'm a flight. I fly in one direction. Forward. Tho, I can tilt right, left, up or down.";
    }
}
