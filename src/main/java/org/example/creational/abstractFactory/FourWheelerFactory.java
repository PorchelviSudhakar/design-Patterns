package org.example.creational.abstractFactory;

public class FourWheelerFactory extends VehicleFactory{



    public Vehicle createVehicleObject(int price){
        if(price >= 4000000){
            return new BMW();
        }else if(price < 4000000){
            return new Ford();
        }
        return null;

    }
}
