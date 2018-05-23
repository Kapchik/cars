package com.kapchik;

import com.kapchik.cars.Car;
import com.kapchik.cars.Toyota;
import com.kapchik.engines.EngineBrokenException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int currentFuel = 0;

        System.out.print("Max volume of fuel tank is 40. Input the amount of fuel: ");

        while (currentFuel <= 0 || currentFuel > 40) {
            Scanner scanner = new Scanner(System.in);
            try {
                currentFuel = scanner.nextInt();

                if (currentFuel <= 0 || currentFuel > 40) {
                    throw new Exception();
                }

            } catch (Exception ex) {
                System.out.print("Incorrect value. Max volume of fuel tank is 40. Please, input the amount of fuel: ");
            }
        }

        Car car = new Toyota(currentFuel);

        System.out.println("Start testing new car " + car.toString() + " with engine " + car.getEngine().getNAME() + ":");

        System.out.println("Speed =   0,00 km/h; Distance =   0,00 km; Time = 00,0 min; Available fuel = " + car.getCurrentFuel() + " l; Engine wear =  0,0.");

        try {
            while (car.getCurrentFuel() > 0) {

                car.move();

                if (car instanceof Toyota) {
                    ((Toyota) car).spendFuel();
                }

                if (car instanceof Toyota) {
                    System.out.printf("Speed = %6.2f km/h; Distance = %6.2f km; Time = %4.1f min; Available fuel = %2d l; Engine wear = %4.1f.%n",
                            car.getCurrentSpeed(), car.getCurrentDistance(), ((Toyota) car).getCurrentTime() * 60,
                            car.getCurrentFuel(), ((Toyota)car).getEngineWear());
                }
            }
        } catch (EngineBrokenException ex) {
            System.out.println("Engine is broken.");
        } finally {
            car.stop();
        }
    }
}
