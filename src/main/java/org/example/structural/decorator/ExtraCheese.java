package org.example.structural.decorator;

public class ExtraCheese extends ToppingsDecorator{

    BasePizza pizza;

    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+ 20;
    }
}
