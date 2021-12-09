package Workshop;

public abstract class Robot implements  IRobot {
    private boolean _canMove;
    private boolean _haveWheels;
    private boolean _haveLegs;
    private boolean _haveWings;
    private boolean _haveHands;
    public Robot(boolean canMove, boolean haveWheels, boolean haveLegs, boolean haveWings, boolean haveHands) {
        this._canMove = canMove;
        this._haveWheels = haveWheels;
        this._haveLegs = haveLegs;
        this._haveWings = haveWings;
        this._haveHands = haveHands;
    }

    public abstract String printMessage();

    @Override
    public boolean getCanMove() {
        return this._canMove;
    }

    @Override
    public boolean getHaveWheels() {
        return this._haveWheels;
    }

    @Override
    public boolean getHaveLegs() {
        return this._haveLegs;
    }

    @Override
    public boolean getHaveWings() {
        return this._haveWings;
    }

    @Override
    public boolean getHaveHands() {
        return this._haveHands;
    }

    @Override
    public void setCanMove(boolean canMove) {
        this._canMove = canMove;
    }

    @Override
    public void setHaveWheels(boolean haveWheels) {
        this._haveWheels = haveWheels;
    }

    @Override
    public void setHaveLegs(boolean haveLegs) {
        this._haveLegs = haveLegs;
    }

    @Override
    public void setHaveWings(boolean haveWings) {
        this._haveWings = haveWings;
    }

    @Override
    public void setHaveHands(boolean haveHands) {
        this._haveHands = haveHands;
    }

}