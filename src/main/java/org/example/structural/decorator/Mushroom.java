package org.example.structural.decorator;

public class Mushroom extends ToppingsDecorator{


    BasePizza pizza;

    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost() + 30 ;
    }
}
