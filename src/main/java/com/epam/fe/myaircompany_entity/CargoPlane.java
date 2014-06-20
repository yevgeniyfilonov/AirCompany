package com.epam.fe.myaircompany_entity;

public class CargoPlane extends AirCraft implements Cloneable {

    private int capacity;//грузоподъёмность

    public int getCapacityity() {
        return capacity;
    }

    public void setCapacity(int capasity) {
        this.capacity = capacity;
    }

    //создание объектов грузовых самолётов
    public void createCargoPlane() {
        CargoPlane an = new CargoPlane();
        CargoPlane tu = new CargoPlane();
        CargoPlane bmt = new CargoPlane();
//заполнение полей
        an.setName("An22");
        an.setRangeflight(1000);
        an.setFlightspeed(1200);
        an.setCapacity(2000);
        tu.setName("TU28");
        tu.setRangeflight(1200);
        tu.setFlightspeed(1000);
        tu.setCapacity(2100);
        bmt.setName("BM-T");
        bmt.setRangeflight(1100);
        bmt.setFlightspeed(1100);
        bmt.setCapacity(2500);

    }


}
