package com.kapchik.cars;

import com.kapchik.engines.Engine;

public abstract class Car implements Movable {

    /** Название двигателя */
    private final Engine engine;
    /** Доступное количество бензина */
    int currentFuel;
    /** Текущая скорость */
    double currentSpeed;
    /** Текущая дистанция */
    double currentDistance;

    public Car(Engine engine, int currentFuel) {
        this.engine = engine;
        this.currentFuel = currentFuel;
        this.currentSpeed = 0;
        this.currentDistance = 0;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getCurrentDistance() {
        return currentDistance;
    }
}