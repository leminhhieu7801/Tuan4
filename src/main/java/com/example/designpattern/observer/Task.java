package com.example.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Task implements Subject{
    private String taskName;
    private String status;
    private List<Observer> observers = new ArrayList<>();

    public Task(String taskName) {
        this.taskName = taskName;
        this.status = "Pending";
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
        notifyObservers("Task " + taskName + " changed status to: " + newStatus);
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
