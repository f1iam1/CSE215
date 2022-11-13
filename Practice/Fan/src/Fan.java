public class Fan {
    final int SLOW = 1;
    final int Medium = 2;
    final int Fast = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;

    String color = "blue";

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    boolean getOn() {
        return on;
    }

    void setOn(boolean on) {
        this.on = on;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    Fan() {

    }

    public String toString() {
        if (on == true) {
            return "Fan -> Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        }

        return "Fan -> Color: " + color + ", Radius: " + radius + ", Fan is off";
    }
}
