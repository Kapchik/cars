package com.kapchik;

import com.kapchik.cars.Car;
import com.kapchik.cars.Toyota;

public class Main {

    public static void main(String[] args) {

        Car car = new Toyota();
        System.out.println("Test new car " + car.toString() + " with engine " + car.getEngine().getName() + ":");
        car.move();
    }
}
