package Workshop.Robots;

import Workshop.*;

public class CarToy extends Robot {
    public CarToy() {
        super(true, true, false, false, false);
    }

    @Override
    public String printMessage() {
        return "Hi, I'm a car toy. I'm fun to play with.";
    }
}
