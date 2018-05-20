package com.kapchik.cars;

import com.kapchik.engines.Engine;

public abstract class Car implements Movable {

    /** Название */
    private final Engine engine; //название
    /** Объем бензобака */
    private final int volumeOfFuelTank; //объем бензобака

    public Car(Engine engine, int volumeOfFuelTank) {
        this.engine = engine;
        this.volumeOfFuelTank = volumeOfFuelTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getVolumeOfFuelTank() {
        return volumeOfFuelTank;
    }
}