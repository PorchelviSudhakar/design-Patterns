package org.example.creational.abstractFactory;

public class AbstractVehicleFactory {

    public VehicleFactory createVehicleFactoryObject(String type){

        if(type.equals("Two Wheeler")){
            return new TwoWheelerFactory();
        }else if(type.equals("Four Wheeler")){
            return new FourWheelerFactory();
        }

        return null;

    }
}
