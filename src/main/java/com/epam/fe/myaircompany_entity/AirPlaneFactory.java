package com.epam.fe.myaircompany_entity;


import java.util.*;


public class AirPlaneFactory {
    private void filling() {

        Random r = new Random();
        Set plane = new Set() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public T[] toArray(Object[] a) {
                return new T[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        };
        for (int i = 0; i < 20 ; i++) {
            switch (r.nextInt(6)){
                case 0: plane.add();
                    break;
                case 1: plane.add();
                    break;
                case 2: plane.add();
                    break;
                case 3: plane.add();
                    break;
                case 4: plane.add();
                    break;
                case 5: plane.add();
                    break;
                case 6: plane.add();
                    break;

            }



        }


    }



    }


