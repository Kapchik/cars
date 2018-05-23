package com.kapchik.engines;

import java.util.Random;

public abstract class Engine {
    /** Название двигателя */
    private final String name;
    /** Максимальная скорость (км/ч) */
    private final int maxSpeed;
    /** Ускорение (км/ч^2) */
    private final int boost;
    /** Расход топлива на 100 км */
    private final int FUEL_CONSUMPTION;
    /** Ресурс работы (км) */
    private final int LIFE_TIME;
    /** Коэффициент надежности двигателя */
    private final double COEF_OF_RELIABILITY;

    public Engine(String name, int maxSpeed, int boost, int FUEL_CONSUMPTION, int LIFE_TIME) {
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.boost = boost;
        this.FUEL_CONSUMPTION = FUEL_CONSUMPTION;
        this.COEF_OF_RELIABILITY = 0.5 + new Random().nextDouble() * 0.5;
        this.LIFE_TIME = LIFE_TIME;
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

    public int getFUEL_CONSUMPTION() {
        return FUEL_CONSUMPTION;
    }

    public int getLIFE_TIME() {
        return LIFE_TIME;
    }

    public double getCOEF_OF_RELIABILITY() {
        return COEF_OF_RELIABILITY;
    }
}