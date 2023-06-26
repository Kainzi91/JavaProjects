import interfaces.Bike;
import interfaces.Car;
import interfaces.Colorable;
import interfaces.Driveable;

public class Main {
    public static void main(String[] args) {
        Driveable car = new Car(140, "Red");
        Colorable car2 = new Car(140, "Red");
        System.out.println(car.driveInCity());
        Driveable bike = new Bike(90, "Pipigelb");
        car2.getColor();
        Car car3 = (Car) car2;
        System.out.println(car3.maxSpeed());
//        car.getColor();
    }
}