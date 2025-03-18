package com.example.designpattern.observer;

public class Investor implements Observer{

    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Investor " + name + " received update: " + message);
    }
}
