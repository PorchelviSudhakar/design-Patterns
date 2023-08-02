package org.example.creational.abstractFactory;

public class Main {

    public static void main(String[] args) {
        AbstractVehicleFactory abstractVehicleFactory = new AbstractVehicleFactory();
        VehicleFactory twoWheelerVehicleFactory = abstractVehicleFactory.createVehicleFactoryObject("Two Wheeler");
        Vehicle twoWheeler = twoWheelerVehicleFactory.createVehicleObject(100000);
        System.out.println(twoWheeler.speed()+" Kmph");

    }
}
