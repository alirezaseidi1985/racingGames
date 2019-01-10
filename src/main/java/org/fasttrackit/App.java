package org.fasttrackit;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;
        engine.expiryDate = LocalDateTime.now().plusYears(10);

        Car car = new Car(engine);
        car.setColor("white");
        car.setName("Dacia");
        car.name = "Dacia";
        car.doorCount = 4;
       car.setMileage(7.5);
        car.running = true;
        System.out.println(car.getName());

       double carTraveledDistance = car.accelerate(100, 2);






        System.out.println("Hello");
        System.out.println();



        car.engine = engine;

        car.engine.manufacturer = "BMW";

        engine = null;


        car.engine = new Engine();

        Car car2 = new Car(engine);

        Engine engine1 = new Engine();

Vehicle vehicle1 = new Vehicle();
vehicle1. = 1;

Vehicle vehicle2 = new Vehicle();
vehicle2.vehicleCount = 2;

Vehicle.vehicle3 = new vehicle



    }
}
