class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating.");
    }

    void brake() {
        System.out.println("Car is braking.");
    }
}

// Grandchild class inheriting from Car
class SportsCar extends Car {
    void boost() {
        System.out.println("Sports car is boosting.");
    }
}

// Main class to demonstrate multilevel inheritance
public class VehicleDemo {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();

        // Accessing methods from the Vehicle class
        sportsCar.start();  // Inherited from Vehicle
        sportsCar.stop();   // Inherited from Vehicle

        // Accessing methods from the Car class
        sportsCar.accelerate();  // Inherited from Car
        sportsCar.brake();       // Inherited from Car

        // Accessing methods from the SportsCar class
        sportsCar.boost();  // Defined in SportsCar
    }
}
