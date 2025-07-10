package com.skanda;

public class DriverService {
    public static Cab selectDriver(char pickup, char drop, int time) {
        int minDist = Integer.MAX_VALUE;
        Cab chosen = null;

        for (Cab cab : CabDB.getAllCabs()) {
            if (cab.getFreeAt() <= time) {
                int dist = Math.abs(cab.getLocation() - pickup);
                if (dist < minDist || (dist == minDist && cab.getTotalFare() < (chosen != null ? chosen.getTotalFare() : Integer.MAX_VALUE))) {
                    minDist = dist;
                    chosen = cab;
                }
            }
        }

        if (chosen != null) {
            int km = Math.abs(drop - pickup) * 15;
            int fare = FareCalculator.calculateFare(km);

            chosen.setLocation(drop);
            chosen.setFreeAt(time + Math.abs(pickup - drop));
            chosen.addFare(fare);
            chosen.addRide("From " + pickup + " to " + drop + " @ " + time + "hrs | Fare: ₹" + fare);
        }

        return chosen;
    }
}