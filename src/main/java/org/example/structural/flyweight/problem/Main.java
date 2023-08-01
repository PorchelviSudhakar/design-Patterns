package org.example.structural.flyweight.problem;

public class Main {



    public static void main(String[] args) {
        int x=0;
        int y=0;
        for(int i=0;i<100;i++){
            Robot humanoidRobot = new Robot(x+i,y+i,"Humanoid",new Sprites());
        }

        for(int i=0;i<100;i++){
            Robot dogRobot = new  Robot(x+i,y+i,"Humanoid",new Sprites());
        }
    }
}
