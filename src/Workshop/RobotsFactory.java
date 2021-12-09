package Workshop;

import Workshop.Robots.*;

public class RobotsFactory {
    private RobotsFactory() {}
    public static Robot make(RobotType robot) {
        switch (robot) {
            case FLIGHT:
                return new Flight();
            case DRONE:
                return new Drone();
            case MOVER:
                return new TableMover();
            case HOLDER:
                return new CupHolder();
            case WALKER:
                return new Walker();
            case RUNNER:
                return new CarToy();
            default:
                return new IronMan();
        }
    }
}
