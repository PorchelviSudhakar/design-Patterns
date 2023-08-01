package org.example.structural.bridge.solution;

public abstract class LivingThings{
    BreatheImplementor breatheImplementor;
    public LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

     public abstract void breatheProcess();
}
