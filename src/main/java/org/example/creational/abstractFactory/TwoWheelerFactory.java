package org.example.creational.abstractFactory;

public class TwoWheelerFactory extends VehicleFactory{


    public Vehicle createVehicleObject(int price){
        if(price >= 100000){
            return new RoyalEnfield();
        }else if(price < 100000){
            return new Honda();
        }
     return null;
    }
}
