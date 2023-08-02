package org.example.creational.factory;

public class Main {

    public static void main(String args[]){
        Shape shape = new ShapeFactory().createShapeObject("Rectangle");
        shape.display();
    }
}
