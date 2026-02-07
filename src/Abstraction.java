abstract class Vehicle {

    // abstract method (no body)
    abstract void start();

    // concrete method
    void fuelType() {
        System.out.println("Vehicle uses fuel");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with kick or self");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        v1.start();
        v1.fuelType();

        Vehicle v2 = new Bike();
        v2.start();
        v2.fuelType();
    }
}
