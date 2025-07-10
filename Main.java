package com.skanda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cont = "yes";

        System.out.println("Welcome to Skanda Cab Booking Console");

        while (cont.equalsIgnoreCase("yes")) {
            System.out.print("Enter pickup location (A-F): ");
            char pickup = in.next().toUpperCase().charAt(0);

            System.out.print("Enter drop location (A-F): ");
            char drop = in.next().toUpperCase().charAt(0);

            System.out.print("Enter pickup time (in 24hr format): ");
            int pickTime = in.nextInt();

            Cab bookedCab = DriverService.selectDriver(pickup, drop, pickTime);

            if (bookedCab == null) {
                System.out.println("❌ No cabs available for the selected time.");
            } else {
                String lastRide = bookedCab.getLastRide();
                System.out.println("✅ Cab " + bookedCab.getId() + " booked. " + lastRide);
            }

            System.out.println("\n📊 Ride Summary:");
            for (Cab c : CabDB.getAllCabs()) {
                System.out.println("Cab " + c.getId() + " - Total Earnings: ₹" + c.getTotalFare());
                for (String log : c.getRideHistory()) {
                    System.out.println("  " + log);
                }
            }

            System.out.print("\nBook another ride? (yes/no): ");
            cont = in.next();
        }

        System.out.println("Thanks for using Skanda Cabs!");
        in.close();
    }
}
