package org.example.structural.bridge.solution;

public class Main {

    public static void main(String args[]){
        LivingThings humanBreathe = new Human(new LandBreatheImplementation());
        humanBreathe.breatheProcess();
    }
}
