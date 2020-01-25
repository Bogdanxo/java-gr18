package abstraction;

public class Truck extends Car {

    @Override
    public void start() {
        System.out.println("truck has started");
    }

    public void displayTruckLength() {
        System.out.println("truck is huge");
    }
}
