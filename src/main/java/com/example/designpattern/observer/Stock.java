package com.example.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject{
    private String name;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyObservers("Stock " + name + " price changed to: " + newPrice);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
