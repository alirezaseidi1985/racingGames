package org.fasttrackit;
//inheriance or "is-a" relationship
public class AutuVehicle extends Vehicle {




    Engine engine;
    boolean running;

    public AutuVehicle(Engine engine) {
        this.engine = engine;
    }
}
