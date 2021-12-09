package Workshop.Robots;

import Workshop.Robot;

public class Drone extends Robot {
    public Drone() {
        super(true, false, false, true, false);
    }

    @Override
    public String printMessage() {
        return "Hi, I'm a drone. I stand in air and fly in all directions with ease.";
    }
}
