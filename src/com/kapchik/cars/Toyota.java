package com.kapchik.cars;

import com.kapchik.engines.EJ7;
import com.kapchik.engines.EngineIsBroken;

public class Toyota extends Car {
    public Toyota() {
        super(new EJ7(), 16);
    }

    @Override
    public String toString() {
        return "Toyota";
    }

    @Override
    public void move() {
        int distance; //расстояние
        int speed; //текущая скорость
        int availableFuel; //доступное топливо

        distance = 0;
        speed = 0;
        availableFuel = getVolumeOfFuelTank();

        System.out.println("Movement begun");
        try {
            while (availableFuel > 0) {
                if (speed < getEngine().getMaxSpeed()) {
                    speed += getEngine().getBoost();
                } else {
                    speed = getEngine().getMaxSpeed();
                }

                distance += speed * 1;

                availableFuel = getVolumeOfFuelTank() - (getEngine().getFuelConsumption() * distance) / 100;

                System.out.println("Speed = " + speed + "; Distance = " + distance + "; AvailableFuel = " + availableFuel + ".");

                getEngine().checkEngine();
            }
            System.out.println("Gasoline is end.");
        } catch (EngineIsBroken engineIsBroken) {
            System.out.println("Engine is broken.");
        } finally {
            stop();
        }
    }

    @Override
    public void stop() {
        System.out.println("Car is stoped.");
    }
}