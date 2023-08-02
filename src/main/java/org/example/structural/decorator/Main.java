package org.example.structural.decorator;

public class Main {

    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new VegDelight());
        System.out.println("Pizza Price "+pizza.cost()+"Rs");
    }
}
