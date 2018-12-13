package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Car Car = new Car();
        Car.name = "Dacia";
        Car.color = "white";
        Car.doorCount = 4;
        Car.mileage = 7.5;
        Car.running = true;
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;

        Car.engine = engine;

        Car.engine.manufacturer = "BMW";

        engine = null;


        Car.engine = new Engine();

        Car car2 = new Car();
        car2.name = "sfa";

    }
}
