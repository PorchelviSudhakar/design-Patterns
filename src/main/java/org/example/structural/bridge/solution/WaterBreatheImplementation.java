package org.example.structural.bridge.solution;

public class WaterBreatheImplementation implements BreatheImplementor{
    @Override
    public void breathe() {
        //Breathe through Fin
        //Inhales Oxygen
        //Exhales CO2


        System.out.println("Breathe through Fins");
        System.out.println("Inhales O2");
        System.out.println("Exhales CO2");
    }
}
