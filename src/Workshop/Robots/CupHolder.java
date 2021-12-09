package Workshop.Robots;

import Workshop.Robot;

public class CupHolder extends Robot {
    public CupHolder() {
        super(false, false, false, false, true);
    }

    @Override
    public String printMessage() {
        return "Hi, I'm a cup holder. I hold cups.";
    }
}
