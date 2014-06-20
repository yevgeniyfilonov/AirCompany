package com.epam.fe.myaircompany_entity;

//абстрактный класс для самолётов
public abstract class AirCraft {
    private String name;
    private int rangeflight;//поле дальность полёта
    private int flightspeed;//поле скорость

    protected AirCraft() {
        this.name = name;
        this.rangeflight = rangeflight;
        this.flightspeed = flightspeed;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRangeflight() {
        return rangeflight;
    }

    public void setRangeflight(int rangeflight) {
        this.rangeflight = rangeflight;
    }

    public int getFlightspeed() {
        return flightspeed;
    }

    public void setFlightspeed(int flightspeed) {
        this.flightspeed = flightspeed;
    }

}
