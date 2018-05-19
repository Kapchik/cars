package com.kapchik.cars;

import com.kapchik.wheels.Wheel;

public abstract class Car {
    private final Wheel wheel;

    public Car(Wheel wheel) {
        this.wheel = wheel;
    }

    public String getWheelName() {
        return wheel.getName();
    }

    public int getWheelRadius() {
        return wheel.getRadius();
    }

}