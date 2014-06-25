package com.epam.fe.myaircompany_entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class AirCompany extends AirPlaneFactory {


    private void fill() {

        Random r = new Random();
        Set plane = new HashSet();
        for (int i = 0; i < 20; i++) {
            switch (r.nextInt(5)) {
                case 0:
                    plane.add(createCargoplane());
                    break;
                case 1:
                    plane.add(createCargoplane());
                    break;
                case 2:
                    plane.add(createCargoplane());
                    break;
                case 3:
                    plane.add(createPassengerplane());
                    break;
                case 4:
                    plane.add(createPassengerplane());
                    break;
                case 5:
                    plane.add(createPassengerplane());
                    break;


            }


        }


    }

}

