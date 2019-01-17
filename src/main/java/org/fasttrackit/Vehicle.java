package org.fasttrackit;

public class Vehicle {
    public static int vehicleCount;

    private String name;
    private String color;
    private double mileage;
    boolean running;
    private double fuellevel;
    private double totalTraveledDistance;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", running=" + running +
                '}';
    }

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + "accelerated with" + speed + "km/h for" + durationInHours + "hours");
        double traveledDistance = speed * durationInHours;
        System.out.println("Traveled distance: " + traveledDistance);

        //same as: totalTravelDistance = totalTraveledDidtance = traveledDistance
        totalTraveledDistance += traveledDistance;
        System.out.println("total Travel distance: " + totalTraveledDistance);
        double spentFuel = traveledDistance * mileage ;
        fuellevel -= spentFuel;
        System.out.println("Remaining fuel: " + fuellevel);

        return traveledDistance;
    }



    public double accelerate(double speed) {
        return accelerate(speed, 1);


    }

    public double getFuellevel() {
        return fuellevel;
    }

    public void setFuellevel(double fuellevel) {
        this.fuellevel = fuellevel;
    }

    public double getTotalTraveledDistance() {
        return totalTraveledDistance;
    }

    public void setTotalTraveledDistance(double totalTraveledDistance) {
        this.totalTraveledDistance = totalTraveledDistance;
    }

    protected Vehicle clone() {
        Vehicle vehicle = new Vehicle();
        // copy properties from current object or simply call this.clone();
        return vehicle;
    }

}



