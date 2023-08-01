package org.example.structural.bridge.solution;

public class Human extends LivingThings{


    public Human(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
