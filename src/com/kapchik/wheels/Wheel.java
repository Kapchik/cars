package com.kapchik.wheels;

public abstract class Wheel {
    private final int radius;
    private final String name;

    public Wheel(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }
}