package org.example.structural.flyweight.solution;

public class Main {

    public static void main(String args[]){
        IRobot humanoidRobot = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot.display(1,1);

        IRobot dogRobot = RoboticFactory.createRobot("ROBOTICDOG");
        dogRobot.display(1,2);
    }
}
