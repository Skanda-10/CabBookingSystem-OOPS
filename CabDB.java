package com.skanda;

import java.util.ArrayList;
import java.util.List;

public class CabDB {
    private static final List<Cab> cabs = new ArrayList<>();

    static {
        for (int i = 0; i < 4; i++) {
            cabs.add(new Cab((char) ('A' + i)));
        }
    }

    public static List<Cab> getAllCabs() {
        return cabs;
    }
}