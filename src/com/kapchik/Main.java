package com.kapchik;

import com.kapchik.cars.Car;
import com.kapchik.cars.Lexus;
import com.kapchik.cars.Toyota;

public class Main {

    public static void main(String[] args) {

        Car toyota = new Toyota();
        Car lexus = new Lexus();

        System.out.println("toyota.getWheelName(): " + toyota.getWheelName());
        System.out.println("toyota.getWheelRadius(): " + toyota.getWheelRadius());

        System.out.println("lexus.getWheelName(): " + lexus.getWheelName());
        System.out.println("lexus.getWheelRadius(): " + lexus.getWheelRadius());
    }
}
