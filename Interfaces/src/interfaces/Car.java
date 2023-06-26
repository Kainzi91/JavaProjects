package interfaces;

public class Car implements Driveable, Colorable {
        private int speed;
        private String color;

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    @Override
        public int maxSpeed() {
            return 140;
        }

    @Override
    public String getColor() {
        return color;
    }
}
