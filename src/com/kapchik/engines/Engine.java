package com.kapchik.engines;

import java.util.Random;

public abstract class Engine {
    private final String name; //название
    private final int maxSpeed; //максимальная скорость
    private final int boost;  //ускорение км/мин
    private final int fuelConsumption; //расход топлива на 100 км

    public Engine(String name, int maxSpeed, int boost, int fuelConsumption) {
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.boost = boost;
        this.fuelConsumption = fuelConsumption;
    }

    public void checkEngine() throws EngineIsBroken {
        Random random = new Random();
        if (random.nextInt(15) == 5) {
            throw new EngineIsBroken();
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