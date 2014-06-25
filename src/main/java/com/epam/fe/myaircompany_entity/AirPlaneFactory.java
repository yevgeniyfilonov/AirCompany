package com.epam.fe.myaircompany_entity;


public class AirPlaneFactory implements EngineryFactory{


    @Override
    public CargoPlane createCargoplane() {
        return new CargoPlane();
    }

    @Override
    public PassengerPlane createPassengerplane() {
        return new PassengerPlane();
    }
}





