package com.kapchik.cars;

import com.kapchik.engines.Engine;

public abstract class Car implements CarInterface {
    private final Engine engine; //название
    private final int volumeOfFuelTank; //объем бензобака

    public Engine getEngine() {
        return engine;
    }

    public int getVolumeOfFuelTank() {
        return volumeOfFuelTank;
    }

    public Car(Engine engine, int volumeOfFuelTank) {
        this.engine = engine;
        this.volumeOfFuelTank = volumeOfFuelTank;
    }
}