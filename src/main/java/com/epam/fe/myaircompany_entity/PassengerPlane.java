package com.epam.fe.myaircompany_entity;

public class PassengerPlane extends AirCraft {

    private int passengerNumber;

    public PassengerPlane(String name, int rangeflight, int flightspeed, int passengerNumber) {
        super(name, rangeflight, flightspeed);
        this.passengerNumber = passengerNumber;

    }

    public PassengerPlane() {
        PassengerPlane il = new PassengerPlane("IL96",2000,1000,500);

    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
}

