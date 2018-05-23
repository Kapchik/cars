package com.kapchik.cars;

import com.kapchik.engines.EngineBrokenException;

public interface Movable {

    /**
     * Начать движение
     */
    void move() throws EngineBrokenException;

    /**
     * Завершить движение
     */
    void stop();

}