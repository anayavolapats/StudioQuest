package com.example.ideaquest;

public class Scene {
    String description;
    public Scene[] choices;
    int score;
    public Scene(String des, int num, int sc){
        description = des;
        choices = new Scene[num];
        score = sc;
    }
}
