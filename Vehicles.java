abstract class Vehicle {
    int numWheels;
    String make;
    String model;

    Vehicle() {
        System.out.println("Hello from Vehicle constructor");
    }

    Vehicle(String make, String model) {
        System.out.println("Hello from Vehicle constructor 2");
        this.make = make;
        this.model = model;
    }

    abstract String convertToString();
}

class Car extends Vehicle {
    boolean sunRoof;
    int numAirbags;
    int engineCapacity;
    int topSpeed;

    Car() {
        System.out.println("Hello from Car constructor");
    }

    Car(String make, String model, int engineCapacity) {
        super(make, model);
        System.out.println("Hello from Car constructor 2");
        this.engineCapacity = engineCapacity;
    }

    String convertToString() {
        System.out.println("Inside Car convertToString()");
        return "[" + this.make + " " + this.model + " -> " + this.topSpeed + "]"; // "[hyundai creta -> 185]"
    }
}

class Truck extends Vehicle {
    boolean covered;
    int volumeCapacity;
    int weightCapacity;
    int currentWeight;

    double getUtilisation() {
        return (currentWeight*100.0)/weightCapacity;
    }

    String convertToString() {
        System.out.println("Inside Truck convertToString()");
        return "[" + this.make + " " + this.model + " -> " + this.weightCapacity + "]"; // "[hyundai creta -> 185]"
    }
}

class Bus extends Vehicle {
    boolean ac;
    double rating;
    int numSeats;
    int seatsOccupied;

    double getUtilisation() {
        return (seatsOccupied*100.0)/numSeats;
    }

    String convertToString() {
        System.out.println("Inside Bus convertToString()");
        return "[" + this.make + " " + this.model + " -> " + this.numSeats + "]"; // "[hyundai creta -> 185]"
    }
}

public class Main {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle("Bajaj", "Vespa");
        // v.numWheels = 2;
        // System.out.println(v.convertToString());

        Car umeshCar = new Car("Kia", "Seltos", 1500);
        umeshCar.numAirbags = 2;
        umeshCar.sunRoof = true;
        umeshCar.numWheels = 4;
        umeshCar.topSpeed = 185;

        System.out.println(umeshCar.convertToString());
        System.out.println(umeshCar.make);
        System.out.println(umeshCar.numWheels);


        Bus adbdulBus = new Bus();
        adbdulBus.ac = true;
        adbdulBus.numSeats = 40;
        adbdulBus.seatsOccupied = 25;
        adbdulBus.make = "Volvo";
        adbdulBus.model = "EV4125";

        System.out.println(adbdulBus.getUtilisation());
        System.out.println(adbdulBus.convertToString());
    }
}