package org.example.structural.flyweight.solution;

import org.example.designPatterns.structural.flyweight.problem.Sprites;

public class DogRobot implements IRobot{

    String type;
    Sprites body;

    public DogRobot(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {

    }
}
