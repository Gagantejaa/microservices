package com.InterfaceSegregationPrinciple.ISP;

public class BikeParkingLot implements BikeParking {
    @Override
    public void park() {
        System.out.println("Bike parked.");
    }

    @Override
    public void unpark() {
        System.out.println("Bike unparked.");
    }

    @Override
    public void provideHelmetLocker() {
        System.out.println("Helmet locker provided.");
    }
}

