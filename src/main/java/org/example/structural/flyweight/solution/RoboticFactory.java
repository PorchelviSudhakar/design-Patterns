package org.example.structural.flyweight.solution;

import org.example.designPatterns.structural.flyweight.solution.Sprites;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {

    private static Map<String,IRobot> roboticObjectCache = new HashMap<>();

    public static IRobot createRobot(String robotType){

        if(roboticObjectCache.containsKey(robotType)){
            return roboticObjectCache.get(robotType);
        }
        else{
            if(robotType.equals("Humanoid")){
                IRobot humanoidRobot = new HumanoidRobot(robotType,new Sprites());
                roboticObjectCache.put(robotType,humanoidRobot);
                return humanoidRobot;
            }else{
                IRobot dogRobot = new DogRobot(robotType,new Sprites());
                roboticObjectCache.put(robotType,dogRobot);
                return dogRobot;
            }
        }





    }
}
