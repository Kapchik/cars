package com.kapchik.engines;

import java.util.Random;

public abstract class Engine {
    /** Название */
    private final String name;
    /** Максимальная скорость */
    private final int maxSpeed;
    /** Ускорение км/мин */
    private final int boost;
    /** Расход топлива на 100 км */
    private final int fuelConsumption;

    public Engine(String name, int maxSpeed, int boost, int fuelConsumption) {
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.boost = boost;
        this.fuelConsumption = fuelConsumption;
    }

    public void checkEngine() throws EngineBrokenException {
        Random random = new Random();
        if (random.nextInt(15) == 5) {
            throw new EngineBrokenException();
        }
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getBoost() {
        return boost;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}