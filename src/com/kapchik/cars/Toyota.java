package com.kapchik.cars;

import com.kapchik.engines.EJ7;
import com.kapchik.engines.EngineBrokenException;

public class Toyota extends Car {

    /** Время с начала движения (ч)*/
    private double currentTime;
    /** Текущий износ двигателя (%) */
    private double engineWear;

    public Toyota(int currentFuel) {
        super(new EJ7(), currentFuel);
        this.currentTime = 0;
        this.engineWear = 0;
    }

    @Override
    public void move() throws EngineBrokenException{

        /* т.к. расход на 100 км const, всегда будет пройдено одно и тоже расстояние за 1л топлива */
        final double DISTANCE = 100. / getEngine().getFUEL_CONSUMPTION();
        /** Скорость на момент начала движения */
        double previousSpeed = this.currentSpeed;

        this.currentDistance += DISTANCE;

        this.currentSpeed = Math.sqrt(2 * getEngine().getBoost() * DISTANCE + Math.pow(currentSpeed, 2));

        if (currentSpeed > getEngine().getMaxSpeed()) {
            this.currentSpeed = getEngine().getMaxSpeed();
        }

        if (currentSpeed != previousSpeed) {
            this.currentTime += (currentSpeed - previousSpeed) / getEngine().getBoost();
        } else {
            this.currentTime += DISTANCE / currentSpeed;
        }

        this.engineWear = 100 * getCurrentDistance() / (getEngine().getLIFE_TIME() * getEngine().getCOEF_OF_RELIABILITY());

        if (engineWear > 100) {
            throw new EngineBrokenException();
        }
    }

    public void spendFuel() {
        this.currentFuel -= 1;
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped.");
    }

    public double getCurrentTime() {
        return currentTime;
    }

    public double getEngineWear() {
        return engineWear;
    }

    @Override
    public String toString() {
        return "Toyota";
    }

}