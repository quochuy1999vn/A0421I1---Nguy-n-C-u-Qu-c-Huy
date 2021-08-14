package inheritance.bai_tap.classPoint_and_moveAblePoint;

public class MoveAblePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint() {
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    public float[] getSpeed() {
        return new float[] {getXSpeed(), getYSpeed()};
    }

    public String toString() {
        return super.toString() + ", Speed= " + getXSpeed() + "," +getYSpeed();
    }

    MoveAblePoint move() {
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }
}
