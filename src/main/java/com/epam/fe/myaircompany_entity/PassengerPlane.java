package com.epam.fe.myaircompany_entity;

public class PassengerPlane extends AirCraft {

    private  int passengerNumber;

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public PassengerPlane build(){
        return  new PassengerPlane(th is);
    }
    private PassengerPlane(PassengerPlane builder){
        passengerNumber = builder.passengerNumber;
        name= builder.name;
        rangeflight=builder.rangeflight;
        flightspeed=builder.flightspeed;

    }
    public static class Builder {
        private int passengerNumber;
        private String name = null;
        private int rangeflight = 0;//поле дальность полёта

        private int flightspeed = 0;//поле скорость

        public Builder(int passengerNumber, int getpassengerNumber) {
            this.passengerNumber = passengerNumber;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder rangeflight(int val) {
            rangeflight = val;
            return this;
        }
        public Builder flightspeed(int val) {
            flightspeed = val;
            return this;
        }
    }

}

