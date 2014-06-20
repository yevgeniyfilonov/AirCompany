package com.epam.fe.myaircompany_entity;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class AirPlaneFactory {

    public void createCargoPlane() {
        CargoPlane an = new CargoPlane();
        CargoPlane tu = new CargoPlane();
        CargoPlane bmt = new CargoPlane();

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

  /*  private void fill() {

        Random r = new Random();
        Set plane = new HashSet();
        for (int i = 0; i < 20; i++) {
            switch (r.nextInt(6)) {
                case 0:
                    plane.add(createCargoPlane(););
                    break;
                case 1:
                    plane.add();
                    break;
                case 2:
                    plane.add();
                    break;
                case 3:
                    plane.add();
                    break;
                case 4:
                    plane.add();
                    break;
                case 5:
                    plane.add();
                    break;
                case 6:
                    plane.add();
                    break;

            }


        }*/


    }





