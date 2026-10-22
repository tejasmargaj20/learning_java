public class AbstractionExample {

    public static void main(String[] args) {

        Vehicle obj = new Car();
        obj.start();
        obj.displaytyres();

        Vehicle x = new Bike();
        x.start();
        x.displaytyres();

    }

}

abstract class Vehicle {

    int numOfTyres;

    void displaytyres() {

        System.out.println("Numbers of tyres are   " + numOfTyres);

    }

    abstract void start();
}

class Car extends Vehicle {

    void start() {
        numOfTyres = 4;

        System.out.println("Car starts with a key   ");
    }
}

class Bike extends Vehicle {

    void start() {

        numOfTyres = 2;

        System.out.println("Bike starts with a key ");
    }
}
