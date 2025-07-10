package com.skanda;

public class FareCalculator {
    public static int calculateFare(int distanceInKm) {
        int baseFare = 100;
        return baseFare + Math.max(0, (distanceInKm - 5) * 10);
    }
}
