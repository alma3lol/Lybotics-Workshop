package Workshop;

public interface IRobot {
    boolean getCanMove();
    boolean getHaveWheels();
    boolean getHaveLegs();
    boolean getHaveWings();
    boolean getHaveHands();
    void setCanMove(boolean canMove);
    void setHaveWheels(boolean haveWheels);
    void setHaveLegs(boolean haveLegs);
    void setHaveWings(boolean haveWings);
    void setHaveHands(boolean haveHands);
}
