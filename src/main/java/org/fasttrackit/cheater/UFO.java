package org.fasttrackit.cheater;

import org.fasttrackit.Vehicle;


public class UFO extends Vehicle {

    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + "accelerated with" + speed + "km/h for" + durationInHours + "hours");
        double traveledDistance = 2 * speed * durationInHours;
        System.out.println("Traveled distance: " + traveledDistance);
        return traveledDistance;
    }

    public void concealcheating() {
        System.out.println();
    }

    // example of co-variant return type
    // example of extending access priveleges in overridden method
    @Override
    public UFO clone() {
        return new UFO();


    }
}
