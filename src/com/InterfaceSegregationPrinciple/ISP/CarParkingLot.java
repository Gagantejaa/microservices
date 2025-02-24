package com.InterfaceSegregationPrinciple.ISP;

public class CarParkingLot implements CarParking {
    @Override
    public void park() {
        System.out.println("Car parked.");
    }

    @Override
    public void unpark() {
        System.out.println("Car unparked.");
    }

    @Override
    public void payForParking() {
        System.out.println("Car parking payment done.");
    }
}
