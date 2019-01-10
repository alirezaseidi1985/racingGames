package org.fasttrackit;

import org.fasttrackit.cheater.UFO;

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
        System.out.println(car);

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
        vehicle1.vehicleCount = 1;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.vehicleCount = 2;

        Vehicle.vehicleCount = 3;

        System.out.println("Value from vehicle 1: " + vehicle1.vehicleCount);
        System.out.println("Value from vehicle 2: " + vehicle2.vehicleCount);
        System.out.println("Value from Vehicle class: " + Vehicle.vehicleCount);


        new AutuVehicle();

        new AutuVehicle(new Engine());


        vehicle1.accelerate (34.12);
        vehicle2.accelerate(130, 0.8);


        new UFO().accelerate(130, 0.8);
        // polymorphism (an obiect can take multiple forms)

        Vehicle ufo = new UFO();
        ufo.accelerate(200, 2);

        ((UFO) ufo).concealcheating();


    }
}