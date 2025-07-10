package com.skanda;

import java.util.ArrayList;
import java.util.List;

public class Cab {
    private char id;
    private char location = 'A';
    private int freeAt = 0;
    private int totalFare = 0;
    private List<String> rideHistory = new ArrayList<>();

    public Cab(char id) {
        this.id = id;
    }

    public char getId() {
        return id;
    }

    public char getLocation() {
        return location;
    }

    public void setLocation(char location) {
        this.location = location;
    }

    public int getFreeAt() {
        return freeAt;
    }

    public void setFreeAt(int freeAt) {
        this.freeAt = freeAt;
    }

    public int getTotalFare() {
        return totalFare;
    }

    public void addFare(int fare) {
        this.totalFare += fare;
    }

    public List<String> getRideHistory() {
        return rideHistory;
    }

    public void addRide(String rideDetails) {
        rideHistory.add(rideDetails);
    }

    public String getLastRide() {
        if (rideHistory.isEmpty()) return "No rides yet.";
        return rideHistory.get(rideHistory.size() - 1);
    }
}
