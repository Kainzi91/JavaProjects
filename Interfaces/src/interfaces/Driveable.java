package interfaces;

public interface Driveable {
    int maxSpeed();


    default int driveInCity() {
        System.out.println("Danke Jules");
        return 50;
    }
}
