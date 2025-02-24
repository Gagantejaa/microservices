package com.InterfaceSegregationPrinciple.ISP;

public class Test {
    public static void main(String[] args) {
        CarParking carLot = new CarParkingLot();
        carLot.park();
        carLot.payForParking();
        carLot.unpark();

        System.out.println();

        BikeParking bikeLot = new BikeParkingLot();
        bikeLot.park();
        bikeLot.provideHelmetLocker();
        bikeLot.unpark();
    }
}

