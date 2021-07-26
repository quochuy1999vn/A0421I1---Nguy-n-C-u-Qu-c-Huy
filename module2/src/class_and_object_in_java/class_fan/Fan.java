package class_and_object_in_java.class_fan;

public class Fan {
    int slow = 1;
    int medium = 2;
    int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public void setSlow(int slow) {
        this.slow = slow;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public void setFast(int fast) {
        this.fast = fast;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        if (isOn()) {
            return  "Speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius() + " fan is on";
        }else {
            return  "Speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius() + " fan is off";
        }
    }
}
