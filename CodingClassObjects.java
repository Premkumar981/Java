class Car {
    // Properties
    String model;
    int mfgYear;
    int kmsDriven;
    boolean is_on;

    // Methods
    void turnOn() {
        is_on = true;
        System.out.println("Car is turned on now.");
    }

    void turnOff() {
        is_on = false;
        System.out.println("Car is turned off now.");
    }

    void moveForward() {
        if(is_on == false) {
            System.out.println("Start the car first!");
            return;
        }
        System.out.println("Going forward in full speed.");
    }

    void moveBackward() {
        if(is_on == false) {
            System.out.println("Start the car first!");
            return;
        }
        System.out.println("Going Backward carefully.");
    }

    void stop() {
        System.out.println("On a pause, right now.");
    }

    int age(int curYear) {
        return curYear - mfgYear;
    }
}

class Main {
    public static void main(String[] args) {
        // you code goes here
        Car shahrukhCreta = new Car();
        System.out.println(shahrukhCreta);

        // Accessing properties of shahrukhCreta
        shahrukhCreta.mfgYear = 2018;
        shahrukhCreta.kmsDriven = 60000;
        shahrukhCreta.model = "Creta SX";

        System.out.println(shahrukhCreta.age(2024));
        System.out.println(shahrukhCreta.kmsDriven);

        shahrukhCreta.moveForward();
        shahrukhCreta.turnOn();
        shahrukhCreta.moveForward();
        shahrukhCreta.stop();
        shahrukhCreta.turnOff();

        shahrukhCreta.kmsDriven += 3;
        System.out.println(shahrukhCreta.kmsDriven);
    }
}