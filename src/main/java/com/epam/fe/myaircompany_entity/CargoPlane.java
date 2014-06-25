package com.epam.fe.myaircompany_entity;

public class CargoPlane extends AirCraft {

    private int capacity;                                   //грузоподъёмность


    public CargoPlane(String name, int rangeflight, int flightspeed, int capacity) {
        super(name, rangeflight, flightspeed);
        this.capacity = capacity;
    }

    public CargoPlane() {
        CargoPlane tu = new CargoPlane("TU330",2000,1500,3500);
    }


    public int getCapacityity() {
        return capacity;
    }

    public void setCapacity(int capasity) {
        this.capacity = capacity;
    }


}
