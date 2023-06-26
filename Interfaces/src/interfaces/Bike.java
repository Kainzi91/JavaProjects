package interfaces;

public class Bike implements Driveable, Colorable {
    private int speed;
    private String color;

    public Bike(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    @Override
    public int maxSpeed() {
        return speed;
    }
    @Override
    public int driveInCity() {
        return  30;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
