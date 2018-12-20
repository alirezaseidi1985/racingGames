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
        Car.name = "Dacia";
        Car.color = "white";
        Car.doorCount = 4;
        Car.mileage = 7.5;
        Car.running = true;
        system.out.printIn(car.getName());

       double carTraveledDistance = Car.accelerate(100, 2);






        System.out.println("Hello");
        System.out.println(Car.toString());



        Car.engine = engine;

        Car.engine.manufacturer = "BMW";

        engine = null;


        Car.engine = new Engine();

        Car car2 = new Car(engine);
        car2.name = "sfa";

        Engine engine1 = new Engine();




    }
}
